package module4;

public class LowBalanceException extends Exception {
	private double amount;

	public LowBalanceException(double amount) {

		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

}
