package proxy.demo0;
/*
 * ����ģʽһ����ʽ:
 * public class Proxy implements Subject{
			private RealSubject realSubject = new RealSubject();
			
			public void preRequest(){
				
			}
			public void request(){
				preRequest();
				readSubject.request();
				postRequest();
			}
			
			public void postRequest(){
				
			}
		}
 *Զ�̴���:Ϊһ��λ�ڲ�ͬ�ĵ�ַ�ռ�Ķ����ṩһ�����صĴ������,�����ͬ�ĵ�ַ�ռ��������ͬһ̨������,
 *Ҳ��������һ̨������,Զ�̴����ֽ�����ʹ(Ambassador)
 *�������:�����Ҫ����һ����Դ���Ľϴ�Ķ���,�ȴ���һ��������Խ�С�Ķ����ʾ,���Ƕ���ֻ����Ҫʱ�Żᱻ
 *��������
 *Copy-on-Write����:������������һ��,�Ѹ���(��¡)�����ӳٵ�ֻ���ڿͻ���������Ҫʱ��ִ��.һ����˵,
 *��������¡��һ�������ϴ�Ĳ���,Copy-on-Write�����������������ӳ�,ֻ�ж����õ���ʱ��ű���¡.
 *����(Protect or Access)����:���ƶ�һ������ķ���,���Ը���ͬ���û��ṩ��ͬ�����ʹ��Ȩ��.
 *����(Cache)����:Ϊĳһ��Ŀ������Ľ���ṩ��ʱ�Ĵ洢�ռ�,�Ա����ͻ��˿��Թ�����Щ���
 *����ǽ����:����Ŀ�겻�ö����û��ӽ�
 *ͬ����(Synchronization)����:ʹ�����û��ܹ�ͬʱʹ��һ�������û�г�ͻ.
 *��������(Smart Reference)����:��һ����������ʱ,�ṩһЩ����Ĳ���,�罫�˶��󱻵��õĴ�����¼����               
 *
 */
public class Client {

	public static void main(String[] args) {
		

	}

}
