package visitor.demo1;

import java.util.ArrayList;
import java.util.Iterator;
//候选人集合类：对象结构
public class CandidateList {
	private ArrayList<Person> list = new ArrayList<>();
	
	public void addPerson(Person person){
		list.add(person);
	}
	
	public void removePerson(Person person){
		list.remove(person);
	}
	
	public void accept(AwardCheck check){
		Iterator i = list.iterator();
		while(i.hasNext()){
			((Person)i.next()).accept(check);
		}
	}
}
