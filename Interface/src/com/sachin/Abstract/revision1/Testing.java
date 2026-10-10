package com.sachin.Abstract.revision1;

class Testing extends Employee {

	Testing(String name) {
		super(name);

	}

	@Override
	void work() {
		System.out.println(name + " is Testing the application");
	}
}
