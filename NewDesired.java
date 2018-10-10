import java.util.*;
public class NewDesired{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	int sizeofarray=scan.nextInt();
	int array[]=new int[sizeofarray];
	for(int i=0;i<array.length;i++){
		array[i]=scan.nextInt();
		}
		int i=0;
		int count=0;
		for(int l=0;l<array.length;l++)
		while(array[l]!=0){
			for(int j=0;j<array.length;j++){
				if(array[j]%2!=0){
					array[j]=array[j]-1;
					count=count+1;
				}
			}
			if(array[l]!=0){
			for(int k=0;k<array.length;k++)
					array[k]=array[k]/2;
					count=count+1;
				}
					
		}
		System.out.println(count);
	}
}