package Assignmnet1_01_12;


	public class Employee implements Comparable<Employee>
	{
		
		String Ename;
		int eid;
	    double experience;
		public Employee(String ename, int eid, double experience) {
			super();
			Ename = ename;
			this.eid = eid;
			this.experience = experience;
		}
		@Override
		public String toString() {
			return "Employee [Ename=" + Ename + ", eid=" + eid + ", experience=" + experience + "]";
		}
		@Override
		public int compareTo(Employee o) {
			if (experience > o.experience) {
				return 1;
			} else if (experience == o.experience) {
				return 0;
			} else {
				return -1;
			}
			
		}
		
		
	    


	}

