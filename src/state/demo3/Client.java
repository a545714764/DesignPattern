package state.demo3;
/*
 * ״̬ģʽʵ��3֮����״̬
 * ���ĳϵͳҪ���������ض���Ҫô�����ڿ���״̬,Ҫô�����ڹص�״̬,��ʹ��ʱ���ǵ�״̬���뱣��һ��,���ؿ���
 * �ɿ��л�����,Ҳ�����ɹ��л�����
 */
public class Client {

	public static void main(String[] args) {
		Switch s1,s2;
		s1 = new Switch("����1");
		s2 = new Switch("����2");
		
		s1.on();
		s2.on();
		s1.off();
		s2.off();
		s2.on();
		s1.on();

	}

}
