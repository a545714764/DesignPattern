package mediator.demo2;

public class CommonMember extends Member {
	
	public CommonMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("普通会员发送信息:");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("普通会员不能发送图片");
	}

}
