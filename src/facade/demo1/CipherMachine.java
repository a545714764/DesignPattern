package facade.demo1;

public class CipherMachine {
	public String encrypt(String plainText){
		System.out.println("���ݼ��ܣ�������ת��Ϊ����");
		String es ="";
		for(int i=0;i<plainText.length();i++){
			String c = String.valueOf(plainText.charAt(i)%7);
			es+=c;
		}
		return es;
	}

}
