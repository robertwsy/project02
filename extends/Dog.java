package Inherit;

/**定义dog类 继承自Animal类
 * @author wissyf
 *
 */
public class Dog extends Animal{
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("pink");
		dog.setAge(2);
		dog.say();
	}
	
	

}
