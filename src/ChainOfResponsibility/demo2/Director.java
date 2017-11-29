package ChainOfResponsibility.demo2;

public class Director extends Leader {

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<3){
			System.out.println("����"+name+"����Ա��"+request.getLeaveName()+"�������,�������Ϊ"
					+request.getLeaveDays()+"��");
		}else{
			if(this.successor!=null){
				this.successor.handleRequest(request);
			}
		}
	}

}
