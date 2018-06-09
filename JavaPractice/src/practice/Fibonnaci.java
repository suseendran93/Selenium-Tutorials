package practice;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		System.out.println(n1+"\n"+n2);
		for(int n=2;n<10;n++) {//Here n=2 because first two numbers are already printed
		
		int n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;

	}
	}
}
