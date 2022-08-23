package o_BInarySearchTree;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class O_TopViewOfABinaryTree {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		root.right = new Node(50);
		root.right.left = new Node(60);
		
		topView(root);
		

	}
	
	public static void topView(Node root) {
		Queue<Pair> q = new ArrayDeque<Pair>();
		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
		q.offer(new Pair(root, 0));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
			if(m.containsKey(hd)==false) {
				m.put(hd, curr.key);
			}
			if(curr.left != null) {
				q.offer(new Pair(curr.left, hd-1));
			}
			if(curr.right != null) {
				q.offer(new Pair(curr.right, hd+1));
			}
		}
		for(Map.Entry<Integer,Integer> e: m.entrySet()) {
			System.out.print(e.getValue()+" ");
		}
	}

}
