package o_BInarySearchTree;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class P_BottomViewOfABinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(20);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right = new Node(30);
		root.right.left = new Node(60);

		bottomView(root);
	}
	
	public static void bottomView(Node root) {
		Queue<Pair> q = new ArrayDeque<Pair>();
		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
		q.offer(new Pair(root, 0));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			Node curr = p.node;
			int hd = p.hd;
//			if(m.containsKey(hd)) {
			m.put(hd, curr.key);
			
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
