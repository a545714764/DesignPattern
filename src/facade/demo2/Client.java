package facade.demo2;
/*
 * 外观模式实例2之电源总开关
 * 现在考察一个电源总开关的例子,以便进一步说明外观模式。为了使用方便,一个电源总开关可以控制四盏灯、一个风扇、
 * 一台空调和一台电视机的启动和关闭。通过该电源总开关可以同时控制所有上述电器设备,使用外观模式设计该系统
 */
public class Client {

	public static void main(String[] args) {
		GeneralSwitchFacade gsf = new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------");
		gsf.off();
	}

}
