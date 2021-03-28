public class TestClass5026201050{
	public static void main(String args[]){
	 ComputeMethods5026201050 result = new ComputeMethods5026201050();
	 result.degreesF = 143.7;
	 double degreesF = result.degreesF;
	 result.fToC(degreesF);
	 System.out.println("Temp in celcius is " + result.fToC(degreesF));

	 result.a = 25;
	 int a = result.a;
	 result.b = 26;
	 int b = result.b;
	 result.hypotenuse(a, b);
	 System.out.println("Hypotenuse is " + result.hypotenuse(a, b));

	 result.roll();
	 System.out.println("The sum of the dice values is " + result.roll());
	}
}
	