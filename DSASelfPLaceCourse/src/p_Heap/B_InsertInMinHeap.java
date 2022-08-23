package p_Heap;

public class B_InsertInMinHeap {

	public static void main(String[] args) {
		
		A_ImplementMinHeap obj = new A_ImplementMinHeap(10);
		obj.insert(10);
		obj.insert(20);
		obj.insert(15);
		obj.insert(40);
		obj.insert(50);
		obj.insert(100);
		obj.insert(25);
		obj.insert(45);
		
		obj.print();
		
		obj.insert(12);
		
		obj.print();

	}

}
