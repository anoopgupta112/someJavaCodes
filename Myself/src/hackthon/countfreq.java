package hackthon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// this is hackthon pretice

//finding frequency using for loops
class dublicate{
	static void usingIteration() {
	int arr[] = {1,2,3,1,4,5,4,3,3};
	int arr2[] = new int[arr.length];
	int visited = -1;
	for(int i = 0;i<arr.length;i++) {
		int count=1;
		for(int j = i+1;j<arr.length;j++) {
        if(arr[i] == arr[j]) {
	      count++;
	       arr2[j] = visited;
	      
	
}

	}
		if(arr2[i] != visited) 
			arr2[i] = count;
		
			
	
		if(arr2[i] != visited)
		System.out.println("freq of "+arr[i]+" is : "+ arr2[i]);
		
}
}}

class freque {
	static void count() {
	int arr[] = {1,2,3,1,4,5,4,3,5,3};
	int arr2[] = new int[arr.length];
	int visited = -1;
	for(int i = 0;i<arr.length;i++) {
		int count = 1;
		for(int j =i+1;j<arr.length;j++) {
			
			if(arr[i] == arr[j]) {
				
				count++;
				arr2[j] = visited;
			}
			
			
		}
		if(arr2[i] != visited) {
			arr2[i]= count;
			
		}
		if(arr2[i] != visited) {
			System.out.println("freq of "+arr[i]+" is : "+ arr2[i]);
		}
		
	}}
}


//finding frequency of each element using hash map

class freq{
	static void dublicate() {
		int arr[] = {1,2,3,1,4,5,4,3,5,3};
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i: arr) {
			if(!hm.containsKey(i)) 
				hm.put(i, 1);
			else 
				hm.put(i, hm.get(i)+1);
		
		}
		for(Integer x: hm.keySet()) {
			if(hm.get(x) > 1)
			System.out.println("dublicate element is "+ x);
		}
		
	}
}

public class countfreq {
public static void main(String[] args) {
//	dublicate.usingIteration();
//	freq.dublicate();
	freque.count();
}}
