package collections;
import bean.Employee;
import inheritance.Emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String args[])
    {
        myHashMap();
        System.out.println("Next method:");
        myHashMap1();
        System.out.println("Next method:");
        myHashMap2();
        System.out.println("Next method:");
        myHashMapwithEmployee();

    }
    public static void myHashMap(){
//        Map<Integer,String> map=new HashMap<Integer,String>();
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Pune");

        map.put(103,"Chennai");
        map.put(102,"Mumbai");
        Set set =map.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
            Map.Entry entry= (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void myHashMap1(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Pune");
        map.put(103,"Chennai");
        map.put(102,"Mumbai");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    public static void myHashMap2(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Pune");
        map.put(103,"Chennai");
        map.put(102,"Mumbai");
        map.put(102,"Hyderabad"); //replaces mumbai in the map
        Set<Integer> set=map.keySet();
        for(Integer key:set){
            String value=map.get(key);
            System.out.println(key+" "+value);
        }
    }
    public static void myHashMapwithEmployee(){
        Employee emp1= new Employee(101,"Asha",60);
        Employee emp2= new Employee(103,"Nisha",65);
        Employee emp3= new Employee(102,"Disha",76);
        Employee emp4= new Employee(102,"Disha",76);
        Map<Employee,String> map=new HashMap<Employee,String>();
        map.put(emp1,"Pune");
        map.put(emp2,"Chennai");
        map.put(emp3,"Delhi");
        map.put(emp4,"Hyderabad"); //replaces mumbai in the map
        Set<Employee> set=map.keySet();
        for(Employee key:set){
            String value=map.get(key);
            System.out.println(key+" "+value);
        }
    }

}
