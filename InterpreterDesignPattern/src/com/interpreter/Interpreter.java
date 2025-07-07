package com.interpreter;

public class Interpreter {
	
	private Context context;

	public Interpreter(Context context) {
		this.context = context;
	}
	
	private AbstractExpression buildExpressionTree(String expression) {
		return new AdditionExpression(new NumberExpression(2), new MultiplicationExpression(new NumberExpression(3), new NumberExpression(4)));
	}
	
	public int interpret(String expression) {
		AbstractExpression expressionTree= buildExpressionTree(expression);
		return expressionTree.interpret(context);
		
	}

}
