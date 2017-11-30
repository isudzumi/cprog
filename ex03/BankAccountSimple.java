import java.io.*;

class BankAccount{
	private double balance;

	public BankAccount(double  openingBalance)
	{
		balance = openingBalance;
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	public void display()
	{
		System.out.println("balance = " + balance);
	}
}

class BankAccountSimple
{
	public static void main(String[] args)
	{
		BankAccount Obama = new BankAccount(200.00);

		System.out.println();
		System.out.print("Before transactions: Obama's Account, " + "\t");
		Obama.display();

		Obama.deposit(148.7);
		Obama.withdraw(40.00);
		System.out.print("After transaction: Obama's Account, " + "\t");
		Obama.display();

		System.out.println();
		BankAccount Kan = new BankAccount(100.00);
		System.out.print("Before transactions: Kan's Account, " + "\t");
		Kan.display();

		Kan.deposit(74.35);
		Kan.withdraw(20.00);
		System.out.print("After transaction: Kan's Account, " + "\t");
		Kan.display();

		try {
			System.in.read();
		} catch( IOException e ){
		}

	}
}
