package OOP_TCS;

import java.io.*;
import java.util.*;

public class Solution1 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Faculty[] faculty = new Faculty[n];
		

		for(int i = 0; i < faculty.length; i++)
		{
			int id = Integer.parseInt(br.readLine());
			String name = br.readLine();
			double salary = Double.parseDouble(br.readLine());
			String designation = br.readLine();
			int age = Integer.parseInt(br.readLine());
			String stream = br.readLine();
			
			faculty[i] = new Faculty(id, name, salary, designation, age, stream);
		}
		
		String given = br.readLine();
		double avg_age = findAverageAgeOfFaculty(faculty);
		System.out.println("Average of Age " + avg_age);
		
		Faculty[] ans = searchFacultyByName(faculty, given);
		
		if(ans != null) {
			System.out.println("id-" + ans[0].getId());
			System.out.println("name-" + ans[0].getName());
			System.out.println("salary-" + ans[0].getSalary());
			System.out.println("designation-" + ans[0].getDesignation());
			System.out.println("age-" + ans[0].getAge());
			System.out.println("stream-" + ans[0].getStream());
		}
	}
	
	public static double findAverageAgeOfFaculty(Faculty[] faculty)
	{
		double total = 0,c = 0;
		double no = faculty.length;
		
		for(int i = 0; i < faculty.length; i++)
		{
			total += faculty[i].getAge();
			c++;
		}
		if(c > 0)
			return total/no;
		else
			return 0;
	}
	
	public static Faculty[] searchFacultyByName(Faculty[] faculty, String given)
	{
		Faculty[] temp = new Faculty[1];
		
		for(int i = 0; i < faculty.length; i++)
		{
			if(faculty[i].getName().equalsIgnoreCase(given)) {
				temp[0] = faculty[i];
				return temp;
			}
		}
		return null;
	}
}

class Faculty
{
	private int id;
	private String name;
	private double salary;
	private String designation;
	private int age;
	private String stream;
	
	
	public Faculty(int id, String name, double salary, String designation, int age, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.age = age;
		this.stream = stream;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
}
