
public class HW03_4110056015_1 extends One_0k_rock {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW03_4110056015_1 f = new HW03_4110056015_1();
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
		int j;
		for(int i = 0 ;i < str.length;i++){
			sta[i] = true;
			if(str[i].length() == 0) {
				sta[i] = false;
				continue;
			}
			if((str[i].length() %2) != 0) {
				sta[i] = false;
				continue;
			}
			if(str[i].charAt((str[i].length()/2)-1) != '0'||str[i].charAt((str[i].length()/2)) != '1') {
				sta[i] = false;
				continue;
			}
			for(j = 0;j<str[i].length()/2;j++) {
				if(str[i].charAt(j)!='0') {
					sta[i] = false;
					break;
				}
			}
			if(j != str[i].length()/2)
				continue;
			for(j = str[i].length()/2;j<str[i].length();j++) {
				if(str[i].charAt(j)!='1') {
					sta[i] = false;
					break;
				}
			}
		}
		return sta;
	}
}
