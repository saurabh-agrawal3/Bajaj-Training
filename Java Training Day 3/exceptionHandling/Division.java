package exceptionHandling;
//import java.io.DataInputStream;
import java.io.*;


public class Division{

    public static void main (String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        try{
            int c=a/b;
            System.out.println("Quotient: "+c);
            System.out.println();

        }
        catch(ArithmeticException e)
        {
            System.out.println("DivideByZero Exception. Denominator can't be zero.");
        }
        finally{
            System.out.println("Inside finally block.");

        }
    }
}
