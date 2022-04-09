import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("tree");
        words.add("apple");
        words.add("tree");
        words.add("person");
        words.add("tree");
        words.add("apple");
        words.add("tree");
        words.add("tree");
        Map<String, Integer> frequencies = words.stream()
                .distinct()
                .collect(Collectors.toMap(word -> word, word -> Collections.frequency(words, word)));
        frequencies.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private static void task2() {
        var employee1 = new Employee("Ivan", 32, 60000);
        var employee2 = new Employee("Vasiliy", 24, 32600);
        var employee3 = new Employee("Pert", 56, 78000);
        var employee4 = new Employee("Sidor", 14, 32000);
        var employee5 = new Employee("Grigoriy", 54, 40000);
        var employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        double salary = employees.stream().
                map(empl -> empl.getSalary() / employees.size()).
                reduce(0.0, (sum, emplSalary) -> sum += emplSalary);
        System.out.println(salary);
    }

    private static void task3() {
        var employee1 = new Employee("Ivan", 32, 60000);
        var employee2 = new Employee("Vasiliy", 24, 32600);
        var employee3 = new Employee("Pert", 56, 78000);
        var employee4 = new Employee("Sidor", 14, 32000);
        var employee5 = new Employee("Grigoriy", 54, 40000);
        var employees = new ArrayList<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        int n = 2;
        employees.stream().
                sorted((empl1, empl2) -> empl2.getAge() - empl1.getAge()).
                limit(n).
                forEach(empl -> System.out.println(empl.getAge()));
    }
}
