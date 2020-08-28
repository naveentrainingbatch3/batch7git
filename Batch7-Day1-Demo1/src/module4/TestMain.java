package module4;

public class TestMain {
public static void main(String[] args) {
	BalanceCheck bc=new BalanceCheck(121);
	System.out.println("Deposite 10000");
	bc.deposite(10000.00);
	System.out.println("Withdraw 50000");
	try {
	bc.withdraw(50000.00);
	System.out.println("Withdraw 70000");
	bc.withdraw(70000.00);
	}catch(LowBalanceException ex)
	{
		System.out.println("Sorry Insufficient Balance .You are short By Rs"+ex.getAmount());
	}
	
}
}
