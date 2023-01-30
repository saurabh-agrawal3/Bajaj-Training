package collections;
@FunctionalInterface
public interface Operation {
    void addition(int num1,int num2);
    default int division(int num1,int num2)
    {
        return num1/num2;
    }
    static int multiplication(int num1, int num2)
    {
        return num1*num2;
    }
}
