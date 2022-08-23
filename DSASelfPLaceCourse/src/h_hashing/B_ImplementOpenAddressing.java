package h_hashing;

public class B_ImplementOpenAddressing {

	public static void main(String[] args) {
		MyHash1 obj = new MyHash1(7);
		obj.insert(49);
		obj.insert(50);
		obj.insert(63);
		obj.insert(64);
		obj.insert(69);
		obj.insert(68);
		
		obj.print();
		
		

	}

}

class MyHash1{
	
	int arr[];
	int cap;
	int size;
	
	MyHash1(int c){
		cap = c;
		size = 0;
		arr = new int[cap]; 
		for(int i=0; i<cap; i++) {
			arr[i] = -1;
		}
	}
	
	int hash(int key) {
		return key%cap;
	}
	
	
	
	boolean insert(int key) {
		
		if(size == cap) {
			return false;
		}
		int i = hash(key);
		while(i != -1 && i != (-1*2) && arr[i] != key) {
			i = (i+1) %cap;
		}
		if(arr[i] == key) {
			return false;
		}else {
			arr[i] = key;
			size++;
			return true;
		}
		
	}
	boolean search(int key) {
		int h = hash(key);
		int i = h;
		while(arr[i] != -1) {
			if(arr[i] == key) {
				return true;
			}
			i = (i+1)%cap;
			if(i==h) {
				return false;
			}
		}
		return false;
	}
	boolean delete(int key) {
		int h = hash(key);
		int i = h;
		while(arr[i] != -1) {
			if(arr[i] == key) {
				arr[i] = -2;
				return true;
			}
			i = (i+1) % cap;
			if(i == h) {
			}
		}
		return false;
	}
	
	void print() {
		for(int i=0; i<cap; i++) {
			System.out.println(arr[i]);
		}
	}
}
