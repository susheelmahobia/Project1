class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        // Setting Attributes for e1
        e1.id = 12;
        e1.salary = 34;
        e1.name = "Rakesh";

        // Setting Attributes for e2
        e2.id = 17;
        e2.salary = 12;
        e2.name = "Jayesh";

        // Printing the Attributes
        e1.printDetails();
        e2.printDetails();
        int salary = e1.getSalary();
        System.out.println(salary);
    }

}
