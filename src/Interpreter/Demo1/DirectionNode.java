package Interpreter.Demo1;
//�������:�ս�����ʽ
public class DirectionNode extends AbstractNode {
	private String direction;
	
	public DirectionNode(String direction) {
		
		this.direction = direction;
	}

	@Override
	public String interpret() {
		if(direction.equalsIgnoreCase("up")){
			return "����";
		}else if(direction.equalsIgnoreCase("down")){
			return "����";
		}else if(direction.equalsIgnoreCase("left")){
			return "����";
		}else if(direction.equalsIgnoreCase("right")){
			return "����";
		}else{
			return "��Чָ��";
		}
	}

}
