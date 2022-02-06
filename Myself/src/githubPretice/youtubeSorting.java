package githubPretice;

public class youtubeSorting {
//	reverse -- wrong
static int partition (int[] a,int i, int j){

	
	int pivot = a[(j+i)/2];
	
	while(i<=j) {
	      while(a[i]>pivot) {
		
		i++;}

	       while(a[j]< pivot) {
		j--;}
	
	if(i<=j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		i++;
		j--;
	
	}
	}
	
return i;
	
}
static void quicksort(int[] a, int l,int h) {

	
		int piovt = partition(a,l,h);
		if(l<piovt-1) {
			quicksort(a, l, piovt-1);
		}
		if(piovt>h) {
			quicksort(a, piovt, h);
		}
		
	
}
static void print(int[] arr) {
	
	for(int i: arr) {
		System.out.print(i+" ");
	}
}
public static void main(String[] args) {
	int a[] = {4, 2,0 ,10, 18, 2, 6, 12, 1,4, 8, 16};
	quicksort(a,0, a.length-1);
	print(a);
}
}
