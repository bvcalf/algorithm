package com.study.StackQueue;

import java.util.Stack;

public class MyStack2 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	public MyStack2() {
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	public void push(int newNum) {
		stackData.push(newNum);
		if (stackMin.isEmpty()) {
			stackMin.push(newNum);
		}
		if (newNum<=stackMin.peek()) {
			stackMin.push(newNum);
		}else {
			stackMin.push(stackMin.peek());
		}
	}
	public int pop() {
		stackMin.pop();
		return stackData.pop();
	}
	public int getMin() {
		return stackMin.peek();
	}
}
