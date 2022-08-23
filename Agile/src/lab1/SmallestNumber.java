package lab1;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2, 5, 1 ,9 ,8 ,7,6 , 3,4};
		int smallestNumber=array[0];
		for(int i =1; i<array.length; i++) {
			if(array[i]<smallestNumber) {
				smallestNumber=array[i];
			}
		}
		System.out.println("The smallest number is "+smallestNumber);

	}

}
