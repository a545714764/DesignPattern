package memento.demo2;
/*
 * 备忘录实例2之错误操作后恢复
 * 某系统提供了用户信息操作模块，用户可以修改自己的各项信息。为了使操作过程更加人性化，
 * 现使用备忘录模式对系统进行改进，使得用户在进行了错误操作之后可以恢复到操作之前的
 * 状态。
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfoDTO user = new UserInfoDTO();
		Caretaker c = new Caretaker();
		
		user.setAccount("zhangsan");
		user.setPassword("123456");
		user.setTelNo("12345678901");
		System.out.println("状态1：");
		user.show();
		c.setMemento(user.saveMemento());
		System.out.println("----------------------------");
		
		user.setPassword("11111111");
		user.setTelNo("15632541235");
		System.out.println("状态1：");
		user.show();
		System.out.println("------------------------");
		
		user.restoreMemento(c.getMemento());
		System.out.println("回到状态1：");
		user.show();
		System.out.println("-----------------------");

	}

}
