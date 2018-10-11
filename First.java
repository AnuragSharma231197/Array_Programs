import java.util.*;
public class First{
public void fr(int array[]){
	int sort=0;
	for(int i=0;i<array.length;i++){
		for(int j=0;j<i;j++){
			if(array[i]<array[j]){
				sort=array[j];
				array[j]=array[i];
				array[i]=sort;
			}
		}
	}
	for(int i=0;i<array.length;i++){
		for(int j=i+1;j<array.length;j++){
			if(array[i]!=array[j]){
				System.out.println(array[j]);
				break;
			}
		}
	}
}
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size=scan.nextInt();
	int array[]=new int[size];
	System.out.println("Enter the Elements");
	for(int i=0;i<size;i++){
		array[i]=scan.nextInt();
		}
		First f=new First();
		f.fr(array);
	}
}