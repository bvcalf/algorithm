package com.study.StackQueue;
import java.util.Stack;
/*
 * 两个栈组成的队列
 */
public class TwoStackQueue {

	private Stack<Integer> stackPush;
	private Stack<Integer> stackPop;
	public TwoStackQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}
	public void add(int pushInt) {
		
	}
	public int poll() {
		if (stackPop.isEmpty()&&stackPush.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}else if (stackPop.isEmpty()){//只有stackPop为空时才可以push
			while (!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	public int peek() {
		if (stackPop.isEmpty()&&stackPush.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}else if (stackPop.isEmpty()){//只有stackPop为空时才可以push
			while (!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
}
