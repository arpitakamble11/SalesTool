package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SalesData data=new SalesData();
    displayGreeting();
    data.display();
	}
private static void displayGreeting(){
	System.out.println("Hello happy sales people!");
	System.out.println("This app shows sales data");
}
}
