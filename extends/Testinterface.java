package Inherit;
//实现多个接口 先继承后实现接口
public class Testinterface extends C implements D{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a method");
		
	}
	
	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b method");
		
	}
	
	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("d method");
	}
	
	
	
	public static void main(String args[]){
		Testinterface t=new Testinterface();
		t.a();
		t.b();
		t.d();
		System.out.println(Testinterface.TITLEA);
		System.out.println(Testinterface.TITLEB);
	}

	
	

}
