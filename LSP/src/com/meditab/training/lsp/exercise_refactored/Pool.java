package com.meditab.training.lsp.exercise_refactored;

public class Pool implements DuckInterface{
	public void run() {
		Duck donaldDuck = new Duck();
		ElectronicDuck electricDuck = new ElectronicDuck();
		quack();
		swim();
	}

	public void swim() {
		Duck[] ducks = null;
		for (Duck duck : ducks) {
			duck.swim();
		}

	}

	public void quack() {
		Duck[] ducks = null;
		for (Duck duck : ducks) {
			duck.quack();
		}

	}

	public static void main(String[] args) {
		Pool pool = new Pool();
		pool.run();
	}
}
