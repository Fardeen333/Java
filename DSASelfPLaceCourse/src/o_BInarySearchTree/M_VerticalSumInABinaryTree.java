package o_BInarySearchTree;

import java.util.Map;
import java.util.TreeMap;

public class M_VerticalSumInABinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		root.right = new Node(50);
		
		verticalSum(root);
		

	}
	
	
	//O(nlog(hd) + hd) == O(nlog(hd)) where hd is total no. of possible horizontal distances 
	public static void verticalSum(Node root) {
		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
		fillTreeMapWithVeticalSum(root, 0, m);
		for(Map.Entry<Integer, Integer> e: m.entrySet()) {
			System.out.print(e.getValue()+" ");
		}
	}
	
	
	//hd == horizontal distance from root
	public static void fillTreeMapWithVeticalSum(Node root, int hd, TreeMap<Integer, Integer> m) {
		if(root == null) {
			return;
		}
		fillTreeMapWithVeticalSum(root.left, hd-1, m);
		int prevSum = (m.get(hd) == null) ? 0 : m.get(hd);
		m.put(hd, prevSum+root.key);
		fillTreeMapWithVeticalSum(root.right, hd+1, m);
	}

}
