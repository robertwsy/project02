package Inherit;

public class Cat extends Animal{
	
	private String address;
	
	public String getAddress(){
		return address;
	}
	
	public Cat(){
		super();
		System.out.println("子类无参构造方法");
	}
	
	public Cat(String name,int age,String address){
		super(name,age);
		this.address=address;
		System.out.println("子类有参构造方法");
	}
	
	public void say(){
		//调用父类的say方法
		System.out.println("I'm a cat "+this.getName()+".My age is"+this.getAge()+".I come from "+this.address);
		
	}
	public static void main(String args[]){
		Cat cat=new Cat("nora",2,"Mars");
		//cat.setName("nora");
		//cat.setAge(2);
		cat.say();
		
	}

}
