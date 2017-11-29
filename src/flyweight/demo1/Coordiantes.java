package flyweight.demo1;
//坐标类:外部状态类
public class Coordiantes {
	private int x;
	private int y;
	public Coordiantes(int x,int y){
		this.x =x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
