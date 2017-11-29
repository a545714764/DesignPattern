package flyweight.demo3;

import flyweight.demo3.DeviceFactory;
import flyweight.demo3.NetworkDevice;

/*
 * 享元模式实例3之共享网络设备(有外部状态)
 * 虽然网络设备可以共享,但是分配给每一个终端计算机的端口(Port)是不同的
 * 因此多台计算机虽然可以共享同一个网络设备,但必须使用不同的端口。可以将
 * 端口从网络设备中抽取出来作为外部状态,需要时再进行设置
 */
public class Client {
	public static void main(String[] args) {
		NetworkDevice nd1,nd2,nd3,nd4,nd5;
		DeviceFactory df = new DeviceFactory();
		
		nd1 = df.getNetworkDevice("cisco");
		nd1.use(new Port("1000"));
		
		nd2 = df.getNetworkDevice("cisco");
		nd2.use(new Port("1001"));
		
		nd3 = df.getNetworkDevice("cisco");
		nd3.use(new Port("1002"));
		
		nd4 = df.getNetworkDevice("tp");
		nd4.use(new Port("1003"));
		
		nd5 = df.getNetworkDevice("tp");
		nd5.use(new Port("1004"));
		
		System.out.println("Total Device:" + df.getTotalDevice());
		System.out.println("Total Terminal:"+ df.getTotalTerminal());
	}
}
