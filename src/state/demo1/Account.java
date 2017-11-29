package state.demo1;
//�����˻���������
public class Account {
	private AccountState state;
	private String owner;
	public Account(String owner,double init){
		this.owner = owner;
		this.state = new GreenState(init,this);
		System.out.println(this.owner+"��������ʼ���Ϊ" +init);
		System.out.println("-----------------");
	}
	
	public void setState(AccountState state){
		this.state = state;
	}
	
	public void deposit(double amount){
		System.out.println(this.owner + "���" + amount);
		state.deposit(amount);
		System.out.println("�������Ϊ"+ state.balance);
		System.out.println("�����˻�״̬Ϊ"+state.getClass().getName());
		System.out.println("---------------------------");
	}
	
	public void withdraw(double amount){
		System.out.println(this.owner+"ȡ��"+amount);
		state.withdraw(amount);
		System.out.println("�������Ϊ"+state.balance);
		System.out.println("�����˻�״̬Ϊ"+state.getClass().getName());
		System.out.println("---------------------------");
	}
}
