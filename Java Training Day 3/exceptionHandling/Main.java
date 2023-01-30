package exceptionHandling;

import java.util.*;

//custom exception to validate withdrawal amount matches the minimum withdrawal limit
class AmountLessThanRequiredException extends Exception {
    //member variable to store our custom message
    String msg;
    AmountLessThanRequiredException(String msg) {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg=msg;
    }

    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The minimum withdrawal amount is 50.\nEnter the withdrawal amount:");
        int withdrawAmount = sc.nextInt();
        try {
            if(withdrawAmount<=50) {
                throw new AmountLessThanRequiredException("Entered amount less than minimum withdrawal limit");
            }
        }
        catch(AmountLessThanRequiredException ex) {
            System.out.println(ex);
//            System.out.println(ex.getMessage());
        }
    }
}