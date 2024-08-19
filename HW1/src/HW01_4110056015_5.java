
public class HW01_4110056015_5 extends ArrayData {

	int min,max;
	public HW01_4110056015_5(int [] A) {
		int i;
		this.A = A;
		min = this.A[0];
		max = this.A[0];
		for(i = 1;i<(this.A.length/2)+1;i++) {
			if(this.A[i]>max) 
				max = this.A[i];
			else if(this.A[i]< min)
				min = this.A[i];
			if(this.A[this.A.length-i]>max) 
				max = this.A[this.A.length-i];
			else if(this.A[this.A.length-i]< min)
				min = this.A[this.A.length-i];
		}
	}
	public static void main(String[] args) {
		long t1 = System.nanoTime();
		int[] A = {10,5,8,9,20,40,60,20};
		HW01_4110056015_5 T = new HW01_4110056015_5(A);
		System.out.println(T.max());
		System.out.println(T.min());
		System.out.printf("%010d",(System.nanoTime()-t1));
	}
	
	public int max() {
		
		return max;
	}
	public int min() {
		
		return min;
	}
}
