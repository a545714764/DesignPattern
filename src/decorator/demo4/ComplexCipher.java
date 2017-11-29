package decorator.demo4;

public class ComplexCipher extends CihperDecorator {

	public ComplexCipher(Cipher cipher) {
		super(cipher);
		// TODO Auto-generated constructor stub
	}
	
	public String encrypt(String plainText){
		String result = super.encrypt(plainText);
		result = reverse(result);
		return result;
	}

	private String reverse(String text) {
		String str="";
		for(int i =text.length();i>0;i--){
			str+=text.substring(i-1, i);
		}
		return str;
	}

}
