package Main.Developer;

public class FE extends Developer {

	public FE(String name, String surname, double experience, long phone, int salaryRate) {
		super(name, surname, experience, phone, salaryRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalculateSalary() {
		// TODO Auto-generated method stub
		return super.CalculateSalary();
	}

	@Override
	public void WhatIShouldDo() {
        System.out.println("What I should do: Work with team, investigate, coding(Front-End part), wrote unit tests");
	}

}
