import java.util.*;
public class MaxRow{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the Row of Matrix");
	int index=scan.nextInt();
	System.out.println("Enter the Column of Matrix");
	int valueindex=scan.nextInt();
	int array[][]=new int[index][valueindex];
	System.out.println("Enter the Elements of Matrix");
	for(int i=0;i<index;i++){
		for(int j=0;j<valueindex;j++){
			array[i][j]=scan.nextInt();
			}
		}
		int temp=0;
		for(int i=0;i<index;i++){
			for(int j=0;j<valueindex;j++){
				for(int a=0;a<index;a++){
					for(int b=0;b<valueindex;b++){
							if(array[i][j]<array[a][b]){
								temp=array[a][b];
								array[a][b]=array[i][j];
								array[i][j]=temp;
						}
					}
				}
			}
		}
		for(int i=0;i<index;i++){
			for(int j=0;j<valueindex;j++){
				System.out.print(array[i][j]);
			}
			System.out.print(" "+"Max is"+" "+array[i][index-1]);
			System.out.println();
		}
	}
}