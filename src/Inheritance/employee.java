package Inheritance;

import java.security.Permission;

public class employee extends Permission{
		private double salary;
		private String joiningYear;
		private String insuranceNo;
		
		public employee(String name, double salary, String joiningYear, String insuranceNo) {
			super(name);
			this.setSalary(salary);
			this.setJoiningYear(joiningYear);
			this.setInsuranceNo(insuranceNo);
		
		}

		public void setInsuranceNo(String insuranceNo) {
			this.insuranceNo = insuranceNo;
		}
		
		public void setJoiningYear(String joiningYear) {
			this.joiningYear = joiningYear;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		public String getInsuranceNo() {
			return insuranceNo;
		}

		public String getJoiningYear() {
			return joiningYear;
		}

		public double getSalary() {
			return salary;
		}

		@Override
		public boolean implies(Permission permission) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getActions() {
			// TODO Auto-generated method stub
			return null;
		}
	}


