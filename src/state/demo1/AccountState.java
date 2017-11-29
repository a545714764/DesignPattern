package state.demo1;

public abstract class AccountState {
	protected Account acc;
	protected double balance;
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void stateCheck();
}
