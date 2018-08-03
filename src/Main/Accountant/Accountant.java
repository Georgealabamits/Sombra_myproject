package Main.Accountant;

import Main.Employee; 

public class Accountant extends Employee {

    public Accountant(String name, String surname, double experience, long phone, int salaryRate) {
		super(name, surname, experience, phone, salaryRate);
		// TODO Auto-generated constructor stub
	}

	protected double Cof() {
    	double exp = getExperience();
    	if(exp < 1)
    		return 9.5;
    	if(exp >= 1 && exp <=2)
    		return 20;
    	return 35;
    }
	
    @Override
    public double CalculateSalary() {
        return Cof() * getSalaryRate();
    }

    @Override
    public void WhatIShouldDo() {
        System.out.println("What I should do: I do not know");
    }
     
}