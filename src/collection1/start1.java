package collection1;

import java.util.*;

public class start1 {
	public static void main(String[] args) {
		int a[] = new int[5];
		ArrayList<Integer> aa = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			aa.add(i);
		System.out.println(aa);
		System.out.println(aa.get(4));
		aa.set(2, 300);
		aa.set(9, 900);
		aa.set(0, 500);
		aa.remove(3);

		System.out.println(aa);
		aa.contains(300);
		aa.add(100);
		aa.add(200);
		aa.add(330);

		System.out.println(aa);
		for (int i : aa)
			System.out.println(i);
		Iterator<Integer> i = aa.iterator();
		System.out.println("using iterator");
		ListIterator<Integer> li = aa.listIterator();
		System.out.println("using list iterator");

		while (i.hasNext()) {
			System.out.println(i.next());

		}

		ArrayList slist = new ArrayList();
		slist.add("dhinesh");
		slist.add("gh");
		slist.add("0");

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("hello everyone");
		System.out.println(ll);
		ll.getFirst();
		ll.getLast();

		// ARRAYLIST
		// LINKEDLIST
		// ITERATOR---- ONE BY ONE IT WILL BE SHOWN
	}
}
