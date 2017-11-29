package bridage.demo1;
/*
 * һ�����ȵ�����ṩ��(JorumCoffee)���б�(MediumCoffee)��С��(SmallCoffee)�Ŀ���(Coffee)��Ϊ�����㲻ͬ�û��Ŀ�
 * ζ���ڿ����п������ţ��(Milk)��������(Sugar)����������(Lemon)���ṩ���û���ͬ��ζ(flavor)����ϣ���󱭿��ȼ�ţ�̣��б����ȼ���
 * ��С�����ȼ����ʣ�С�����ȼ��ǵȡ�Ӧ���Ž�ģʽ����JAVA����̨Ӧ�ó���ʵ�ָ���ơ����Ƹ�ģʽ��UMLͼ��
 */
public class Client {
	public static void main(String[] args) {
		AbstractCoffee coffee1;
		coffee1 = new MediumCoffee();
		coffee1.setFlavor(new Milk());
		coffee1.drink();
		
		AbstractCoffee coffee2;
		coffee2 = new SmallCoffee();
		coffee2.setFlavor(new Sugar());
		coffee2.drink();
		
		AbstractCoffee coffee3;
		coffee3 = new JorumCoffee();
		coffee3.setFlavor(new Lemon());
		coffee3.drink();
	}
	
}
