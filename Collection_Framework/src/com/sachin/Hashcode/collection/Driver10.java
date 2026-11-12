package com.sachin.Hashcode.collection;

class Parent {

	int x = 10;

	Parent() {
		show();
	}

	void show() {
		System.out.print(x + " ");
	}
}

class Child extends Parent {

	int x = 20;

	Child() {
		System.out.print(x + " ");
	}

	@Override
	void show() {
		System.out.print(x + " ");
	}
}

public class Driver10 {

	public static void main(String[] args) {

		Parent p = new Child();

		System.out.println(p.x);

		p.show();
	}
}
