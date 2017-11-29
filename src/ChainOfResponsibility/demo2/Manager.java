package ChainOfResponsibility.demo2;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<10){
			System.out.println("����"+name+"����Ա��"+request.getLeaveName()+"�������,�������Ϊ"
					+request.getLeaveDays()+"��");
		}else{
			if(this.successor!=null){
				this.successor.handleRequest(request);
			}
		}
	}

}
