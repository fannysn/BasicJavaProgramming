public class A_Problem5 {
    private static boolean primeNumber(int number)
    {
        int check;
        int dump = 0;
        for (int i = 1; i <= number; i++)
        {
            check = number % i;
            if (check == 0)
            {
                dump++;
            }
        }
        if (dump == 2)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
