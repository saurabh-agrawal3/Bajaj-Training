package collections;

public class MyLambda {
    public static void main(String args[]){
        Operation ref=(num1, num2)->{
            int sum=num1+num2;
            System.out.println("Addition= "+sum);
        };
        ref.addition(100,200);
        ref.addition(200,300);
    }
}
