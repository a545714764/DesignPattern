package ChainOfResponsibility.demo2;

public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<30){
			System.out.println("�ܾ���"+name+"����Ա��"+request.getLeaveName()+"�������,�������Ϊ"
					+request.getLeaveDays()+"��");
		}else{
			System.out.println("Ī��"+request.getLeaveName()+"���ְ,��Ȼ���"+request.getLeaveDays()+"��");
		}
	}

}
