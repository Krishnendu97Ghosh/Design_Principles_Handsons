package design_principles2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Mercedes/Audi?");
		String str = sc.nextLine();
		Factory factory;
		if(str.contentEquals("Mercedes"))
		{
			factory = new MercedesFactory();
			Headlight headlight = factory.makeHeadlight();
			Tire tire = factory.makeTire();
			headlight.print();
			System.out.print(" and ");
			tire.print();
			
		}
		else
		{
			factory = new AudiFactory();
			Headlight headlight = factory.makeHeadlight();
			Tire tire = factory.makeTire();
			headlight.print();
			System.out.print(" and ");
			tire.print();
		}

	}

}
