
public class HW07_4110056015_2 extends LLK {

	public static void main(String[] args) {
		int[][] A = {{1,2},{5,2},{-1,0},{8,3}};
		long n = System.nanoTime();
		HW07_4110056015_2 t =new HW07_4110056015_2();
		System.out.printf("%09d\n",System.nanoTime()-n);
		System.out.print(t.checkLLK(A));
		
	}
	
	public boolean checkLLK(int[][] array) {
		if(array.length<3)
			return false;
		double[][] M = new double[array.length][array.length];
		for(int i = 1;i<array.length;i++) {
			for(int j = 0; j < i;j++) {
				M[i][j]=(double)(array[i][1]-array[j][1])/(double)(array[i][0]-array[j][0]);
			}
		}
		for(int k=2;k<array.length;k++) {
			for(int i=1;i<k;i++) {
				for(int j=0;j<i;j++) {
					if(M[k][i]==M[k][j])
						return true;
				}
			}
		}
		return false;
	}
	

}
