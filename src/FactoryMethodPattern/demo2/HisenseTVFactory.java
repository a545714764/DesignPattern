package FactoryMethodPattern.demo2;

public class HisenseTVFactory implements TVFactory {

	@Override
	public TV produceTV() {
		System.out.println("���ŵ��ӻ������������ŵ��ӻ�");
		return new HisenseTV();
	}

}
