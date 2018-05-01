package Inherit;
//此类包含联系的有3个类 abstudent abteacher abstracttest
public abstract class abstruct {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void say(){
		System.out.println("my name is"+this.getName());
		
	}
	/*
	 * 定义一个抽象类方法 职业
	 */
	public abstract void profession();//直接声明不定义一个body

}
