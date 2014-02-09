package ca.demo.salestool;

public class Main {
	public static void main(String[] args){
		SalesDate data=new SalesDate();
		
		displayGreeting();
		data.display();
		
	}
private static void displayGreeting(){
	
	System.out.println("HELLO HAPY SALES PEOPLE!");
	System.out.println("THÝS APP SHOWS SALES DATA");

}
}
