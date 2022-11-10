package javaexamples;

public class CarModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum car{Maruthi(1994),tata(2002),Audi(2009);
			//Creating an enum for creating constant values
			// and giving the enum name as car.
			// inside which we have car name and car model year.
		private int value;  
		private car(int value){  
		this.value=value;  
		}  
		}
		
		//Printing the enum with all values and constants.
		System.out.println("    Car Name\tModel Year");
		for(car c : car.values())
			System.out.println("    "+c+"\t"+c.value);
	}

}
