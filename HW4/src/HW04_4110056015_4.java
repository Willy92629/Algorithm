
public class HW04_4110056015_4 extends doge_coin {

	public int doge(int[] a) {
		int e = 0,s = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]<s) {
				s = a[i];
			}else if(a[i] > e+s) {
				e = a[i]-s;
			}
		}
		return e;
	}

}
