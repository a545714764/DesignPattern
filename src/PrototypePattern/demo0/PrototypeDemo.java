package PrototypePattern.demo0;

public class PrototypeDemo implements Cloneable{
	public Object clone(){
		Object object = null;
		try{
			object = super.clone();
		}catch(CloneNotSupportedException e){
			System.err.println("Not support cloneable");
		}
		return object;
	}
}
