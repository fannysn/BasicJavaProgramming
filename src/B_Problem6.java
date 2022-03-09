public class B_Problem6
{
    private static void Mean(float[] numbers)
    {
        float[] value=numbers;
        int panjang=value.length;
        float jumlah=0;
        for(int i=0;i<panjang;i++)
        {
            jumlah=jumlah+value[i];
        }
        float rt=jumlah/panjang;
        System.out.println(rt);
    }

    public static void main(String args[])
    {
        float[] value={1,2,3,4};
        Mean(value);
    }
}
