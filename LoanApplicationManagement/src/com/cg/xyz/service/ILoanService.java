package com.cg.xyz.service;

import com.cg.xyz.beans.Customer;
import com.cg.xyz.beans.Loan;
import com.cg.xyz.exceptions.InvaliddetailsException;

public interface ILoanService {
	
  
		public Loan applyLoan(Loan loan);
		public Customer validateCustomer(Customer cust) throws InvaliddetailsException;
		public long insertCust(Customer cust);
		public double calculateEMI(double loanAmount,int duration);



}
