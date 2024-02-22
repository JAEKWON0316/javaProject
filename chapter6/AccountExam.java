package chapter6;

public class AccountExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		 account.setBalance(10000);
		 System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());    //ÇöÀç ÀÜ°í: 10000
		 account.setBalance(-100);
		 System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());   //ÇöÀç ÀÜ°í: 10000
	
		  account.setBalance(2000000);
		 System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());   //ÇöÀç ÀÜ°í: 10000
		  account.setBalance(300000);
		 System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());   //ÇöÀç ÀÜ°í: 300000
	
		 
	}

}
