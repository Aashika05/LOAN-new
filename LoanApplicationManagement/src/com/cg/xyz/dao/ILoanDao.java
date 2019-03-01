package com.cg.xyz.dao;

import java.util.HashMap;
import java.util.Map;
import com.cg.xyz.beans.Customer;
import com.cg.xyz.beans.Loan;

public interface ILoanDao {
	 public Map<Integer,Customer>customerEntry=new HashMap<Integer,Customer>();
	 public Map<Integer,Loan>loanEntry=new HashMap<Integer,Loan>();
	
	public Loan applyLoan(Loan loan);
	public Customer insertCust(Customer cust);
	
	public int getCUST_ID();
	public int getLOAN_ID();

}