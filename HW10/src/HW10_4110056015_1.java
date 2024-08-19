
public class HW10_4110056015_1 extends Buy_Phone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW10_4110056015_1 A=new HW10_4110056015_1();
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
		for(int i=0;i<inputArr.length;i++) {
			for(int j=0;j<inputArr.length;j++) {
				if(i!=j&&inputArr[i][0]>inputArr[j][0]&&inputArr[i][1]>inputArr[j][1]) {
					inputArr[j][0]=0;
					inputArr[j][1]=0;
				}
			}
		}
		for(int i=0;i<inputArr.length;i++) {
			for(int j=0;j<i;j++) {
				if(inputArr[i][0]!=0&&inputArr[i][0]==inputArr[j][0]&&inputArr[i][1]==inputArr[j][1]) {
					inputArr[i][0]=0;
					inputArr[i][1]=0;
					inputArr[j][0]=0;
					inputArr[j][1]=0;
				}
			}
		}
		int num=0;
		for(int i=0;i< inputArr.length;i++) {
			if(inputArr[i][0] > 0) {
				num++;
			}
		}
		int[][] array = new int[num][2];
		for(int i =0,j=0;i<inputArr.length;i++) {
			if(inputArr[i][0] > 0) {
				array[j][0]=inputArr[i][0];
				array[j][1]=inputArr[i][1];
				j++;
			}
		}
		
		return array;
	}
}
