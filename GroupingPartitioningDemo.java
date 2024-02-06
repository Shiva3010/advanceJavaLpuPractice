import java.util.*;
import java.util.stream.*;

public class GroupingPartitioningDemo {
    public static void main(String args[]){
        ArrayList<Employee> al = new ArrayList<>();
        Employee e1 = new Employee ("Aman", "Delhi", false);
        al.add(e1);
        Employee e2 = new Employee ("Dheeraj", "Punjab", true);
        al.add(e2);
        Employee e3 = new Employee ("Rajveer", "West Bengal", false);
        al.add(e3);
        Employee e4 = new Employee ("Deepti", "Delhi", false);
        al.add(e4);
        Employee e5 = new Employee ("Sandeep", "Delhi", true);
        al.add(e5);
        Employee e6 = new Employee ("Shiva", "Mumbai", false);
        al.add(e6);

        //Finf the employee state vise
        Map<String, List<Employee>> mp = al.stream().collect(Collectors.groupingBy(e -> e.state));

        Set<String> keys = mp.keySet();
        for(String k: keys) {
            List<Employee> l = mp.get(k);
            System.out.println("\n Employee from \n" + k );
            for (Employee e : l)
                System.out.println(e.name + "\t" +e.state);
        }

        //Use partictioning based on Maritial state

        Map <Boolean, List<Employee>> mp1 = al.stream().collect(Collectors.partitioningBy(e->e.married));
        Set<Boolean> ks = mp1.keySet();
        for (Boolean k : ks) {
            if (k)
            System.out.println("\n Married employee are \n");
            else 
            System.out.println("\n Unmarried employee are \n");
            List<Employee> l = mp1.get(k);
            for (Employee e : l)
            System.out.println(e.name + "\t " + e.state);
        }
    }
}
class Employee
{
    String name, state;
    boolean married;
    Employee(String name, String state, boolean ms){
        this.name = name;
        this.state = state;
        this.married = ms;
    }
}
