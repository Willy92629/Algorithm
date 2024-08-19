
public class HW01_4110056015_3 extends ArrayData {

	int min,max;
	public HW01_4110056015_3(int [] B) {
		min = B[0];
		max = B[0];
		for(int i = 1;i<B.length;i++) {
			if(B[i]>max) 
				max = B[i];
			else if(B[i]< min)
				min = B[i];
		}
	}
	public static void main(String[] args) {
		long t1 = System.nanoTime();
		int[] A = {10,5,8,9,20,40,60,20};
		HW01_4110056015_3 T = new HW01_4110056015_3(A);
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
