package question_5;


import java.util.*;



public class Q5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student[] arr= {new Student("Dhiraj","6218",98), new Student("Ayush","6221",99),new Student("Anupam","6219",97),
				new Student("Anand","9398",69),new Student("Rakesh","6502",75),
				new Student("Abhigyan","3204",100)};
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])==1)
				{
					Student temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();

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
	public String toString() {
		return "Student [name=" + name + ", rn=" + rn + ", totalMark=" + totalMark + "]";
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
		if(Integer.parseInt(this.getRn())<Integer.parseInt(o.getRn()))
		{
			return -1;
		}
		else if(Integer.parseInt(this.getRn())>Integer.parseInt(o.getRn()))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	
}


