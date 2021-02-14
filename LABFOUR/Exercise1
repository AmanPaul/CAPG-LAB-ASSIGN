package labFour;

class Account{
	
	  protected int accNum; 
	  protected double balance;
	  

}	
class SavingsAccount extends Account{
	
	public SavingsAccount(double balance, int accNum)
	{
		{ if (balance > 100.0)
			 this.balance = balance; 
			 this.accNum=accNum; 
		}
	}
	
	public void deposit(double deposit)
	{
		if (deposit > 100.0)    
	          balance+=deposit; 
	       else
	       {
	    	   System.out.println("Please deposit money greater than 100");
	       }
	}
	
	public void withdraw(double withdraw)
	{
		   balance-=withdraw;
		   
		   if(balance<500)
		   {
			   balance+=withdraw;
			   System.out.println("\nCannot withdraw money: "+balance);
		   }
		   else
			   System.out.printf("\n%f Debited successfully from account%n%n",withdraw);
	}

	
}


class CurrentAccount extends Account{

public CurrentAccount(double balance, int accNum) { 
	  { 
		  if (balance > 100.0)
			  this.balance = balance; 
		  this.accNum=accNum; 
	  } 
}

	public void deposit(double deposit)
	{
		if (deposit > 100.0)    
	          balance+=deposit; 
	       else
	       {
	    	   System.out.println("Please deposit money greater than 100");
	       }
	}

public void withdraw(double withdraw) 
{ 
	  balance-=withdraw;

			System.out.printf("\n%f Debited successfully from account%n%n",withdraw); 
		}

}

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =new Person("Smith",34);
		SavingsAccount acc=new SavingsAccount(2000, 1001);
		System.out.println("Name:"+p.getName()+"\tAge:"+p.getAge());
		System.out.println("Acc Number:"+acc.accNum+"\tOriginal Acc Balance:"+acc.balance);
		acc.deposit(2000);
		acc.withdraw(1400);
		System.out.println("Updated Acc Balance:"+acc.balance+"\n");
		
		
		Person p1=new Person("Kathy",54);
		CurrentAccount acc1=new CurrentAccount(3000, 2002);
		System.out.println("Name:"+p1.getName()+"\tAge:"+p1.getAge());
		System.out.println("Acc Number:"+acc1.accNum+"\tOriginal Acc Balance:"+acc1.balance);
		acc1.withdraw(2000);
		acc1.withdraw(25000);
		acc1.deposit(18000);
		System.out.println("Updated Acc Balance:"+acc1.balance);

	}

}
