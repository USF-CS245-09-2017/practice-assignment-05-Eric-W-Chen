import java.util.Arrays;
public class MergeSort implements SortingAlgorithm{

private void merge(int[] a, int[] left, int[] right){
	int ai=0;
	int left_i=0;
	int right_i=0;
	while(left_i<left.length&&right_i<right.length){
		if (left[left_i] <= right[right_i]) {
			a[ai] = left[left_i];
			ai++;
			left_i++;
			
		}
		else{
			a[ai]=right[right_i];
			ai++;
			right_i++;
		}
	}
	while(left_i<left.length){
		a[ai++] = left[left_i++];
	}
	while (right_i<right.length) {
		a[ai++] = right[right_i++];	
	}
}

@Override
public void sort(int[] a){

	int mid = a.length/2; 

	if(a.length >= 2){

	int[] left = Arrays.copyOfRange(a, 0, mid);
	int[] right = Arrays.copyOfRange(a, mid, a.length);

	sort(left);
	sort(right);
	merge(a, left, right);
	}
}

}