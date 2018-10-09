import java.util.*;
public class Array{
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
		for(int i=x.length-1;i>=0;i--){
			System.out.println(x[i]);
		}
		return 0;
}
public static void main(String []args){
	Array a=new Array();
	a.array(new int[]{5,4,3,2,1});
	
	
	
	}
}