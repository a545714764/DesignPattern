package Singleton.demo2;

public class IdentityCardNo {
	private static IdentityCardNo instance = null;
	private String no;
	
	private IdentityCardNo(){};
	
	public static IdentityCardNo getInstance(){
		if(instance == null){
			System.out.println("第一次办理身份证,分配新号码!");
			instance = new IdentityCardNo();
			instance.setIdentitycardNo("No400004144141");
		}else{
			System.out.println("重复办理身份证,获取旧号码");
		}
		return instance;
	}
	
	public void setIdentitycardNo(String no){
		this.no = no;
	}
	
	public String getIdentityCardNo(){
		return this.no;
	}
}
