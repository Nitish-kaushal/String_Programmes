package Programmes;

public class Programm15 {
	public static void main(String[] args) {
		String s1="abc d";
		byte[] x=s1.getBytes();
		for(byte p:x)
			System.out.print(p+" ");
		System.out.println();
		for(byte p:x)
			System.out.print((char)p+" ");
	}

}
