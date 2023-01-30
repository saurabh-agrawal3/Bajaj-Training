package collections;

import bean.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream2 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,3,4,5);//creates list with numbers 2,3,4,5

        List<Integer> sq=list.stream()
                .map(x->x*x)
                .collect(Collectors.toList());
        System.out.println(sq);
    }
}
