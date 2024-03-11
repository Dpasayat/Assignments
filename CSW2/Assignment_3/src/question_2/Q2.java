package question_2;

import java.util.*;

public class Q2 
{

	public static void main(String[] args) 
	{
		ArrayListUser li=new ArrayListUser();
		User u1=new User("Dhiraj",21);
		User u2=new User("Anand",21);
		User u3=new User("Anupam",25);
		User u4=new User("Ayush",20);
		User u5=new User("Vishal",19);
		li.add(u1);
		li.add(u2);
		li.add(u3);
		li.add(u4);
		li.add(u5);
		System.out.println("User List before sorting WRT age: \n"+li);
		li.sort();
		System.out.println("User List after sorting WRT age: \n"+li);
		

	}

}


class User implements Comparable<User>
{
	private String name;
	private int age;
	User(){super();}
	
	User(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(User o) 
	{
		if(this == o)
		return 0;
		else
		{
			if(this.getAge()==o.getAge()) return 0;
			else if(this.getAge() < o.getAge()) return -1;
			else return 1;
		}
	}

	@Override
	public String toString() {
		return "[name=" + this.getName() + ", age=" + this.getAge() + "]\n";
	}
	
		
}


class ArrayListUser
{
	ArrayList<User> userList=new ArrayList<>();
	public void add(User users)
	{
		userList.add(users);
	}
	public void remove(User users)
	{
		userList.remove(users);
	}
	public void sort()
	{
//		userList.sort(null);
		
		for (int i=0;i<userList.size()-1;i++)
		{
			for (int j=i+1;j<userList.size();j++)
			{
				if(userList.get(i).getAge() > userList.get(j).getAge())
				{
					User temp=userList.get(i);
					userList.set(i, userList.get(j));
					userList.set(j,temp);
				}
			}
		}
	}
	@Override
	public String toString() {
		return  ""+userList ;
	}
	
	
	
}


