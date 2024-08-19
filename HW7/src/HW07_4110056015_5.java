
public class HW07_4110056015_5 extends LLK {

	public static void main(String[] args) {
		int[][] A = {{1,2},{5,2},{-1,0},{8,3}};
		long n = System.nanoTime();
		HW07_4110056015_5 t =new HW07_4110056015_5();
		System.out.printf("%09d\n",System.nanoTime()-n);
		System.out.print(t.checkLLK(A));
		
	}
	public boolean checkLLK(int[][] array) {
		int n = array.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				int rise = array[j][1] - array[i][1];
				int run = array[j][0] - array[i][0];
				for (int k = j + 1; k < n; k++) {
					if (rise * (array[k][0] - array[i][0]) == run * (array[k][1] - array[i][1])) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
