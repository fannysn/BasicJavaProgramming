public class A_Problem3
{
    public static void main(String args[])
    {
        int input = 6;
        int check;
        System.out.println("Faktor dari bilangan " + input + ":");
        for (int i = 1; i <= input; i++)
        {
            check = input % i;
            if (check == 0)
            {
                System.out.println(i);
            }
        }
    }
}
