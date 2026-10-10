package Map_Interface;
import java.util.*;
public class HashMapDemo3 {
  public static void main(String[] args) {
	 
	  
	HashMap<String, Citizen> hmap = new HashMap<>();
	
	hmap.put("XXXX XXXX 9607", new Citizen(1,"Tharun",22,'M'));
	hmap.put("XXXX XXXX 3456", new Citizen(2,"Ramu",20,'M'));
	hmap.put("XXXX XXXX 6754", new Citizen(3,"Karim",27,'F'));
	
	for(Map.Entry<String,Citizen> entry : hmap.entrySet()) {
	    System.out.println(entry.getKey()+" | "+entry.getValue().getName()+" | "+entry.getValue().getGender());
	}
}
}

class Citizen{
	private int id;	
	private String name;
	private int age ;
	private char gender;
	public Citizen() {
		
	}
	public Citizen(int id, String name, int age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Citizen [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
