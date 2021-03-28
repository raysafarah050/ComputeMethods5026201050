import java.util.*;

public class ComputeMethods5026201050{
	public double degreesF = 0;
	public int a = 0;
	public int b = 0;

	public double fToC(double degreesF){
	double degreesC = 5.0/9.0*(degreesF - 32.0);
	return degreesC;
	}

	public double hypotenuse(int a, int b){
	double c = Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));
	return c;
	}

	public int roll(){
	Random num = new Random();
	int firstDice = num.nextInt(6) + 1;
	int secondDice = num.nextInt(6) + 1;
	int sum = firstDice + secondDice;
	return sum;
	}
	
}

	
	