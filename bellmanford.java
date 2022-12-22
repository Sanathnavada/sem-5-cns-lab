import java.util.*;
class bell
{
	static int AM[][];
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int v=sc.nextInt();
		AM=new int[v][v];
		System.out.println("enter the matrix enter 999 for infinity");
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				AM[i][j]=sc.nextInt();
		int dist[]=new int[v];
		for(int i=0;i<v;i++)
				dist[i]=999;
		System.out.println("Enter the source");
		int src=sc.nextInt();	
		dist[src]=0;
		for(int k=0;k<v-1;k++)
		{
			for(int i=0;i<v;i++)
			{
				for(int j=0;j<v;j++)
				{
					if((AM[i][j]!=0)&&(AM[i][j]!=999))
					{
						relax(i,j,dist);
					}
				}
			}
		}	
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				if((AM[i][j]!=0)&&(AM[i][j]!=999))
				{
					if(dist[j]>(dist[i]+AM[i][j]))
					{
						System.out.println("no shortest paths negative cycle occurs");
						System.exit(0);
					}	
				}
			}
		}	
		System.out.println("shortest distance are");
		for(int i=0;i<v;i++)
		{
			System.out.print(dist[i]+"  ");
		}	
	}
	static void relax(int u,int v,int dist[])
	{
		if(dist[v]>(dist[u]+AM[u][v]))
		{
			dist[v]=dist[u]+AM[u][v];
		}
	}		
}			
