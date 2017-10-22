package com.study.StackQueue;

import java.util.Stack;

public class MyStack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	public MyStack1() {
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	public void push(int newNum) {
		stackData.push(newNum);
		if (stackMin.isEmpty()) {
			stackMin.push(newNum);
		}else if (newNum<stackMin.peek()||newNum==stackMin.peek()) {
			stackMin.push(newNum);
		}
	}
	public int pop() {
		int poped = stackData.pop();
		if (poped==stackMin.peek()) {//poped不可能比stackMin里面的小
			stackMin.pop();
		} 
		return poped;
	}
	public int getMin() {
		return stackMin.peek();
	}
}
