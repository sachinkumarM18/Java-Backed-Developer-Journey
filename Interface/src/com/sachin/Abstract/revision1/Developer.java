package com.sachin.Abstract.revision1;

class Developer extends Employee {

	Developer(String name) {
		super(name);
	}

	@Override
	void work() {
		System.out.println(name + " is Writing Code");
	}

}
