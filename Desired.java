import java.util.*;
public class Desired{
public static void main(String []args){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of array");
	//size of Array Scan
	int sizeofarray=scan.nextInt();
	int desiredarray[]=new int[sizeofarray];
	System.out.println("enter the elements of array");
	for(int i=0;i<desiredarray.length;i++){
		desiredarray[i]=scan.nextInt();
		}
		int sorting=0;
	for(int i=0;i<desiredarray.length;i++){
		for(int j=0;j<i;j++){
			if(desiredarray[j]>desiredarray[i]){
				sorting=desiredarray[j];
				desiredarray[j]=desiredarray[i];
				desiredarray[i]=sorting;
						}
					}
				}
				int count=0;
				int counta=0;
				int countb=0;
				int sumcount=0;
				int temp=0;
				int tempbig=0;
				int countfirstzero=0;
				int lesstwo=0;
				int random=0;
				int samevalue=0;
				for(int i=0;i<desiredarray.length;i++){
					if(desiredarray[0]==0){
						count=count+1;
					}
					else if(desiredarray[0]==desiredarray[i]){
						temp=desiredarray[0];
						while(temp>0){
							if(temp%2!=0){
								temp=temp-1;
								counta=counta+1;
								System.out.println("first if of a[0]==a[i]"+counta);
								if(temp%2==0){
									temp=temp/2;
									
								}
								samevalue=counta+countb;
							}
							
							
							else if(temp%2==0){
								temp=temp/2;
								counta=counta+1;
								if(temp%2!=0){
									temp=temp-1;
									countb=countb+1;
								}
							}
							samevalue=counta+countb;
						}
					}
					else if(desiredarray[i]<2){
						if(desiredarray[i]==0){
							System.out.println("Empty array");
						}
						else {
							desiredarray[i]=desiredarray[i]-1;
							lesstwo=lesstwo+1;
						}
						
					}
					else if(desiredarray[i]%2!=0){
					tempbig=desiredarray[i];
						while(tempbig>0){
							if(tempbig%2!=0){
								tempbig=tempbig-1;
								counta=counta+1;
								if(tempbig%2==0){
									tempbig=tempbig/2;
									countb=countb+1;
								}
								countfirstzero=counta+countb;
							}
							
							else if(tempbig%2==0){
								tempbig=tempbig/2;
								counta=counta+1;
								if(tempbig%2!=0){
									tempbig=tempbig-1;
									countb=countb+1;
								}
								countfirstzero=counta+countb;
							}
							
							else{
								System.out.println("Error");
							}
						}
					}
				}
				if(count>=desiredarray.length){
					System.out.println("Operations:0");
				}
				else if(samevalue>0){
					System.out.println("Operations:"+samevalue);
				}				
				else if(lesstwo>0){
					System.out.println("Operations:"+lesstwo);
				}
				else if(countfirstzero>0){
					System.out.println("Operations:"+countfirstzero);
				}
			}
		}
	