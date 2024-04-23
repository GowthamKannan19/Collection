package collection1;

import java.util.*;

public class list {
	public static void main(String[] args) {
		Queue<Integer> A = new PriorityQueue<>();
		A.add(6);
		A.add(5);
		A.add(100);

		System.out.println("head is " + A.peek());
		System.out.println("removed" + A.remove());
		System.out.println("now Head is  " + A.peek());
		System.out.println("total"+A.size());
	}
//PriorityQueue--order wise
	//Queue---- normally shown
}
