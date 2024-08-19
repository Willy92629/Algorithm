
public class HW05_4110056015_3 extends littlebit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW05_4110056015_3 f = new HW05_4110056015_3();
		long t1 = System.nanoTime();
		int A[] = {2,5,1,6,4,8}; 
		int F = f.l_bit(A);
		
		System.out.println(F);
		
		System.out.printf("\n%010d",(System.nanoTime()-t1));
	}
	public int l_bit(int[] A) {
		int n = A.length;
	    int[] coin = new int[n];
	    
	    coin[0] = 1;
	    
	    for (int i = 1; i < n; i++) {
	        if (A[i] > A[i-1]) {
	            coin[i] = coin[i-1] + 1;
	        }else if(A[i] == A[i-1]) {
	        	coin[i] = coin[i-1];
	        }else {
	            coin[i] = 1;
	        }
	    }
	    int R = 0;
	    for (int i = n-2; i >= 0; i--) {
	        if (A[i] > A[i+1]) {
	            coin[i] = coin[i] > coin[i+1]+1?coin[i] : coin[i+1]+1;
	        }else if (A[i] == A[i+1]) {
	        	coin[i] = coin[i+1];
	        }
	        R += coin[i];
	    }
	    R+=coin[n-1];
	    return R;
	}
	

}
