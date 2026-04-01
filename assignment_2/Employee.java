public class Employee {
    int salary;
    int hours;

    void getInfo(int s, int h) {
        salary = s;
        hours = h;
    }
    void AddSal() {
        if (salary < 500) salary = salary + 10;
    }

    void AddWork() {
        if (hours > 6) salary = salary + 5;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getInfo(400, 7);
        e.AddSal();
        e.AddWork();
        System.out.println("Final Salary: " + e.salary);
    }
}