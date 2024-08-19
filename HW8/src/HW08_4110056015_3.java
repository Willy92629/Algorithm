
public class HW08_4110056015_3 extends MaxLandArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] F1 = {{0, 1}, {1, 0}, {1, 1}, {1, 0}};
		int[][] T3 = {{1, 1}, {0, 1}, {0, 0}};
		HW08_4110056015_3 sol = new HW08_4110056015_3();
		System.out.println(sol.maxLandArea(F1));
		System.out.println(sol.maxLandArea(T3));
	}

	public int maxLandArea(int[][] array) {
		int sum = 0, szr = array.length,szc = array[0].length;
		been = new int[szr][szc];
		inidir();
		sum = Mount(szr,szc,array);
		
		return sum;
	}
	public class offset {
		public int vert;
		public int horiz;
		offset(int i,int j) {
			this.vert = i;
			this.horiz = j;
		}
	}
	public offset[] move;
	public int[][] been;
	void inidir(){
		move = new offset[4];
		move[0] = new offset(-1,0);
		move[1] = new offset(0,1);
		move[2] = new offset(1,0);
		move[3] = new offset(0,-1);
	}

	int Mount(int maxrow, int maxcol,int[][] array){
		int i, j, max = 0, tmp;
		for(i = 0; i < maxrow ; i++){
			for(j = i%2; j < maxcol; j+=2){
				if(array[i][j]==0||been[i][j] == 1)
					continue;
				if(max < (tmp = Area(maxrow,maxcol,i,j,array))){
					max = tmp;
				}
			}
		}
		return(max);
	}

	int Area(int maxrow,int maxcol,int row ,int col,int[][] array){
		int i , areas = 0;
		for(i = 0; i < 4; i++){	
			if(row+move[i].vert<0||row+move[i].vert>=maxrow||col+move[i].horiz<0||col+move[i].horiz>=maxcol)
				continue;
			if(been[row+move[i].vert][col+move[i].horiz]==1)
				continue;
			if(array[row+move[i].vert][col+move[i].horiz] == 1){
				been[row][col] = 1;
				areas += Area(maxrow,maxcol,row+move[i].vert,col+move[i].horiz,array);
			}
		}
		been[row][col] = 1;
		areas++;
		return (areas);
	}
}
