import java.util.*;
public class Max{
public int array(int x[]){
	int temp=0;
		for(int i=0;i<x.length;i++){
				for(int j=0;j<=i;j++){
						if(x[i]>x[j]){
							temp=x[i];
							x[i]=x[j];
							x[j]=temp;
						}
				}
				
		}
		System.out.println("Max:"+x[0]);
		return 0;
}
public static void main(String []args){
	Max a=new Max();
	a.array(new int[]{1,2,3,4,5});
	
	
	
	}
}