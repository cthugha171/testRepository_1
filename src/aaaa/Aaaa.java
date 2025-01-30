package aaaa;

public class Aaaa {

	protected String name;
	
	protected Integer age;
	
	public Aaaa() {
		name = "aaaa";
		age = 0;
		System.out.println("name:"+ name + "\r\nage:" + age);
	}
	
	public Aaaa(String nameValue, Integer ageValue) {
		name = nameValue;
		age = ageValue;
		System.out.println("name:" + name + "\r\nage:" + age);
	}
}
