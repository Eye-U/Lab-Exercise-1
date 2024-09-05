package LabExer1;

import java.util.Arrays;
import java.util.Scanner;

class Object {	 
    public String text;
    
    Object(String text){
        this.text = text;
    }
    
    String get() {
    	return text;
    }
}


class Array {
	int Cap;
	Object[] arr;
	String[] temp;
	
	Array(int Cap){
		this.Cap = Cap;
	}
	
	public void initialize() {
		this.arr = new Object[Cap];
		this.temp = new String[Cap];
	}
	
	void Populate(int index, String item) {
		arr[index] = new Object(item);
	}
	
	void display() {
		for(int i=0; i<Cap;i++) {
			System.out.print(arr[i].get()+" ");
		}
	}
	
	
	void displayAscending() {
		for(int i=0; i<Cap;i++) {
			temp[i]=arr[i].get();
		}
		Arrays.sort(temp);
		for(int i=0; i<Cap;i++) {
			System.out.print(temp[i]+" ");
		}
	}
	
	void displayReverse() {
		Arrays.sort(temp);
		for(int i=Cap-1; i>=0;i--) {
			System.out.print(arr[i].get()+" ");
		}
	}
}


public class Lab1 {

	public static void main(String[] args) {
		boolean CC=true;
		Scanner input = new Scanner(System.in);
		int Cap = 0;

		while(CC==true) {
			try 
			{
				System.out.print("Input capacity: ");
				String InputCap = input.nextLine();
				Cap=Integer.parseInt(InputCap);
			} catch (NumberFormatException e) {}
			if(Cap!=0) {
				CC=false;
			}
		}
		System.out.println(" ");
		Array array = new Array(Cap);
		array.initialize();
		
		for(int i=0;i<Cap;i++) {
			System.out.print(i+". Input: ");
			String item = input.nextLine();
			array.Populate(i, item);
		}
		
		System.out.println(" ");
		System.out.println("Array: ");
		array.display();
		System.out.println(" ");
		System.out.println("Array in Ascending order: ");
		array.displayAscending();
		System.out.println(" ");
		System.out.println("Array in Reverse: ");
		array.displayReverse();
	}
}
