package state.demo1;
/*
 * ״̬ģʽ
 * ��ĳ����ϵͳ�У����Ƕ������˻�������״̬��
 * (1)����˻�(Account)�����(balance)���ڵ���0,��ʱ�˻���״̬Ϊ��ɫ(GreenState)
 * ������״̬,��ʾ�ȿ�������˻����(deposit)Ҳ���ԴӸ��˻�ȡ��(withdraw)
 * (2)����˻������С��0�����Ҵ��ڵ���-1000�����˻���״̬Ϊ��ɫ��YellowState)
 * ��Ƿ��״̬,��ʱ�ȿ�������˻������ԴӸ��˻�ȡ��.
 * (3)����˻������С��-1000,��ô�˻���״̬Ϊ��ɫ(RedState),��͸֧״̬����ʱ�û�
 * ֻ������˻��������ٴ���ȡ�
 * ����״̬ģʽ��ʵ��״̬��ת�����⣬�û�ֻ��Ҫִ�м򵥵Ĵ���ȡ�������ϵͳ�����������
 * �Զ�ת������Ӧ��״̬
 */
public class Client {

	public static void main(String[] args) {
		Account acc =new Account("����", 5.0);
		acc.deposit(100);
		acc.withdraw(200);
		acc.deposit(1000);
		acc.withdraw(2000);
		acc.withdraw(100);

	}

}
