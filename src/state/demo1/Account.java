package state.demo1;
//银行账户：环境类
public class Account {
	private AccountState state;
	private String owner;
	public Account(String owner,double init){
		this.owner = owner;
		this.state = new GreenState(init,this);
		System.out.println(this.owner+"开户，初始金额为" +init);
		System.out.println("-----------------");
	}
	
	public void setState(AccountState state){
		this.state = state;
	}
	
	public void deposit(double amount){
		System.out.println(this.owner + "存款" + amount);
		state.deposit(amount);
		System.out.println("现在余额为"+ state.balance);
		System.out.println("现在账户状态为"+state.getClass().getName());
		System.out.println("---------------------------");
	}
	
	public void withdraw(double amount){
		System.out.println(this.owner+"取款"+amount);
		state.withdraw(amount);
		System.out.println("现在余额为"+state.balance);
		System.out.println("现在账户状态为"+state.getClass().getName());
		System.out.println("---------------------------");
	}
}
