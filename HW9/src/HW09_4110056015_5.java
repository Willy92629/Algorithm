import java.util.Stack;
import java.util.ArrayList;
public class HW09_4110056015_5 extends LSD{

	public static void main(String[] args) {
		HW09_4110056015_5 A=new HW09_4110056015_5();
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
		int Nmax=0;
		for(i=0;i<len;i++)
		{
			if(array[i][0]>Nmax)
				Nmax=array[i][0];
			if(array[i][1]>Nmax)
				Nmax=array[i][1];
		}
		Nmax=Nmax+2;
		ArrayList<Integer>[] map = new ArrayList[Nmax];
		for(i=0;i<Nmax;i++){
			map[i]=new ArrayList<Integer>();
		}
		
		for(i=0;i<len;i++){
				map[array[i][0]].add((array[i][1]));
				map[array[i][1]].add((array[i][0]));
		}
		int cup=0;
		
		
		int ct[]=new int[Nmax];
		int dist[]=new int[Nmax];
		push(array[0][0]);
		ct[array[0][0]]=1;
		
		int cur=0;
		dist[array[0][0]]=0;
		while(head!=top-1){
			cur=pop();
			cup=map[cur].size();
			for(i=0;i<cup;i++){
				map[cur].get(i);
				if(ct[map[cur].get(i)]==0){
					ct[map[cur].get(i)]+=1;
					push(map[cur].get(i));
					dist[map[cur].get(i)]=dist[cur]+1;
			    }
			}
		}
		top=0;head=-1;
		push(cur);
		dist[cur]=0;
		while(head!=top-1){
			cur=pop();
			cup=map[cur].size();
			for(i=0;i<cup;i++){
				map[cur].get(i);
				if(ct[map[cur].get(i)]==1){
					ct[map[cur].get(i)]+=1;
					push(map[cur].get(i));
					dist[map[cur].get(i)]=dist[cur]+1;
			    }
			}
		}
		return dist[cur]+2;
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