package com.interpreter;

public class Client {
	
	public static void main(String[] args) {
		
		//input expression
		String expression="2*3+4";
		
		//create interpreter
		Context context=new Context();
		Interpreter interpreter=new Interpreter(context);
		
		//Interpret Expression
	   System.out.println("Result is "+interpreter.interpret(expression));
	}

}
