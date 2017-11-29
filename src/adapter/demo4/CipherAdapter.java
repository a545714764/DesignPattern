package adapter.demo4;

public class CipherAdapter extends DataOperation {
	private Caesar cipher;
	
	public  CipherAdapter() {
		// TODO Auto-generated constructor stub
		cipher = new Caesar();
	}
	@Override
	public String doEncrypt(int key, String ps) {

		return cipher.doEncrypt(key, ps);
	}

}
