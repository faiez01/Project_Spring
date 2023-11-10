package Main;

public class Calculator {
	public int evaluate(String expression)
	{
	int sum = 0;
	for (String summand:expression.split("\\+"))

	sum += Integer.valueOf(summand);
	return sum;
	}
	public int add(int a , int b) {
		return a+b;	
	}
	public int Substract(int a , int b) {
		return a-b;	
	}
	public int Multiply(int a , int b) {
		return a*b;	
	}
	public int Divide(int a , int b) {
		if (b==0)
			throw new ArithmeticException("Division par 0");
		return a/b;
	}
	}
