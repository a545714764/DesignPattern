package bridage.demo3;
/*
 * �Ž�ģʽʵ��3֮ģ��ë��
 * ����Ҫ�ṩ����С3���ͺŵĻ���,�ܹ�����5�в�ͬ��ɫ,���ʹ������,������Ҫ׼��3*5֧����
 * Ҳ����˵����׼��15������������ࡣ�����ʹ��ë�ʵĻ�,ֻ��Ҫ3���ͺŵ�ë��,���5�����Ϻ�
 * ��3+5=8����Ϳ���ʵ��15ֻ���ʵĹ��ܡ���ʵ��ʹ���Ž�ģʽ��ģ��ë�ʵ�ʹ�ù���
 */
public class Client {

	public static void main(String[] args) {
		Color color;
		Pen pen;
		
		color = (Color) XMLUtil.getBean("color");
		pen = (Pen) XMLUtil.getBean("pen");
		
		pen.setColor(color);
		pen.draw("�ʻ�");
		
		
		

	}

}
