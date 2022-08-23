package o_BInarySearchTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class N_VerticalTraversalOfBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		
		verticalTraversal(root);

	}
	
	//hd -- total no. of possible horizontal distances
	//O(nlog(hd)) time 
	public static void verticalTraversal(Node root) {
		Queue<Pair> q = new ArrayDeque<>();
		TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<Integer, ArrayList<Integer>>();
		q.offer(new Pair(root, 0));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
			if(m.containsKey(hd)) {
				m.get(hd).add(curr.key);
			}else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(curr.key);
				m.put(hd, al);
			}
			if(curr.left != null) {
				q.offer(new Pair(curr.left, hd-1));
			}
			if(curr.right != null) {
				q.offer(new Pair(curr.right, hd+1));
			}
		}
		for(Map.Entry<Integer, ArrayList<Integer>> e: m.entrySet()) {
			System.out.println(e.getValue());
		}
	}

}

class Pair{
	Node node;
	int hd;
	Pair(Node n, int h){
		node = n;
		hd = h;
	}
}
