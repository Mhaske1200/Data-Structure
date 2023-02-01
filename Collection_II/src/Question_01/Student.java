package Question_01;

import java.util.Comparator;

public class Student
{
	private int studentID;
	private String name;
	private String city;
	private double percent;
	
	Student()
	{
		studentID = 0000;
		name = "NA";
		city = "NA";
		percent = 0.000;
	}

	public Student(int studentID, String name, String city, double percent) 
	{
		this.studentID = studentID;
		this.name = name;
		this.city = city;
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", city=" + city + ", percent=" + percent + "] \n";
	}

	
	
	/*
	 * @Override public int hashCode() { int citycode = 0;
	 * if(city.equalsIgnoreCase("Pune")) { citycode =10; } else if
	 * (city.equalsIgnoreCase("Nagpur")) { citycode =20; } else if
	 * (city.equalsIgnoreCase("Mumbai")) { citycode =30; } else if
	 * (city.equalsIgnoreCase("Delhi")) { citycode =40; } else if
	 * (city.equalsIgnoreCase("Satara")) { citycode =50; } else { citycode = 0; }
	 * 
	 * return citycode; }
	 */
	 
	 
	
	
	
	  public int hashCode() { int percode = 0; if(percent > 90) { percode = 10; }
	  else if(percent > 80) { percode = 20; } else if(percent > 70) { percode = 30;
	  } else if(percent > 60) { percode = 40; } else if(percent > 50) { percode =
	  50; }
	  
	  return percode; }
	 
	 

	
	  @Override public boolean equals(Object obj) { boolean flag = false; Student s
	  = null; if(obj instanceof Student) { s=(Student)obj; if(this.studentID ==
	  s.studentID && this.name == s.name && this.city == s.city && this.percent ==
	  s.percent) { flag = true; } }
	  
	  return flag; }
	 

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	
}
