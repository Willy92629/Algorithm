
public class HW05_4110056015_2 extends littlebit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW05_4110056015_2 f = new HW05_4110056015_2();
		long t1 = System.nanoTime();
		int A[] = {2,5,1,6,4,8}; 
		int F = f.l_bit(A);
		
		System.out.println(F);
		
		System.out.printf("\n%010d",(System.nanoTime()-t1));
	}
	public int l_bit(int[] fight) {
		int n = fight.length;
	    int[] rewards = new int[n];
	    
	    rewards[0] = 1;
	    
	    for (int i = 1; i < n; i++) {
	        if (fight[i] > fight[i-1]) {
	            rewards[i] = rewards[i-1] + 1;
	        }else if(fight[i] == fight[i-1]) {
	        	rewards[i] = rewards[i-1];
	        }else {
	            rewards[i] = 1;
	        }
	    }
	    int totalRewards = 0;
	    for (int i = n-2; i >= 0; i--) {
	        if (fight[i] > fight[i+1]) {
	            rewards[i] = Math.max(rewards[i], rewards[i+1]+1);
	        }else if (fight[i] == fight[i+1]) {
	            rewards[i+1] = Math.max(rewards[i], rewards[i+1]);
	        	rewards[i] = rewards[i+1];
	        }
	        totalRewards += rewards[i];
	    }
	    totalRewards+=rewards[n-1];
	    return totalRewards;
	}
	

}
