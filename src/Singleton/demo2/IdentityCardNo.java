package Singleton.demo2;

public class IdentityCardNo {
	private static IdentityCardNo instance = null;
	private String no;
	
	private IdentityCardNo(){};
	
	public static IdentityCardNo getInstance(){
		if(instance == null){
			System.out.println("��һ�ΰ������֤,�����º���!");
			instance = new IdentityCardNo();
			instance.setIdentitycardNo("No400004144141");
		}else{
			System.out.println("�ظ��������֤,��ȡ�ɺ���");
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
