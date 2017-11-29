package ChainOfResponsibility.demo0;

public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest(String request) {
		if(1==1){
			
		}else{
			this.successor.handleRequest(request);
		}
	}

}
