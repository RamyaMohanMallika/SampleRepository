package com;

import java.util.ArrayList;




public class BankCustomerArrayListRunner {
	
	
	     
	public static void main(String[] args) {

		BankCustomerArrayList cust1=new BankCustomerArrayList();
		cust1.setCustomerId(101);
		cust1.setName("AAA");
		cust1.setBalance(2000);
		cust1.setAccountType("Checking");
	
		BankCustomerArrayList cust2=new BankCustomerArrayList();
		cust2.setCustomerId(102);
		cust2.setName("BBB");
		cust2.setBalance(5000);
		cust2.setAccountType("Saving");
		
		BankCustomerArrayList cust3=new BankCustomerArrayList();
		cust3.setCustomerId(103);
		cust3.setName("CCC");
		cust3.setBalance(8000);
		cust3.setAccountType("Saving");
		
		
		BankCustomerArrayList cust4=new BankCustomerArrayList();
		cust4.setCustomerId(104);
		cust4.setName("DDD");
		cust4.setBalance(12000);
		cust4.setAccountType("Saving");
	
		
		BankCustomerArrayList cust5=new BankCustomerArrayList();
		cust5.setCustomerId(105);
		cust5.setName("EEE");
		cust5.setBalance(20000);
		cust5.setAccountType("Checking");
		
		ArrayList<BankCustomerArrayList> bank=new ArrayList<>();
		bank.add(cust1);
		bank.add(cust2);
		bank.add(cust3);
		bank.add(cust4);
		bank.add(cust5);
		
		
		
		System.out.println("Customers with more than 5000 in their account");
	bank.stream().filter(e->e.getBalance()>5000)
	.forEach(e->System.out.println(e.getName()+" "+ e.getBalance()));
		
		System.out.println("Names of all customers");
		bank.stream().forEach(e->System.out.println(e.getName()));
		
		System.out.println("Names of customers having saving account");
		bank.stream().filter(e->e.getAccountType().equals("Saving")).forEach(e->System.out.println(e.getName()+" "+e.getAccountType()));
	
		System.out.println("No of customers having saving account="+bank.stream()
		.filter(e->e.getAccountType().equals("Saving")).count()+"\n"+"No of customers having checking account="+bank.stream()
		.filter(e->e.getAccountType().equals("Checking")).count());
		
		
		Double sum=0.0;
		for(BankCustomerArrayList banks:bank)
		{
			sum+=banks.getBalance();
		}
		System.out.println("The total available balance in bank is"+sum);
		}
		
	
	}
	
	
	


