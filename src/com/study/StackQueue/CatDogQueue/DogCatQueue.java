package com.study.StackQueue.CatDogQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DogCatQueue {
	private Queue<PetEnterQueue> dogQ;
	private Queue<PetEnterQueue> catQ;
	private long count;
	
	public DogCatQueue() {
		this.dogQ = new LinkedList<PetEnterQueue>();
		this.catQ = new LinkedList<PetEnterQueue>();
		this.count = 0;
	}
	
	public void add(Pet pet) {
		if (pet.getPetType().equals("dog")) {
			dogQ.add(new PetEnterQueue(pet, count++));
		} else if (pet.getPetType().equals("cat")){
			catQ.add(new PetEnterQueue(pet, count++));
		}
	}
	
	public Pet pollAll() {
		if (!dogQ.isEmpty() && !catQ.isEmpty()) {
			if (dogQ.peek().getCount() < catQ.peek().getCount()) {
				return dogQ.poll().getPet();
			} else {
				return catQ.poll().getPet();
			}
		} else if (!dogQ.isEmpty()){
			return dogQ.poll().getPet();
		}else if (!catQ.isEmpty()){
			return catQ.poll().getPet();
		}
		return null;
	}
	
	public Dog pollDog() {
		return (Dog) dogQ.poll().getPet();
	}
	
	public Cat pollCat() {
		return (Cat) catQ.poll().getPet();
	}
	
	public boolean isEmpty() {
		return dogQ.isEmpty() && catQ.isEmpty();
	}
	
	public boolean isDogQueueEmpty() {
		return dogQ.isEmpty();
	}
	
	public boolean isCatQueueEmpty() {
		return catQ.isEmpty();
	}
	
	
	
	
}
