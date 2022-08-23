package b_bitMagic;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3; int y =6;
		System.out.println(x&y); //bitwise AND
		
		System.out.println(x|y); //bitwise OR
		
		System.out.println(x^y); //Bitwise XOR
		
		System.out.println(~1); //Bitwise NOT
		System.out.println(~5); //Bitwise NOT
		
		

		System.out.println();
		System.out.println(5<<1); //Left Shift Operator
		System.out.println(-2<<1); //Left Shift Operator
		System.out.println(3<<30); //Left Shift Operator
		
		System.out.println();
		System.out.println(56>>1); //Unsigned Right Shift Operator
		System.out.println(-2>>2); //Unsigned Right Shift Operator for negative msb is filled with 1
		
		System.out.println();
		System.out.println(-2>>>1); //signed Right Shift Operator for negative msb is filled with 1
		
	}

}
