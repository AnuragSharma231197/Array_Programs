public class Intersection{
public void array(int x[], int y[]){
	int arr[]=new int[100];
	int k=0;
	
			for(int i=0;i<x.length;i++){
				for(int j=0;j<y.length;j++){
					if(x[i]==y[j]){
						arr[k]=x[i];
						k=k+1;
					}
				}
			}
			for(int i=0;i<arr.length-1;i++){
				if(arr[i]==arr[i+1]){
					arr[i]=0;
						}
					}
				
			
			
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=0){
			System.out.println(arr[i]);
		
		}
	}
}
public static void main(String []args){
Intersection n=new Intersection();
n.array(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1});
	}
}