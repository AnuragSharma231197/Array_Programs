import java.util.*;
public class ArrayMsorting{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	//size of String array
	System.out.println("Enter the size of String array");
	int Stringsize=scan.nextInt();
	//String array
	String StringArray[]=new String[Stringsize];
	// Least Priority e.g=5;
	System.out.println("Enter the size of Least Priority array");
	int LeastPriority=scan.nextInt();
	System.out.println("Enter the size of Integer array");
	// Size of integer array
	int sizeofarray=scan.nextInt();
	System.out.println("Enter the elements of integer array");
	// Integer array with inserted priority
		int arrayofpriority[]=new int[sizeofarray];
		for(int i=0;i<arrayofpriority.length;i++){
			arrayofpriority[i]=scan.nextInt();
		}
		System.out.println("Enter the String array elements");
		//Scanning String array
		for(int i=0;i<StringArray.length;i++){
			StringArray[i]=scan.next();
		}
		int k=0;
		//predefined Priority array
		int prearray[]=new int[LeastPriority+1];
		for(int i=0;i<=LeastPriority;i++){
			prearray[i]=i;
		}
		int arrayPriority[]=new int[sizeofarray];
		for(int i=0;i<prearray.length;i++){
			for(int j=0;j<arrayofpriority.length;j++){
				if(prearray[i]==arrayofpriority[j]){
					arrayPriority[k]=j;
					k=k+1;
				}	
			}
		}
		
		
		for(int i=0;i<StringArray.length;i++){
			System.out.println(StringArray[arrayPriority[i]]);
		}
		
		
		
	}
}