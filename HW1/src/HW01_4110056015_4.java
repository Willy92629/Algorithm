
public class HW01_4110056015_4 extends ArrayData {

	int min,max;
	public HW01_4110056015_4(int [] A) {
		int i;
		this.A = A;
	}
	public static void main(String[] args) {
		long t1 = System.nanoTime();
		int[] A = {10,5,8,9,20,40,60,20};
		HW01_4110056015_4 T = new HW01_4110056015_4(A);
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
