package com.study.StackQueue;

import java.util.Stack;

public class OneStackSortAnotherStack {
	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<Integer>();
		while (!stack.isEmpty()) {
			Integer cur = stack.pop();
			while (!help.isEmpty() && cur < help.peek()) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while(!help.isEmpty()) {
			stack.push(help.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(3);
		s.push(4);
		s.push(1);
		s.push(2);
//		System.out.println(s);
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		OneStackSortAnotherStack.sortStackByStack(s);
//		System.out.println(s);
	}
}
