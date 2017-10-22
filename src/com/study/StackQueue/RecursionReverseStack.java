package com.study.StackQueue;
import java.util.Stack;

/*
 * 仅使用递归函数和栈操作逆序一个栈
 */
public class RecursionReverseStack {
	
	private static int getAndRemoveLastElement(Stack<Integer> stack) {
		//先pop
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		}else{
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack){
		if (stack.isEmpty()) {
			return ;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
}
