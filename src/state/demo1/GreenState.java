package state.demo1;

public class GreenState extends AccountState {
	
	public  GreenState(AccountState state) {
		// TODO 自动生成的构造函数存根
		this.balance = state.balance;
		this.acc = state.acc;
	}
	
	public GreenState(double balance,Account acc){
		this.balance = balance;
		this.acc = acc;
	}
	
	
	@Override
	public void deposit(double amount) {
		// TODO 自动生成的方法存根
		this.balance+=amount;
		stateCheck();

	}

	@Override
	public void withdraw(double amount) {
		this.balance-=amount;
		stateCheck();

	}

	@Override
	public void stateCheck() {
		if(balance>=-1000&&balance<0){
			acc.setState(new YellowState(this));
		}else if(balance<-1000){
			acc.setState(new RedState(this));
		}

	}

}
