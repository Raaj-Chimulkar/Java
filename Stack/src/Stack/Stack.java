package Stack;

import java.util.Arrays;

public  class Stack {

	static int top = -1;				//initialising top as -1
	static int[] arr = new int[5] ;

	
//inserting element on stack
	public static void push(int ele) {
		if (top == arr.length)
			System.out.println("Stack is Full...");
		top++;
		arr[top] = ele;
		
	}

//deleting element from stack
	public static int pop() {
		if (top == -1)
			System.out.println("Stack is Empty...");
		int ele = arr[top];
		top--;
		return ele;
	}

//sorting the Stack array
	public static void sortArray(int arr[]) {
		Arrays.sort(arr);
		for(int i : arr)
			System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		push(4);
		push(5);
		push(49);
		push(9);
		push(12);
		System.out.println("Poppped ele:" + pop());
		System.out.println("Poppped ele:" + pop());
		System.out.println("Poppped ele:" + pop());
		System.out.println("Poppped ele:" + pop());
		System.out.println("Poppped ele:" + pop());
		
		sortArray(arr);
	}

}

