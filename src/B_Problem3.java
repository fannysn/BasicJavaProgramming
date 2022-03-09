public class B_Problem3
{
    private static void DrawXYZ(int n)
    {
        int loop = n * n;
        for (int i = 1; i <= loop; i++)
        {
            if(i%2!=0)
            {
            if (i % 3 == 0)
            {
                System.out.print("X");
            }
            else
                System.out.print("Y");
        }
        if (i % 2 == 0)
        {
            if (i % 3 == 0)
            {
                System.out.print("X");
            }
            else
                System.out.print("Z");
        }
        if (i % n == 0)
            System.out.println("");
        }
    }
    public static void main(String args[])
        {
        DrawXYZ(3);
        System.out.println("================SPACE===================");
        DrawXYZ(5);
        }
}
