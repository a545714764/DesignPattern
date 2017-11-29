package PrototypePattern.demo4;

public class Blue implements MyColor {
	public Object clone(){
		Blue r = null;
		try{
			r = (Blue) super.clone();
		}catch(CloneNotSupportedException e){
			
		}
		return r;
	}
	@Override
	public void display() {
		System.out.println("This is Blue!");
	}

}
