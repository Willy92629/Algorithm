public class HW06_4110056015_4 extends MedianOfArrays{

	public double find_median(int[][] arrays) {
		int n = arrays.length,N = 0,k=0;
		for(int i=0;i<n;i++) {
			N += arrays[i].length;
		}
		int[] num = new int[N];
		for(int i = 0;i<n;i++) {
			System.arraycopy(arrays[i], 0, num, k, arrays[i].length);
			k+=arrays[i].length;
		}
		timSort(num,N);
		return N%2==1?num[N/2]:(num[N/2]+num[(N/2)-1])/2.0;
	}
	private int MIN_MERGE = 8;
	private void merge(int[] arr, int l,int m, int r){
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int x = 0; x < len1; x++){
            left[x] = arr[l + x];
        }
        for (int x = 0; x < len2; x++){
            right[x] = arr[m + 1 + x];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < len1 && j < len2){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < len1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < len2){
            arr[k] = right[j];
            k++;
            j++;
        }
    }
	public void insertionSort(int[] arr, int left,int right){
        for (int i = left + 1; i <= right; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
    public void timSort(int[] arr, int n){
        int minRun = minRunLength(MIN_MERGE);
        for (int i = 0; i < n; i += minRun){
            insertionSort(arr, i,Math.min((i + MIN_MERGE - 1), (n - 1)));
        }
        for (int size = minRun; size < n; size = 2 * size){
            for (int left = 0; left < n;left += 2 * size){
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1),(n - 1));
                  if(mid < right)
                    merge(arr, left, mid, right);
            }
        }
    }
    private static int minRunLength(int n){
        assert n >= 0;
        int r = 0;
        while (n >= 32){
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }
}