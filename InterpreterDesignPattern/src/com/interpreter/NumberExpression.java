package com.interpreter;

//terminal expression
public class NumberExpression implements AbstractExpression {

	private int number;
	
	public NumberExpression(int number) {
		this.number=number;
	}
	
	@Override
	public int interpret(Context context) {
		return number;
	}

}
