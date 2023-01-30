package exceptionHandling;

//custom exception to validate withdrawal amount matches the minimum withdrawal limit
class AmountLessThanRequiredException extends Exception {
    //member variable to store our custom message
    String msg;

    AmountLessThanRequiredException(String msg) {
        //passing the parameter to the super class constructor
        super(msg);
        this.msg = msg;
    }

    //overriding with our custom message
    @Override
    public String toString() {
        return msg;
    }
}
