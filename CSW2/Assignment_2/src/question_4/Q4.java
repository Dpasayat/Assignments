package question_4;

import java.util.Scanner;
import java.util.Objects;

public class Q4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student[] arr= {new Student("Dhiraj","6218",98), new Student("Ayush","6221",99),new Student("Anupam","6219",97)};
		System.out.println("Enter Roll number to search(6218,6219,6221): ");
		String rollKey=sc.next();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].getRn().equals(rollKey))
			{
				
			}
		}

	}

}

class Student implements Comparable<Student>
{
	private String name,rn;
	int totalMark;
	
	Student() {
		super();
	}

	Student(String name, String rn, int totalMark) {
		
		this.name = name;
		this.rn = rn;
		this.totalMark = totalMark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRn() {
		return rn;
	}

	public void setRn(String rn) {
		this.rn = rn;
	}

	public int getTotalMark() {
		return totalMark;
	}

	public void setTotalMark(int totalMark) {
		this.totalMark = totalMark;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(rn, totalMark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(rn, other.rn) && totalMark == other.totalMark;
	}

	@Override
	public int compareTo(Student o) 
	{
		if(this.equals(o))
			return 0;
		else
		{
			if(this.getRn().equals(o.getRn()))
				return 0;
			else 
				return -1;
		}
	}
	
	
	
	
	
}
