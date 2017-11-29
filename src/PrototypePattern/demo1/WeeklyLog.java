package PrototypePattern.demo1;

public class WeeklyLog implements Cloneable {
	private String name;
	private String date;
	private String content;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		try{
			obj = super.clone();
			return obj;
		}catch(CloneNotSupportedException e){
			System.out.println("²»ÄÜ¸´ÖÆ");
			return null;
		}
	}
	
}
