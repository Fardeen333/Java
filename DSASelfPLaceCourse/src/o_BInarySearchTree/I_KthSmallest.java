package o_BInarySearchTree;

public class I_KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 root = null;
        int keys[] = { 20, 8, 22, 4, 12, 10, 14 };
     
        for (int x : keys)
            root = insert(root, x);
        
        int k = 4;
        Node1 res = kthSmallest(root, k);
        
        if (res == null)
            System.out.println("There are less "
                           + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.key);
	}
	
	//Efficient Approach
	//O(h) time and O(h) space
	public static Node1 kthSmallest(Node1 root, int k) {
		if (root == null)
            return null;
     
        int count = root.lCount + 1;
        if (count == k)
            return root;
     
        if (count > k)
            return kthSmallest(root.left, k);
     
        return kthSmallest(root.right, k - count);
	}
	
	//Insert operation
	public static Node1 insert(Node1 root, int x) {
		if(root == null) {
			return new Node1(x);
		}
		if(x < root.key) {
			root.left = insert(root.left, x);
			root.lCount+=1;
		}else if(root.key < x) {
			root.right = insert(root.right, x);
		}
		return root;
	}

}

class Node1{
	int key;
	Node1 left, right;
	int lCount;
	
	Node1(int key){
		this.key = key;
		left = right =null;
		lCount = 0;
	}
}