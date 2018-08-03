package Main.Manager;

import Main.Employee;

public class Manager extends Employee {
	 
	public Manager(String name, String surname, double experience, long phone, int salaryRate) {
		super(name, surname, experience, phone, salaryRate);
		// TODO Auto-generated constructor stub
	}

	protected double Cof() {
    	double exp = getExperience();
    	if(exp < 1)
    		return 1.1115;
    	if(exp >= 1 && exp <=2)
    		return 1.20;
    	return 1.35;
    }
		
    @Override
    public double CalculateSalary() {
        return Cof() * getSalaryRate();
    }

    @Override
    public void WhatIShouldDo() {
        System.out.println("What I should do: I do not know too");
    }
}