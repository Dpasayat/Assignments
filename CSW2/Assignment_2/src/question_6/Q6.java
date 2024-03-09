package question_6;

import java.util.Objects;

public class Q6 
{

	public static void main(String[] args) 
	{
		Animal lion=new Animal("Lion","golden","feline");
		Animal tiger=new Animal("Tiger","orange","feline");
		Animal puma=new Animal("Puma","Black","feline");
		System.out.println(lion+"\nHashcode:"+lion.hashCode());
		System.out.println(tiger+"\nHashcode:"+tiger.hashCode());
		System.out.println(puma+"\nHashcode:"+puma.hashCode());

	}

}



class Animal
{
	private String name,color,type;
	
	Animal()
	{
		super();
	}

	public Animal(String name, String color, String type) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", type=" + type + "]";
	}
	
	
}
