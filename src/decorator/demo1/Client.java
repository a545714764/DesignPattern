package decorator.demo1;
/*
 * ĳ�����˾�������������������һ��ͼ�ν�����ʾ������VisualComponent
 * ��ʹ�øÿ⹹��ĳͼ�ν���ʱ���û�Ҫ��Ϊ���涨��һЩ��Ч��ʾЧ��������������Ĵ����
 * ͸������ȡ���ʹ��װ��ģʽ��Ƹù����⣬������ͼ�����ģ��ʵ�֡�
 */
public class Client {

	public static void main(String[] args) {
		Window windowS,windowSB,windowT;
		windowS = new SimpleWindow();
		windowSB = new ScrollbarDecorator(windowS);
		windowT = new TransparentDecorator(windowSB);
		windowT.display();

	}

}
