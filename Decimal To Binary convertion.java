import java.util.*;
public class binaryConvertion {

	public static void main(String[] args) {
		System.out.print("Enter the decimal number = ");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int d=0,i=1,c;
		while(b!=0) {
			c=b%2;
			b=b/2;
			d=d+c*i;
			i=i*10;
		}
		System.out.println("Binary code to given decimal is "+d);
	}

}