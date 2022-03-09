public class B_Problem4
{
    private static void printTablePerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int sejajar = i * j;
                System.out.print(sejajar + " ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[])
        {
            printTablePerkalian(9);
        }
}
