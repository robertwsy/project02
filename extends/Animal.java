package Inherit;

//父类
public class Animal {
	private String name;
	private int age;
	
	
	public Animal(){
		System.out.println("无参构造方法");
	}
	/**
	 * @author wissyf
	 *有参父类构造方法
	 */
	public Animal(String name,int age){
		System.out.println("有参父类构造方法");
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	//method
	public void say(){
		System.out.println("I'm an animal,my name is "+this.getName()+" and My age is "+this.age);
		
	}
	
	
	

}
