package aaaa;

public class Bbbb extends Aaaa {

	public Bbbb(String nameValue, Integer ageValue) {
		super();
		name = nameValue;
		age = ageValue;
	}
	
	public void introduction() {
		String intro = "私は"+ name + "です" + "\r\n 年齢は" + age + "です";
		System.out.print(intro);
	}
}
