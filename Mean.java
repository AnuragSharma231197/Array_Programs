import java.util.*;
public class Mean{
	int Average;
public int mean(int array[]){
	int sum=0;
	for(int i=0;i<array.length;i++){
		sum=sum+array[i];
	}
	Average=sum/array.length;
	return Average;
}
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size=scan.nextInt();
	int array[]=new int[size];
	System.out.println("Enter the elements of Array");
	for(int i=0;i<array.length;i++){
		array[i]=scan.nextInt();
		}
			Mean m=new Mean();
			System.out.println("Mean is:"+m.mean(array));
	}
}