
public class ex502 {

	public static double add(double a, double b) {return a+b;}
	public static double sub(double a, double b) {return a-b;}
	public static double mul(double a, double b) {return a*b;}
	public static double div(double a, double b) {return a/b;}
	public static void circ(int a) {
		String result="Pizza size: "+2*a*3.14+"inches: ";
		System.out.println(result);
	}
	public static void circ(double a) {
		String result="Pizza size: "+2*a*3.14+"inches: ";
		System.out.println(result);
	}
	public static void area(int a) {
		String result="Pizza area: "+a*a*3.14+"inches: ";
		System.out.println(result);
	}
	public static void area(double a) {
		String result="Pizza area: "+a*a*3.14+"inches: ";
		System.out.println(result);
	}
	public static void main(String[] args) {
		int a=15;
		int b=7;
		//System.out.println("Calculator program: ");
		//......
		circ(a);
		area(b);
		
		circ(7.5);
		area(7.5);
		
		float aa=12.345f;
		circ(aa);
	}
	
	
	
	/*public static void factorial(int a) {
		int result=1;
		for(int i=1;i<=a;i++) {
			
		}
	}*/

}
