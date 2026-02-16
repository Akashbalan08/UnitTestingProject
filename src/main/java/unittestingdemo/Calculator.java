package unittestingdemo;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int div(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException("Cannot Divide by Zero");
		}
		else {
		return a/b;
		}
	}
	
	public String checkNum(int c) {
		if (c>0){
			return "Positive";
		}
		else if (c<0) {
			return "Negative";
		}
		else{
			return "Zero";
		}
	}
}


