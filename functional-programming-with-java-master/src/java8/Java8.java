package java8;

import java.util.*;
import java.util.stream.Collectors;

public class Java8 {

    private static List<Employee> empList = new ArrayList<>();


    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("A", 1, "unknown"));
        empList.add(new Employee("B", 3, "unknown"));
        empList.add(new Employee("C", 2, "unknown"));
        empList.add(new Employee("D", 5, "unknown"));

        empList.stream().sorted((o1, o2) -> o2.getAge() -o1.getAge()).skip(2).collect(Collectors.toList()).forEach(e -> System.out.println(e));


        Optional<Employee> employee = Java8.getEmployee();

        if(employee.isPresent()){
            System.out.println(employee.get().getName());
        }else{
            System.out.println(employee.orElse(new Employee("Unknown", 0, "unknown")).getName());
        }
    }

    static Optional getEmployee(){
        List<String> strList = List.of("Hi", "Hello");
        Set<String> strSet = Set.of("Hello", "Hi");
        Map<Integer, String> mapColl = Map.of(101, "Hi", 102, "Hello");
        for(Map.Entry<Integer, String> e : mapColl.entrySet())
            System.out.println(e.getKey()+"-----"+e.getValue());
        empList.add(new Employee("John", 23, "Bangalore"));
        empList.add(new Employee("Par", 24, "Chennai"));

        return Optional.ofNullable(null);

    }




}
