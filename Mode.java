import java.util.*;
public class Mode{
	public void mode(int array[]){
		int maxcount=0;
		int maxvalue=0;
			int array1[]=new int[array.length];
			for(int i=0;i<array.length;i++){
				int count=0; 
				for(int j=0;j<array.length;j++){
					if(array[i]==array[j]){
						count=count+1;
						//array[j]=0;
					}
				}
				if(count>maxcount){
					maxcount=count;
					maxvalue=array[i];
				}
			}
			System.out.println("Mode Value:"+maxvalue);
	}
public static void main(String []args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=scan.nextInt();
int array[]=new int[size];
System.out.println("Enter the elements of array");
for(int i=0;i<array.length;i++){
	array[i]=scan.nextInt();
		}
		Mode m=new Mode();
		m.mode(array);
	}
}