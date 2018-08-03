package Main;

import java.util.ArrayList;

import Main.Accountant.Accountant;
import Main.Developer.BE;
import Main.Developer.FE;
import Main.Developer.QA;
import Main.Manager.Manager;

class General{
    	
    	private static ArrayList<Employee> SombraBd = new ArrayList<Employee>();
    	
        public static void main(String[]args){
        	System.out.println("About Sombra :" + Sombra.getAddress() + " Phone: " + Sombra.getPhoneNumber()); 
        	SombraBd.add(new QA("Yura", "Tsymbala", 2, 9379992, 100500));
        	SombraBd.add(new FE("Oleg", "Ivanov", 2, 9379992, 32));
        	SombraBd.add(new BE("Petro", "Petrov", 1, 5, 456));
        	SombraBd.add(new Accountant("Nadya", "Shaynofer", 57, 9379992, 544));
        	SombraBd.add(new Manager("Lesya", "Sarajishvilly", 4, 9379992, 213));
        	 
        	System.out.println("Before Sorting:");
      	   	for(Employee counter: SombraBd){
      			System.out.println(counter.toString());
      		}
      	   	
      	   	
      	   	System.out.println("After Sorting by surname:");
      	   	SombraBd.sort(Employee.SurnameComparator);
    	   	for(Employee counter: SombraBd){
    			System.out.println(counter.toString());
    		}
    	   	
    	   	System.out.println("After Sorting by rate:");
      	   	SombraBd.sort(Employee.RateComparator);
    	   	for(Employee counter: SombraBd){
    			System.out.println(counter.toString());
    		}
//            FE f1 = new FE();
//            f1.setName("Jhon");
//            f1.setSurname("Tester");
//            f1.setExperience(1.00);
            //System.out.println(f1.getName() + " " + f1.getSurname() + f1.setExperience());
        }
}
