package temp;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        Set<Employee> employeeHashSet = new HashSet<>();

        Employee e1 = new Employee(1, "Raj", 1000);
        Employee e2 = new Employee(2, "Roy", 500);
        Employee e3 = new Employee(3, "Jay", 4000);
        Employee e4 = new Employee(4, "Mahi", 8000);
        Employee e5 = new Employee(5, "Rohit", 3000);
        Employee e6 = new Employee(5, "Rohit", 3000);

        employeeHashSet.add(e1);
        employeeHashSet.add(e2);
        employeeHashSet.add(e3);
        employeeHashSet.add(e4);
        employeeHashSet.add(e5);
        employeeHashSet.add(e6);
        employeeHashSet.add(e5);

        System.out.println(employeeHashSet.size());
        System.out.println(employeeHashSet);
        List<Employee> employeeList = employeeHashSet.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(employeeList.get(1));
        System.out.println(employeeList);


        Map<Employee, String> employeeStringHashMap= new HashMap<>();
        employeeStringHashMap.put(e1, e1.getName());
        employeeStringHashMap.put(e2, e2.getName());
        employeeStringHashMap.put(e3, e3.getName());
        employeeStringHashMap.put(e4, e4.getName());
        employeeStringHashMap.put(e5, e5.getName());
        employeeStringHashMap.put(e6, e6.getName());
        employeeStringHashMap.put(e5, e5.getName());


        System.out.println(employeeStringHashMap.size());
        System.out.println(employeeStringHashMap.keySet());
        System.out.println(employeeStringHashMap.keySet().stream().map(Employee::hashCode).collect(Collectors.toList()));



    }

}
