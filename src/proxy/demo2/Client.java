package proxy.demo2;
/*
 * 保护代理模式实例2之论坛权限控制代理
 * 在一个论坛中已注册用户和游客的权限不同,已注册的用户拥有发帖、修改自己的注册信息、修改自己的帖子等
 * 功能;而游客只能看到别人发的帖子,没有其他权限。使用代理模式来设计该权限管理模块。
 * 在本实例中我们使用代理模式中的保护代理，该代理用于控制对一个对象的访问，可以给不同的用户提供不同级
 * 别的使用权限
 */
public class Client {

	public static void main(String[] args) {
		AbstractPermission permission;
		permission = (AbstractPermission) XMLUtil.getBean();
		
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();
		System.out.println("--------------------");
		permission.setLevel(1);
		permission.modifyUserInfo();
		permission.viewNote();
		permission.publishNote();
		permission.modifyNote();

	}

}
