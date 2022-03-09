public class A_Problem6
    {
        private static boolean palindrome(String value)
    {
        int panjang=value.length();

        String kebalikan="";
        int l=panjang-1;
        for(int i=l;i>=0;i--)
        {
            kebalikan = kebalikan + value.charAt(i);
        }
        if(value.equals(kebalikan))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}
