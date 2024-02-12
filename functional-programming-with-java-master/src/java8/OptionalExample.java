package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalExample {

    public static void main(String[] args) {
       Map<Employee, String> empMap = new HashMap<>();
       Employee e1 = new Employee("A",12,"Ban");
        Employee e2 = new Employee("B",13,"Che");
        Employee e3 = new Employee("C",14,"Cbe");

        empMap.put(e1, "A");
        empMap.put(e2, "B");
        empMap.put(e3, "C");

        String str = "Str";
        
       // Optional.of(str)
               // .filter(s -> !s.isBlank())
                //.ifPresentOrElse(OptionalExample.hello(), () -> OptionalExample.hi());
        
    }
    
    public static String hello(){
        System.out.println("Hello");
        return "Hello";
    }

    public static String hi(){
        System.out.println("Hi");
        return  "Hi";
    }
}

