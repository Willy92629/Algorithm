
public class HW03_4110056015_2 extends One_0k_rock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW03_4110056015_2 f = new HW03_4110056015_2();
		long t1 = System.nanoTime();
		String A[] = {"00001111","","000011","001111","0001111","00000000001111111111"};
		boolean F[] = f.one0k(A);
		
		for(int i = 0 ;i<F.length;i++) {
			System.out.println(F[i]);
		}
		
		System.out.printf("\n%010d",(System.nanoTime()-t1));
	}

	public boolean[] one0k(String[] A) {
		boolean[] sta = new boolean[A.length];
		int a;
		for(int i = 0 ;i < A.length;i++){
			sta[i] = true;
			a = A[i].length();
			if(A[i].length() == 0) {
				sta[i] = false;
				continue;
			}
			if(A[i].length() %2 != 0) {
				sta[i] = false;
				continue;
			}
			if(A[i].indexOf("1") != (A[i].length()/2)) {
				sta[i] = false;
			}
			if(A[i].indexOf("0") != 0) {
				sta[i] = false;
			}
			for(int j = 0;j<a>>1;j++) {
				if(A[i].charAt(j)!='0'||A[i].charAt(a-j-1)!='1') {
					sta[i] = false;
					break;
				}
			}
		}
		return sta;
	}
}
