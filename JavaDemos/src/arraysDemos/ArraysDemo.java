package arraysDemos;

import java.util.Arrays;

public class ArraysDemo {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int b[]=new int[5];
	b[0]=15;
	b[1]=25;
	b[2]=35;
	b[3]=45;
	b[4]=55;
	
	int arr[]= {12,34,25,67,88};
	
	System.out.println("The size of the array is "+arr.length);
	
	System.out.println("#3rd element in arr array "+arr[2]);
	
	//printing original array
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	int temp =0;
	//sorting array
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	//to print sorted array
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	//to sum all elements
	int sum =0;
	
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	//System.out.println(sum);
	
	
	
	
	
}
}