package Main;


public abstract class Sombra {
    private final static String ADDRESS = "B.11, Uhorska street 14, Lviv, Ukraine, 79000";
    private final static String PHONE_NUMBER = "032253076";
    
    public static String getAddress() {
    	return ADDRESS;
    }
    public static String getPhoneNumber() {
    	return PHONE_NUMBER;
    }
    
    public abstract double CalculateSalary();
    public abstract void WhatIShouldDo();
}
