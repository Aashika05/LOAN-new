package com.cg.xyz.ui;

import java.awt.DisplayMode;
import java.util.Scanner;
import com.cg.xyz.beans.Customer;
import com.cg.xyz.beans.Loan;
import com.cg.xyz.dao.ILoanDao;
import com.cg.xyz.dao.LoanDao;
import com.cg.xyz.service.ILoanService;
import com.cg.xyz.service.LoanService;

public class ExecuterMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ILoanService service=new LoanService();
	
		System.out.println("XYZ Finance Company Welcomes You!");
		while(true) {
			System.out.println("1. Register Customer");
			System.out.println("2.Exit");

			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter customer name");
				String custName=sc.next();
				System.out.println("Enter address");
				String address=sc.next();
				System.out.println("Enter email");
				String email=sc.next();
				System.out.println("Enter mobile No");
				long mobile=sc.nextLong();
	
				Customer cust=new Customer(custName,address,mobile,email);
				long custid=service.insertCust(cust);
				System.out.println("Customer info saved successfully");
				System.out.println("Your customer id is: "+custid);
				
				System.out.println("Do you wish to apply for loan, YES or NO ?");
				String choice1=sc.next();
		
				switch(choice1) {
				case "YES":
					System.out.println("Enter the loan amount");
					double loanAmount=sc.nextDouble();
					System.out.println("Enter the loan duration");
					int duration=sc.nextInt();
					double emi=service.calculateEMI(	loanAmount,duration);
					System.out.println("For loan amount "+ loanAmount+ "and "+ duration+ "Years duration Your emi per month will be "+ emi);
					System.out.println("Do you want to apply for loan now ? yes or no");
					String choice2=sc.next();
					switch(choice2) {
					case "yes":
						Loan loan=new Loan(loanAmount,duration);
						loan=service.applyLoan(loan);
						System.out.println("Your loan id:" +loan.getLoanID());
						break;
					}
					break;

				case "NO":
					System.out.println("Customer details"+cust);
					break;
				}
			case 2:System.out.println("EXIT");
			System.exit(0);
			}
		}
	}
}

