package Interpreter.Demo1;
//��������:�ս�����ʽ
public class ActionNode extends AbstractNode {
	private String action;
	
	public ActionNode(String action) {
		
		this.action = action;
	}

	@Override
	public String interpret() {
		if(action.equalsIgnoreCase("move")){
			return "�ƶ�";
		}else if(action.equalsIgnoreCase("run")){
			return "�����ƶ�";
		}else{
			return "��Чָ��";
		}
	}

}
