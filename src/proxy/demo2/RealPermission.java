package proxy.demo2;

public class RealPermission implements AbstractPermission {

	@Override
	public void modifyUserInfo() {
		System.out.println("�޸��û���Ϣ");
	}

	@Override
	public void viewNote() {
		
	}

	@Override
	public void publishNote() {
		System.out.println("��������");
	}

	@Override
	public void modifyNote() {
		System.out.println("�޸ķ�������");
	}

	@Override
	public void setLevel(int level) {
	}

}
