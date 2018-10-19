import java.util.*;
public class Frequency{
int count;
public void freq(int array[]){
	for(int i=0;i<array.length;i++){
		count=1;
		for(int j=i+1;j<array.length;j++){
			if(array[i]==array[j]){
				count=count+1;
			}
			
		}
		System.out.println("count of"+" "+array[i]+" "+count);
	}
	

}
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int sizeofarray=scan.nextInt();
	int array[]=new int[sizeofarray];
	System.out.println("Enter the elements");
	for(int i=0;i<array.length;i++){
		array[i]=scan.nextInt();
		}
		Frequency f=new Frequency();
		f.freq(array);
		
	}
}