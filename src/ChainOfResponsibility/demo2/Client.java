package ChainOfResponsibility.demo2;
/*
 * ְ����ģʽʵ��2֮��������
 */
public class Client {

	public static void main(String[] args) {
		Leader objDirector,objManager,objGeneralManager;
		
		objDirector = new Director("����");
		objManager = new Manager("��ǿ");
		objGeneralManager = new GeneralManager("�");
		
		objDirector.setSuccessor(objManager);
		objManager.setSuccessor(objGeneralManager);
		
		LeaveRequest lr1 = new LeaveRequest("����", 2);
		objDirector.handleRequest(lr1);
		
		LeaveRequest lr2 = new LeaveRequest("����", 5);
		objDirector.handleRequest(lr2);
		
		LeaveRequest lr3 = new LeaveRequest("����", 15);
		objDirector.handleRequest(lr3);
		
		LeaveRequest lr4= new LeaveRequest("����", 45);
		objDirector.handleRequest(lr4);

	}

}
