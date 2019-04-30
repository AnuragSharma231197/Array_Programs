import java.io.*;
public class Repeat{
public static void main(String []args){
	try{
	FileInputStream file=new FileInputStream("C:\\Users\\unmask\\Desktop\\Java Programs\\doc.txt");
	char alphabet_array[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	int count[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	while(file.available()!=0){
		char ch=(char)file.read();
		for(int i=0;i<alphabet_array.length;i++){
			if(ch==alphabet_array[i]){
				count[i]=count[i]+1;
			}
		}
	}
	
	for(int i=0;i<alphabet_array.length;i++){
		System.out.println(alphabet_array[i]+":"+count[i]);
			}
		}
	catch(Exception e){
		e.printStackTrace();
		}
	}
}