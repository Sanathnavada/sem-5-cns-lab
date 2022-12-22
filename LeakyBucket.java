import java.util.*;

class Main 
{
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        int t[]=new int[20];
        System.out.println("enter the number of time intervals");
        n=sc.nextInt();
        System.out.println("enter the number of time intervlas");
        for(i=0;i<n;i++)
        {
            t[i]=sc.nextInt();
        }
        System.out.println("enter the value of i");
        i=sc.nextInt();
        System.out.println("enter the value of l");
        int l=sc.nextInt();
        int lct=0;
        int x=0,y=0;
        for(j=0;j<n;j++)
        {
            y=x-(t[j]-lct);
            if(y<0)
                y=0;
            if(y>l)
            {
                System.out.println("non confirming packet"+t[j]);
            }
            else 
            {
                x=y+i;
                lct=t[j];
                System.out.println("confirming packet"+t[j]);
            }
        }
    }
}
