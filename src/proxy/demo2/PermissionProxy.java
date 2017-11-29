package proxy.demo2;

public class PermissionProxy implements AbstractPermission {
	private RealPermission permission = new RealPermission();
	private int level = 0;

	@Override
	public void modifyUserInfo() {
		if(level==0){
			System.out.println("对不起,你没有改权限!");
		}else if(level==1){
			permission.modifyUserInfo();
		}
	}

	@Override
	public void viewNote() {
		System.out.println("查看帖子");
	}

	@Override
	public void publishNote() {
		if(level==0){
			System.out.println("对不起,你没有改权限!");
		}else if(level==1){
			permission.publishNote();
		}
	}

	@Override
	public void modifyNote() {
		if(level==0){
			System.out.println("对不起,你没有改权限!");
		}else if(level==1){
			permission.modifyNote();
		}
	}

	@Override
	public void setLevel(int level) {
		this.level = level;
	}

}
