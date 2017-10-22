package com.study.StackQueue.CatDogQueue;

public class PetEnterQueue {
	private Pet pet;
	private Long count;
	public PetEnterQueue(Pet pet, Long count) {
		this.pet = pet;
		this.count = count;
	}
	public Pet getPet() {
		return pet;
	}
	public Long getCount() {
		return count;
	}
	public String getPetEnterType() {
		return this.pet.getPetType();
	}
	
}
