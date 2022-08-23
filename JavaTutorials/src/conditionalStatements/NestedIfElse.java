package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1200, b=1800, c=10000;
		int result=0;
//		if (a>b) {
//			if (a>c) {
//				result=a;
//			}else {
//				result=c;
//			}
//		}else {
//			if(b>c) {
//				result=b;
//			}else {
//				result=c;
//			}
//		}
//		result=a>b ? a>c ? a : c : b>c ? b: c;
		result=a>b ? a>c ? a : c : b>c ? b: c;
		System.out.println("Largest of the three number is " + result);

	}

}
