package prasath;
import java.util.*;
public class caesar_cipher {
	public static void main(String[] args){
		int b=0,y;
		System.out.print("Enter the Plain Text = ");
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		System.out.print("Enter the Shift  = ");
		int x = in.nextInt();		
		char c;
		for(int i=0;i<=a.length()-1;i++) {
		c = a.charAt(i);
		b = c;
		if(b>=97 && b<=122) {
			y=(b+x-97)%26+97;
			char d =(char) y;
			System.out.print(d);
		}
		else if(b>=65 && b<=90){
			y=(b+x-65)%26+65;
			char d =(char) y;
			System.out.print(d);
		}else {
			System.out.print(" ");
		}
		}System.out.println();
		System.out.println("Above text is caesar cipher ");
}
}
