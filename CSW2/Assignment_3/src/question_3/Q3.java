package question_3;

import java.util.*;



public class Q3 
{

	public static void main(String[] args) 
	{
		CarApp list= new CarApp();
		Car c1=new Car(2015, "BMW", 55);
		Car c2=new Car(2020, "MG", 13);
		Car c3=new Car(2013, "Creta", 10);
		Car c4=new Car(2017, "Audi", 45);
		Car c5=new Car(2018, "KIA", 20);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		System.out.println("Cars List before sorting WRT age: \n"+list);
		list.sort();
		System.out.println("Cars List after sorting WRT age: \n"+list);
//		Collections.sort(list,new CarModelComparator());
//		
		
		

	}

}

class Car implements Comparable<Car>
{
	private int ModalNo;
	private String name;
	private int stock;
	Car()
	{
		super();
	}
	Car(int modalNo, String name, int stock) {
		super();
		ModalNo = modalNo;
		this.name = name;
		this.stock = stock;
	}
	public int getModalNo() {
		return ModalNo;
	}
	public void setModalNo(int modalNo) {
		ModalNo = modalNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return ModalNo+" "+name+" "+stock+"\n";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ModalNo, name, stock);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return ModalNo == other.ModalNo && Objects.equals(name, other.name) && stock == other.stock;
	}
	
	@Override
	public int compareTo(Car o) {
		if(this == o)
		return 0;
		else
		{
			if(this.getStock() == o.getStock()) return 0;
			else if(this.getStock() < o.getStock()) return -1;
			else return 1;
		}
	}
	
	
}


class CarApp
{
	private ArrayList<Car> carList=new ArrayList<>();
	public void add(Car c)
	{
		carList.add(c);
	}
	public void remove(Car c)
	{
		carList.remove(c);
	}
	public void remove(int i)
	{
		carList.remove(i);
	}
	public void sort()
	{
		for (int i=0;i<carList.size()-1;i++)
		{
			for (int j=i+1;j<carList.size();j++)
			{
				if(carList.get(i).getStock() > carList.get(j).getStock())
				{
					Car temp=carList.get(i);
					carList.set(i, carList.get(j));
					carList.set(j,temp);
				}
			}
		}
	}
	@Override
	public String toString() {
		return "" + carList;
	}
	
}

//class CarModelComparator implements Comparator<Car>
//{
//
//	@Override
//	public int compare(Car o1, Car o2) 
//	{
//		if(o1.equals(o2))
//		return 0;
//		else if(o1.getModalNo()<o2.getModalNo()) return -1;
//		else if(o1.getModalNo()==o2.getModalNo()) return 0;
//		else return 1;
//	}
//	
//}


