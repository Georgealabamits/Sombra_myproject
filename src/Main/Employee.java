package Main;

import java.util.Comparator;

public abstract class Employee extends Sombra {
	public static Comparator<Employee> SurnameComparator = new Comparator<Employee>() {
		public int compare(Employee s1, Employee s2) {
			String Name1 = s1.getSurname().toUpperCase();
			String Name2 = s2.getSurname().toUpperCase();

			// ascending order
			return Name1.compareTo(Name2);

			// descending order
			// return Name2.compareTo(Name1);
		}
	};

	public static Comparator<Employee> RateComparator = new Comparator<Employee>() {
		public int compare(Employee s1, Employee s2) {

			double rollno1 = s1.CalculateSalary();
			double rollno2 = s2.CalculateSalary();

			/* For ascending order */
			return (int) (rollno2 - rollno1);

			/* For descending order */
			// rollno2-rollno1;
		}
	};

	private String Name;
	private String Surname;
	private double Experience;
	private long Phone;
	private int SalaryRate;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public double getExperience() {
		return Experience;
	}

	public void setExperience(double experience) {
		Experience = experience;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

	public int getSalaryRate() {
		return SalaryRate;
	}

	public void setSalaryRate(int salaryRate) {
		SalaryRate = salaryRate;
	}

	public Employee(String name, String surname, double experience, long phone, int salaryRate) {
		super();
		Name = name;
		Surname = surname;
		Experience = experience;
		Phone = phone;
		SalaryRate = salaryRate;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Surname=" + Surname + ", Experience=" + Experience + ", Phone=" + Phone
				+ ", SalaryRate=" + SalaryRate + ", CalculateSalary()=" + CalculateSalary() + "]";
	}

}
