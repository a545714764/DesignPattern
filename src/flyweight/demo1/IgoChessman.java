package flyweight.demo1;
//Χ��������:������Ԫ��
public abstract class IgoChessman {
	public abstract String getColor();
	public void locate(Coordiantes coord){
		System.out.println("������ɫ:"+this.getColor()+",����λ��:"+coord.getX()+","+coord.getY());
	}
}
