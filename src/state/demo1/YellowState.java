package state.demo1;

public class YellowState extends AccountState {
	
	public  YellowState(AccountState state) {
		// TODO �Զ����ɵĹ��캯�����
		this.balance = state.balance;
		this.acc = state.acc;
	}
	
	
	@Override
	public void deposit(double amount) {
		// TODO �Զ����ɵķ������
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
