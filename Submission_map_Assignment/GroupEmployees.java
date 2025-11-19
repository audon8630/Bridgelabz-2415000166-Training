import java.util.*;

class Employee {
    String name;
    String dept;

    Employee(String n, String d) {
        name = n;
        dept = d;
    }

    public String toString() {
        return name;
    }
}

public class GroupEmployees {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        HashMap<String, ArrayList<Employee>> map = new HashMap<>();

        for (Employee e : list) {
            if (!map.containsKey(e.dept)) {
                map.put(e.dept, new ArrayList<>());
            }
            map.get(e.dept).add(e);
        }

        System.out.println(map);
    }
}
