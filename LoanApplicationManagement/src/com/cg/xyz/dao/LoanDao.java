package com.cg.xyz.dao;
import java.util.Map;

import com.cg.xyz.beans.Customer;
import com.cg.xyz.beans.Loan;

public class LoanDao implements ILoanDao{

	@Override
	public Loan applyLoan(Loan loan) {
		loan.setLoanID(getLOAN_ID());
		loanEntry.put(getLOAN_ID(), loan);
		return loan;
	}
	@Override
	public Customer insertCust(Customer cust) {
		cust.setCustId(getCUST_ID());
		customerEntry.put(getCUST_ID(), cust);
		return cust;
	}

	public int getCUST_ID() {
		int custId= (int)(Math.random()*1000);
		return custId;
	}

	public int getLOAN_ID() {
		int loanId= (int)(Math.random()*1000);
		return loanId;

}
}