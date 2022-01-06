package project;

public class p3
{
    public static void main(String[]args)
    {
        int rows=5,col=5;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=col;j++)
            {
            if(i<=j)
            {
                System.out.print('*');
        
            }
            else
            {
                System.out.print(' ');
            }
            }
            System.out.println();
            
        }
    }
}