package com.cg.xyz.service;

import com.cg.xyz.beans.Customer;
import com.cg.xyz.beans.Loan;
import com.cg.xyz.dao.ILoanDao;
import com.cg.xyz.dao.LoanDao;
import com.cg.xyz.exceptions.InvaliddetailsException;

public class LoanService implements ILoanService {
	ILoanDao dao=new LoanDao();
	
	
	public static int getcustId() {
		int custID = (int)(Math.random()*1000);
		return custID;
	}

	@Override
	public Loan applyLoan(Loan loan) {
		loan=dao.applyLoan(loan);
		return loan;
	}

	@Override
	public Customer validateCustomer(Customer customer) throws InvaliddetailsException {
		if(customer.getCustName()==" "||customer.getAddress()==" "||customer.getEmail()==" " )
			
			throw new InvaliddetailsException("invalid details");
		else
		return customer;
	}

	@Override
	public long insertCust(Customer cust) {
		try {
			validateCustomer(cust);
			Customer customer=dao.insertCust(cust);
			 long custid=customer.getCustId();
				return custid;
		} catch (InvaliddetailsException e) {
			System.out.println(e.getMessage());
		}
return 0;
	}


	@Override
	public double calculateEMI(double loanAmount, int duration) {
		double r=9.5;
		//double n=(double)duration;
		double emi=loanAmount*r*(1+r)*duration/((1+r)*duration-1);
		return emi;
	
}
}
