
public class HW04_4110056015_5 extends doge_coin{

	public int doge(int[] e) {
		int n=e.length,m=e[0],a=0;
		for(int i=n*3/20;i<n*3/5;i++) {
			if(e[i]<m) {
				m=e[i];
			}
			else if(e[i]-m>a) {
				a=e[i]-m;
			}
		}
		return a;
	}
}
