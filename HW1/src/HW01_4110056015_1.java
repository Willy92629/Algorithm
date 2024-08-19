
public class HW01_4110056015_1 extends ArrayData {

	int min,max;
	public HW01_4110056015_1(int [] A) {
		int i;
		this.A = A;
		min = A[0];
		max = A[0];
		for(i = 1;i<A.length;i++) {
			if(A[i]>max) 
				max = A[i];
			else if(A[i]< min)
				min = A[i];
		}
	}
	
	public int max() {
		
		return max;
	}
	public int min() {
		
		return min;
	}
}
