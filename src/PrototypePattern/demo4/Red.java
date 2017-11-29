package PrototypePattern.demo4;

public class Red implements MyColor {
	public Object clone(){
		Red r = null;
		try{
			r = (Red) super.clone();
		}catch(CloneNotSupportedException e){
			
		}
		return r;
	}
	@Override
	public void display() {
		System.out.println("This is Red!");
	}

}
