import java.util.*;
public class TriangleB{
public void bsum(int array[][], int index, int elements){
	int sum=0;
	for(int i=index-1;i>=0;i--){
		for(int j=elements-1;j>=i;j--){
			sum=sum+array[i][j];
			}
		}
		System.out.println("Sum is:"+sum);
	}
	public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Rows");
	int index=scan.nextInt();
	System.out.println("Enter the Columns");
	int elements=scan.nextInt();
	int array[][]=new int[index][elements];
	System.out.println("Enter the Elements");
	for(int i=0;i<index;i++){
		for(int j=0;j<elements;j++){
			array[i][j]=scan.nextInt();
			}
		}
		TriangleB t=new TriangleB();
		t.bsum(array,index,elements);
	}
}