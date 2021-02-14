package labFour;

public class Person {
	private String name;
	private float age;
	
	public Person(String name,float age)
	{
		this.age=age;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
