import java.util.*;
public class MatrixAdd{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the index of Matrix 1");
	int index=scan.nextInt();
	System.out.println("Enter the Values of Matrix 1");
	int values=scan.nextInt();
	int array[][]=new int[index][values];
	System.out.println("Enter the elements of Matrix 1");
	for(int i=0;i<index;i++){
		for(int j=0;j<values;j++){
			array[i][j]=scan.nextInt();
			}	
		}
		System.out.println("Enter the index of Matrix 2");
		int index1=scan.nextInt();
		System.out.println("Enter the values of Matrix 2");
		int values1=scan.nextInt();
		int array1[][]=new int[index1][values1];
		System.out.println("Enter the elements of Matrix 2");
		for(int i=0;i<index1;i++){
			for(int j=0;j<values1;j++){
				array1[i][j]=scan.nextInt();
			}	
		}
		int finalarray[][]=new int[index][values];
		for(int i=0;i<index;i++){
			for(int j=0;j<values;j++){
					finalarray[i][j]=array[i][j]+array1[i][j];
			}
		}
		System.out.println("Result Matrix-");
		for(int i=0;i<index;i++){
			for(int j=0;j<values;j++){
					System.out.print(finalarray[i][j]+" ");
			}
			System.out.println();
		}
	}
}