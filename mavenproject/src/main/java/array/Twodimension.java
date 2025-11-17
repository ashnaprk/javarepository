package array;

public class Twodimension {

	public static void main(String[] args) {
		int num[][]= {{4,6,8},{6,2,0},{7,5,4}};
		System.out.println("2D ARRAY");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
