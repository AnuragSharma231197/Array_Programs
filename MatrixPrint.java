import java.util.*;
public class MatrixPrint{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	int index=scan.nextInt();
	int value=scan.nextInt();
	int array[][]=new int[index][value];
	for(int i=0;i<index;i++){
		for(int j=0;j<value;j++){
			array[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}