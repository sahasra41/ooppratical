package oop_pratical;


class Programmer{
	private String name;
	public String getName() {return name;}
	
	public void setName(String name) { this.name=name;}
		
	}
public class Encapuslation {
		public static void main(String args[]) {
			Programmer p=new Programmer();
			p.setName("geek");
			System.out.println("Names=>" +p.getName());
		}
	
}

