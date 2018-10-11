import java.util.*;
public class TriangleBMax{
public void bmax(int array[][], int index, int elements){
	int max=array[index-1][elements-1];
	for(int i=index-1;i>=0;i--){
		for(int j=elements-1;j>=i;j--){
			if(max<array[i][j]){
				max=array[i][j];
				}
				//System.out.print(""+array[i][j]);
			}
			
		}
		System.out.println("Max is:"+max);
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
		TriangleBMax t=new TriangleBMax();
		t.bmax(array,index,elements);
	}
}