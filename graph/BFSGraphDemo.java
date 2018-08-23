package com.graph;

public class BFSGraphDemo {

	public static void main(String[] args) {
		/*
		 * 			0					Pre-order: 0 1 3 4 2 5 -> root-left-right
		 * 		   / \
		 * 		  1   2					In- order: 3 1 4 0 2 5 -> left-root-right
		 * 		 / \   \
		 * 		3   4   5  				Postorder: 3 4 1 5 2 0-> left-right-root
		 */
		BFSGraph g=new BFSGraph(6);
		g.add(0, 2);
		g.add(0, 1);
		g.add(1, 4);
		g.add(1, 3);
		g.add(1, 0);
		g.add(3, 1);
		g.add(4, 1);
		g.add(2, 5);
		g.add(2, 0);
		g.add(5, 2);
		
		g.BFSExplore(0);

	}

}
