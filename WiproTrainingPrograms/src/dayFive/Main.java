package dayFive;

interface A {
	int div(int a, int b);
}

interface B{
	int div(int a, int b);
}

interface C {
	int div(int a, int b);
}

class ImpClass implements A, B, C {
	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}	
}

public class Main {	
	public static void main(String[] args) {
		ImpClass obj = new ImpClass();
		obj.div(55,11);
		
		A a = new ImpClass();		
		System.out.println("Interface A: Division: " + a.div(12, 4));
		
		B b = new ImpClass();
		System.out.println("Interface B: Division: " + a.div(140, 4));
		b.div(24, 2);
		
		C c = new ImpClass();
		System.out.println("Interface C: Division: " + a.div(10, 5));
		a.div(32, 8);
	}

}
