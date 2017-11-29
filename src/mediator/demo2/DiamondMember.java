package mediator.demo2;

public class DiamondMember extends Member {
	
	public DiamondMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("钻石会员发送信息:");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("钻石会员发送图片");
		chatroom.sendImage(name, to, image);
	}

}
