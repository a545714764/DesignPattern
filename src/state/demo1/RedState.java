package state.demo1;

public class RedState extends AccountState {
	
	public  RedState(AccountState state) {
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
		System.out.println("�˻������ᣬȡ��ʧ��");

	}

	@Override
	public void stateCheck() {
		if(balance>=0){
			acc.setState(new GreenState(this));
		}else if(balance>=-1000){
			acc.setState(new YellowState(this));
		}

	}

}
