package Interpreter.Demo1;
//��������:�ս�����ʽ
public class DistanceNode extends AbstractNode {
	private String distance;
	
	public DistanceNode(String distance) {
		
		this.distance = distance;
	}

	@Override
	public String interpret() {
		return this.distance+",";
	}

}
