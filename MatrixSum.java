import java.util.*;
public class MatrixSum{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Rows");
	int index=scan.nextInt();
	System.out.println("Enter the Columns");
	int values=scan.nextInt();
	int array[][]=new int[index][values];
	System.out.println("Enter the Elements of Matrix");
	for(int i=0;i<index;i++){
		for(int j=0;j<values;j++){
			array[i][j]=scan.nextInt();
			}
		}
		
		int sum=0;
		for(int i=0;i<index;i++){
			for(int j=0;j<values;j++){
				sum=sum+array[i][j];
			}
		}
		System.out.println("Sum of Matrix:"+sum);
	
	}
}