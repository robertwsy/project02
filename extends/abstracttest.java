package Inherit;
//类名打错了 应该是abstract
public class abstracttest {
	public static void main(String[] args) {
		//下句会报错，说明抽象类不能被实例化
		//abstruct p=new People();
		
		abstudent student=new abstudent();
		student.profession();
		
		
		abteacher teacher=new abteacher();
		teacher.profession();
	}

}
