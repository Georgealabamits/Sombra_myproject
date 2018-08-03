package Main.Developer;

import Main.Employee;

public abstract class Developer extends Employee {
	
    public Developer(String name, String surname, double experience, long phone, int salaryRate) {
		super(name, surname, experience, phone, salaryRate);
		// TODO Auto-generated constructor stub
	}

	protected double Cof() {
    	double exp = getExperience();
    	if(exp < 1)
    		return 1.5;
    	if(exp >= 1 && exp <=2)
    		return 2;
    	return 3;
    }
	
    @Override
    public double CalculateSalary() {
        return Cof() * getSalaryRate();
    }

    @Override
    public void WhatIShouldDo() {

    }
}
