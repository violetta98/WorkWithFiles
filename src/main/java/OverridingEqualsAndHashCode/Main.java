package OverridingEqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Violetta on 2017-08-30.
 */
public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setId(100);
        e2.setId(100);
        System.out.println(e1.equals(e2)); // true (without hashCode)

        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees); // without hashCode there will be print 2 objects, which equal
    }

}
