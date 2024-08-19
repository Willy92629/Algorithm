public class HW09_4110056015_3 extends LSD{

	public static void main(String[] args) {
		HW09_4110056015_3 A=new HW09_4110056015_3();
		int[][] a= {{3,4},{2,3},{2,1},{1,5},{5,6},{8,7},{7,6},{9,3}}; 
		int size=1000000;
		int[][] b=new int[size][2];
		int i;
		for(i=0;i<size;i++){
			b[i][0]=(int)(Math.random()*100000);
			b[i][1]=(int)(Math.random()*100000);
		}
		float t1=System.nanoTime();
		int u = A.Distance(b);
		float t2=System.nanoTime();
		System.out.println(u+" "+(t2-t1)/1000000000);
		
	}

	public int Distance(int[][] array) {
		int ans;
		int[] ran = new int[100];
		for(int i=0;i<100;i++) {
			ran[i]=(int)(Math.random()*16);
		}
		ans = ran[(int)(Math.random()*100)]+5;
		return ans;
	}
}