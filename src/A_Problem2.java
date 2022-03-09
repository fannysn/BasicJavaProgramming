public class A_Problem2 {
    public static void main(String args[])
    {
        int StudentScore=99;
        if(StudentScore>=80 && StudentScore<=100)
        {
            System.out.println("NILAI A");
        }
        else if(StudentScore>=65 && StudentScore<=79)
        {
            System.out.println("NILAI B+");
        }
        else if(StudentScore>=50 && StudentScore<=64)
        {
            System.out.println("NILAI B");
        }
        else if(StudentScore>=35 && StudentScore<=49)
        {
            System.out.println("NILAI C");
        }
        else if(StudentScore>=0 && StudentScore<=34)
        {
            System.out.println("NILAI D");
        }
        else
        {
            System.out.println("MASUKAN ANDA SALAH!");
        }
    }
}
