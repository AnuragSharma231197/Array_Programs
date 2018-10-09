import java.util.*;
public class SumRow{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the index of array");
	int index=scan.nextInt();
	System.out.println("Enter the values size of array");
	int values=scan.nextInt();
	int array[][]=new int[index][values];
	System.out.println("Enter the values of array");
	for(int i=0;i<index;i++){
		for(int j=0;j<values;j++){
			array[i][j]=scan.nextInt();
			}
		}
		
		int array1[]=new int[index];
		for(int i=0;i<index;i++){
			int sum=0;
			for(int j=0;j<array[i].length;j++){
				sum=sum+array[j][i];
				array1[i]=sum;
			}
		}
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
		}
	}
}