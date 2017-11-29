package state.demo1;
/*
 * 状态模式
 * 在某银行系统中，我们定义了账户的三种状态：
 * (1)如果账户(Account)中余额(balance)大于等于0,此时账户的状态为绿色(GreenState)
 * 即正常状态,表示既可以向该账户存款(deposit)也可以从该账户取款(withdraw)
 * (2)如果账户中余额小于0，并且大于等于-1000，则账户的状态为黄色（YellowState)
 * 即欠费状态,此时既可以向该账户存款可以从该账户取款.
 * (3)如果账户中余额小于-1000,那么账户的状态为红色(RedState),即透支状态，此时用户
 * 只能想该账户存款，不能再从中取款。
 * 现用状态模式来实现状态的转化问题，用户只需要执行简单的存款和取款操作，系统根据余额数量
 * 自动转换到相应的状态
 */
public class Client {

	public static void main(String[] args) {
		Account acc =new Account("段誉", 5.0);
		acc.deposit(100);
		acc.withdraw(200);
		acc.deposit(1000);
		acc.withdraw(2000);
		acc.withdraw(100);

	}

}
