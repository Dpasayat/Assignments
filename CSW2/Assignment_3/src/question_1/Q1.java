package question_1;

import java.util.Scanner;

public class Q1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Pair<Integer,String> ob1=new Pair<>();
		Pair<String,String> ob2=new Pair<>();
		System.out.println("Enter Integer key and String value for 1st pair: ");
		ob1.setKey(sc.nextInt());
		ob1.setValue(sc.next());
		System.out.println("Enter String key and String value for 2nd pair: ");
		ob2.setKey(sc.next());
		ob2.setValue(sc.next());
		System.out.println("Pair 1:"+ ob1);
		System.out.println("Pair 2:"+ob2);
		sc.close();
	}

}

class Pair<K,V>
{
	private K key;
	private V value;
	
	Pair()
	{
		super();
	}

	Pair(K key, V value) 
	{
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() 
	{
		return "[key=" + key + ", value=" + value + "]";
	}
	
	
	
}
