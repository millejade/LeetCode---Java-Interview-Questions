/*
This program uses brute-force and LinkedList. 

Problem: You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example: 
Input: list1 = [2,4,3] 
       list2 = [5,6,4]
Output: [7,0,8]
Explanation: 243 + 564 = 708

Please modify the List 1 and List 2 in the main method to test other values.

ll1 = LinkedList 1
ll2 = LinkedList 2
ll3 = Sum of ll1 and ll2

*/

//Problems from leetcode.com

import java.util.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {

		LinkedList<Integer> ll1 = new LinkedList<>();
		
		ll1.addFirst(2);
		ll1.add(4);
		ll1.addLast(3);
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		ll2.addFirst(5);
		ll2.add(6);
		ll2.addLast(4);
		
		System.out.println(add(ll1,ll2)); //printout the return list (which is ll3)
		
				
	}
	
	public static LinkedList add(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {
		
		LinkedList<Integer> ll3 = new LinkedList<>();
		int carry = 0;
		
		for(int i = 0; i < ll1.size(); i++) { //traverse the list
			
			int sum = ll1.get(i)+ll2.get(i); //get the sum of element at the same indexes
			ll3.add(sum); //add it to the List
			
			if(carry  > 0) { //if there's a carry, add this carry to the next sum of two elements
				ll3.set(i, sum + carry);
				carry = 0; //then set again the carry to zero
			}
			
			if(ll3.get(i) > 9) { //if the sum is more than one-digit, get only the right-side digit
				carry = ll3.get(i)/10;
			}
			
		}
		return ll3;
		
	}

}
