
public class HW10_4110056015_3 extends Buy_Phone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW10_4110056015_3 A=new HW10_4110056015_3();
		int[][] a= {{10,3},{9,7},{2,3},{2,10},{2,1},{1,5},{5,6},{8,7},{9,7},{9,7},{7,6}}; 
		int size=1500;
		int[][] b=new int[size][2];
		int i;
		for(i=0;i<size;i++){
			b[i][0]=(int)(Math.random()*100000);
			b[i][1]=(int)(Math.random()*100000);
		}
		long t1=System.nanoTime();
		int[][] u = A.bestPhone(a);
		long t2=System.nanoTime();
		for(int j=0;j<u.length;j++) {
			System.out.println(u[j][0]+" "+u[j][1]);
		}
		System.out.printf("%010d",(t2-t1));
		
	}
	public int[][] bestPhone(int[][] inputArr){
		int[][] sortA = new int[inputArr.length][3];
		int best =  inputArr.length;
		for(int i=0;i<inputArr.length;i++) {
			sortA[i][0]=inputArr[i][0];
			sortA[i][1]=inputArr[i][1];
			sortA[i][2]=i;
		}
		java.util.Arrays.sort(sortA, new java.util.Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		    	if(a[0]==b[0]) {
		    		return Integer.compare(a[1],b[1]);
		    	}else {
		    		return Integer.compare(a[0], b[0]);
		    	}
		    }
		});
		for(int i=0,j=0,lastj=j,dup=0;i<inputArr.length;i++) {
			if(sortA[i][0]==sortA[j][0]) {
				continue;
			}else {
				for(int k=j-2;k>=lastj;k--) {
					if(sortA[j-1][1]==sortA[k][1]) 
						dup = 1;
					sortA[k][0] = -1;
					sortA[k][1] = -1;
					sortA[k][2] = 2147483647;
					best--;
				}
				if(dup==1) {
					sortA[j-1][0] = -1;
					sortA[j-1][1] = -1;
					sortA[j-1][2] = 2147483647;
					best--;
					dup=0;
				}
				lastj= j; 
				j=i;
			}
		}
		for(int i = 0;i<inputArr.length;i++) {
			if(sortA[i][0]==-1){
				continue;
			}
			for(int j = 0;j<i;j++) {
				if(sortA[j][0]==-1){
					continue;
				}
				if(sortA[i][0]>sortA[j][0]&&sortA[i][1]>sortA[j][1]) {
					sortA[j][0] = -1;
					sortA[j][1] = -1;
					sortA[j][2] = 2147483647;
					best--;
				}
			}
		}
		
		java.util.Arrays.sort(sortA, new java.util.Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		    	if(a[2]==b[2]) {
		    		return Integer.compare(a[1],b[1]);
		    	}else {
		    		return Integer.compare(a[2], b[2]);
		    	}
		    }
		});
		int[][] array = new int[best][2];
		for(int i=0;i<best;i++) {
			array[i][0]=sortA[i][0];
			array[i][1]=sortA[i][1];
		}
		return array;
	}
}

