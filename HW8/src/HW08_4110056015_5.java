
public class HW08_4110056015_5 extends MaxLandArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] F1 = {{0, 1}, {1, 0}, {1, 1}, {1, 0}};
		int[][] T3 = {{1, 1}, {0, 1}, {0, 0}};
		HW08_4110056015_5 sol = new HW08_4110056015_5();
		System.out.println(sol.maxLandArea(F1));
		System.out.println(sol.maxLandArea(T3));
	}

	public int maxLandArea(int[][] array) {
		int max = 0;
	    
		for(int i = 0; i<array.length;i++){
            for(int j = 0; j<array[i].length;j++){
                if(array[i][j]!=0)
                {
                    sum = 0; 
                    dfs(array,i,j);
                    max  = Math.max(max,sum);
                }
            }
        }
        return max;
	}
	public int sum = 0;
    private void dfs(int[][] array ,int row ,int col)
    {
        if(row>=array.length || col>=array[0].length || row<0|| col<0 || array[row][col]==0)
        {
            return ;
        }

        sum++;
        array[row][col] = 0;
        dfs(array,row,col+1);
        dfs(array,row,col-1);
        dfs(array,row+1,col);
        dfs(array,row-1,col);
    }
}
