package p_Heap;

public class D_DecreaseKey_Delete_BuildHeap {

	public static void main(String[] args) {
		
		System.out.println("for viewing the working of decreaseKey()");
		A_ImplementMinHeap obj = new A_ImplementMinHeap(10);
		obj.insert(10);
		obj.insert(20);
		obj.insert(40);
		obj.insert(80);
		obj.insert(100);
		obj.insert(70);
		obj.print();
		obj.decreaseKey(3, 5);
		obj.print();
		
		System.out.println();
		System.out.println("for viewing the working of delete()");
		A_ImplementMinHeap obj2 = new A_ImplementMinHeap(10);
		obj2.insert(10);
		obj2.insert(20);
		obj2.insert(30);
		obj2.insert(40);
		obj2.insert(50);
		obj2.insert(35);
		obj2.insert(38);
		obj2.insert(45);
		obj2.print();
		obj2.delete(3);
		obj2.print();
			
	}
}
