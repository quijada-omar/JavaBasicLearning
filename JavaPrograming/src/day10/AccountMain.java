package day10;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAcc_no(1234);
		account.setName("John");
		account.setAmount(50000);
		
		int accno = account.getAcc_no();
		String name = account.getName();
		double amount = account.getAmount();
		
		System.out.println(accno+" "+name+" "+amount);
				
	}
}
