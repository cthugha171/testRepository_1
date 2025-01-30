package aaaa;

public class Bbbb extends Aaaa {

	public Bbbb(String nameValue, Integer ageValue) {
		super(nameValue, ageValue);
		name = nameValue;
		age = ageValue;
	}
	
	public void introduction() {
		String intro = "私は"+ name + "です" + "\r\n年齢は" + age + "歳です";
		System.out.print(intro);
	}
}
