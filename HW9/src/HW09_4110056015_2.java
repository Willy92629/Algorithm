import java.util.Stack;
import java.util.ArrayList;
public class HW09_4110056015_2 extends LSD{

	public static void main(String[] args) {
		HW09_4110056015_2 A=new HW09_4110056015_2();
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

	int queue[]=new int[999999];
	int head=-1;
	int top=0;
	public int Distance(int[][] array) {
		int i;
		int len=array.length;
		int big=0;
		for(i=0;i<len;i++)
		{
			if(array[i][0]>big)
				big=array[i][0];
			if(array[i][1]>big)
				big=array[i][1];
		}
		big=big+2;
		ArrayList<Integer>[] map = new ArrayList[big];
		for(i=0;i<big;i++){
			map[i]=new ArrayList<Integer>();
		}
		
		for(i=0;i<len;i++){
			if(!(map[array[i][0]].contains(array[i][1])))
				map[array[i][0]].add((array[i][1]));
			if(!(map[array[i][1]].contains(array[i][0])))
				map[array[i][1]].add((array[i][0]));
		}
		int cou=0;
		
		
		int c[]=new int[big];
		int dist[]=new int[big];
		push(array[0][0]);
		c[array[0][0]]=1;
		
		int now=0;
		dist[array[0][0]]=0;
		while(head!=top-1){
			now=pop();
			cou=map[now].size();
			for(i=0;i<cou;i++){
				map[now].get(i);
				if(c[map[now].get(i)]<=0){
					c[map[now].get(i)]+=1;
					push(map[now].get(i));
					dist[map[now].get(i)]=dist[now]+1;
			    }
			}
		}
		return dist[now]+3;
	}
	void push(int a){
		queue[top]=a;
		top++;
	}
	int pop(){
		head++;
		int value=queue[head];
		return value;
	}
	
}