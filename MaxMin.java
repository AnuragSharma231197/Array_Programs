import java.util.*;
public class MaxMin{

public void array(int x[], int y[]){
	int temp=0;
	int temp1=0;
	for(int i=0;i<x.length;i++){
			for(int j=0;j<=i;j++){
				if(x[i]>x[j]){
					temp=x[i];
					x[i]=x[j];
					x[i]=temp;
						}
					
					}
				}
				
				for(int i=0;i<x.length;i++){
				for(int j=0;j<=i;j++){
				if(y[i]>y[j]){
					temp1=y[i];
					y[i]=y[j];
					y[i]=temp1;
						}
			}
		}
		
			
				if(x[x.length-1]>y[y.length-1]){
					System.out.println("Max is x:"+x[x.length-1]);
				}
				else if(y[y.length-1]>x[x.length-1]){
					System.out.println("Max is y:"+y[y.length-1]);
				}
				else{
					System.out.println("error");
				}
			
	}
	public static void main(String []args){
	MaxMin m=new MaxMin();
	m.array(new int[]{1,2,3,4,5}, new int[]{2,3,4,5,6});
	
	}
}