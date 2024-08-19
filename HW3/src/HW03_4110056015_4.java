
public class HW03_4110056015_4 extends One_0k_rock {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW03_4110056015_4 f = new HW03_4110056015_4();
		long t1 = System.nanoTime();
		String A[] = {"00001111","","000011","001111","0001111","00000000001111111111"};
		boolean F[] = f.one0k(A);
		
		for(int i = 0 ;i<F.length;i++) {
			System.out.println(F[i]);
		}
		
		System.out.printf("\n%010d",(System.nanoTime()-t1));
	}

	public boolean[] one0k(String[] str) {
		boolean[] sta = new boolean[str.length];
		int a;
		for(int i = 0 ;i < str.length;i++){
			a = str[i].length();
			sta[i] = true;
			if(a == 0) {
				sta[i] = false;
				continue;
			}
			if((a %2) == 1) {
				sta[i] = false;
				continue;
			}
			if(str[i].charAt((a>>1)-1) == '0'&&str[i].charAt((a>>1)) == '1') {
			}else {	
				sta[i] = false;
				continue;
			}
			for(int j = 0;j<a>>1;j++) {
				if(str[i].charAt(j)!='0'||str[i].charAt(a-j-1)!='1') {
					sta[i] = false;
					break;
				}
			}
		}
		return sta;
	}
}
