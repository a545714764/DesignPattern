package facade.demo1;

public class CipherMachine {
	public String encrypt(String plainText){
		System.out.println("数据加密，将明文转换为密文");
		String es ="";
		for(int i=0;i<plainText.length();i++){
			String c = String.valueOf(plainText.charAt(i)%7);
			es+=c;
		}
		return es;
	}

}
