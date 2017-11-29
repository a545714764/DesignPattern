package state.demo1;

public class YellowState extends AccountState {
	
	public  YellowState(AccountState state) {
		// TODO 自动生成的构造函数存根
		this.balance = state.balance;
		this.acc = state.acc;
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
		if(balance>=0){
			acc.setState(new GreenState(this));
		}else if(balance<-1000){
			acc.setState(new RedState(this));
		}

	}

}
