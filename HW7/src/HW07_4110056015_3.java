
public class HW07_4110056015_3 extends LLK {

	public static void main(String[] args) {
		int[][] A = {{1,2},{5,2},{-1,0},{8,3}};
		long n = System.nanoTime();
		HW07_4110056015_3 t =new HW07_4110056015_3();
		System.out.printf("%09d\n",System.nanoTime()-n);
		System.out.print(t.checkLLK(A));
		
	}
	boolean ans=false;
	public boolean checkLLK(int[][] array) {
		if(array.length<3)
			return false;
		double[][] M = new double[array.length][array.length];
		for(int i = 1;i<array.length;i++) {
			for(int j = 0; j < i;j++) {
				M[i][j]=(double)(array[i][1]-array[j][1])/(double)(array[i][0]-array[j][0]);
			}
		}
		finds[] F=new finds[16];
		for(int i=0;i<16;i++) {
			F[i] = new finds(M,i);
			F[i].run();
		}
		return ans;
	}
	
	class finds extends Thread{
		double[][] M;
		int num;
		int max;
		public finds(double[][] array,int p) {
			M = array;
			num = p;
			max = (p+1)*(M.length/15) > M.length?M.length:(p+1)*(M.length/15);
		}
		public void run() {
			int k = num*(M.length/15) > 2 ? num*(M.length/15) :2;
			for(;k<max;k++) {
				for(int i=1;i<k;i++) {
					for(int j=0;j<i;j++) {
						if(Math.abs(M[k][i]-M[k][j])<Math.pow(10, -6)) {
							ans = true;
							return;
						}
					}
				}
			}
		}
	}
}
