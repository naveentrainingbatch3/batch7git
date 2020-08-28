package module4;

public class BalanceCheck {

	private double balance;
	private int id;
	public BalanceCheck(int id) {
		
		this.id = id;
	}
	public void deposite(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)throws LowBalanceException
	{
		if(amount<=balance)
		{
			balance-=amount;
	}
		else
		{
	 double requirement=amount-balance;
	 throw new LowBalanceException(requirement);
		}
	}
	public double getBalance() {
		return balance;
	}
	
	public int getId() {
		return id;
	}
	
	
	
}
