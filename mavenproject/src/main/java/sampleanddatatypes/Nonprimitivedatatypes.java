package sampleanddatatypes;

public class Nonprimitivedatatypes { //no fixed size ,called wrapper class or predefined class: string ,array ,class ,interface, object

	public static void main(String[] args) {
		String name="Ashna";                //string
		int[] num= {1,2,3};                 // array
		Integer age=27;                     //wrapper class
		int[][] matrix= {{1,2},{3,4},{5,6}};//2d array
		System.out.println("String: "+name);
		System.out.println("Age: "+age);
		System.out.println("Array: "+num[0]);
		System.out.println("2D Array: "+matrix[0][1]);


	}

}
