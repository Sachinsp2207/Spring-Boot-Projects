package spring;

public class Person {
	int id;
	String name;
	int age;
	long cont;
	
	Pan p;

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

	public long getCont() {
		return cont;
	}

	public void setCont(long cont) {
		this.cont = cont;
	}

	public Pan getP() {
		return p;
	}

	public void setP(Pan p) {
		this.p = p;
	}
	public void dispPerson()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(cont);
	}
}
