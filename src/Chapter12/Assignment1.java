package Chapter12;

public class Assignment1 {
    public static void main(String[] args) {
        Employee slave = new Employee();
        slave.setName("홍길동");
        slave.setAge(20);
        slave.setSalary(3000000);
        slave.setYears(1);

        System.out.println("name : " + slave.getName());
        System.out.println("age : " + slave.getAge());
        System.out.println("salary : " + slave.getSalary());
        System.out.println("years : " + slave.getYears());
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;
    private int years;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
