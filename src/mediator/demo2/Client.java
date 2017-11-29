package mediator.demo2;
/*
 * 中介者模式实例2之虚拟聊天室
 * 某论坛系统欲增加一个虚拟聊天室,允许论坛会员通过该聊天室进行信息交流,普通会员(CommonMemeber)可以给其他
 * 会员发送文本信息,钻石会员(DiamondMember)既可以给其他会员发送文本信息,还可以发送图片信息.该聊天室可以
 * 对不雅字符进行过滤,如"日"等字符;还可以对发送的图片大小进行控制.用中介者模式设计该虚拟聊天室
 */
public class Client {

	public static void main(String[] args) {
		AbstractChatroom happyChat = new ChatGroup();
		
		Member m1,m2,m3,m4,m5;
		m1 = new DiamondMember("张三");
		m2 = new DiamondMember("李四");
		m3 = new CommonMember("王五");
		m4 = new CommonMember("小芳");
		m5 = new CommonMember("小红");
		
		happyChat.register(m1);
		happyChat.register(m2);
		happyChat.register(m3);
		happyChat.register(m4);
		happyChat.register(m5);
		
		m1.sendText("李四", "李四,你好!");
		m2.sendText("张三", "张三,你好!");
		m1.sendText("李四", "今天天气不错,有日");
		m2.sendImage("张三", "一个很大很大的太阳!");
		m2.sendImage("张三", "太阳");
		m3.sendText("小芳", "还有问题吗?");
		m3.sendText("小红", "还有问题吗");
		m4.sendText("王五", "没有了,谢谢");
		m5.sendText("王五", "我也没有了");
		m5.sendImage("王五", "谢谢");
		

	}

}
