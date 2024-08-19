
public class HW10_4110056015_4 extends Buy_Phone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW10_4110056015_4 A=new HW10_4110056015_4();
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
		int dup =0;
		int num = inputArr.length;
		for(int i=0;i<inputArr.length;i++) {
			if(inputArr[i][0]==0)
				continue;
			for(int j=0;j<inputArr.length;j++) {
				if(i==j||inputArr[j][0]==0)
					continue;
				if((inputArr[i][0]==inputArr[j][0])&&(inputArr[i][1]==inputArr[j][1])) {
					dup=1;
					inputArr[j][0]=0;
					inputArr[j][1]=0;
					num--;
				}else if((inputArr[i][0]>=inputArr[j][0])&&(inputArr[i][1]>=inputArr[j][1])) {
					inputArr[j][0]=0;
					inputArr[j][1]=0;
					num--;
				} 
			}
			if(dup==1) {
				inputArr[i][0]=0;
				inputArr[i][1]=0;
				num--;
				dup=0;
			}
		}
		int[][] array = new int[num][2];
		int i,j;
		for(i =0,j=0;i<inputArr.length;i++) {
			if(inputArr[i][0] > 0) {
				array[j][0]=inputArr[i][0];
				array[j][1]=inputArr[i][1];
				j++;
			}
		}
		System.out.println((num==j) +" "+num);
		return array;
	}
}
