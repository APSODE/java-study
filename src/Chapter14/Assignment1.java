package Chapter14;

public class Assignment1 {
    public static void main(String[] args) {
        Employee test1 = new Employee();
        Employee test2 = new Employee("test_name", "010-8765-4321");
        Employee test3 = new Employee(999999999);
        Employee test4 = new Employee("test_name", "010-8765-4321", 999999999);
        Employee test5 = new Employee();

        Employee[] object_list = {test1, test2, test3, test4};
        for (Employee test_object : object_list) {
            String test_string = createObjectDataString(test_object);
            System.out.println(test_string);
        }

        test5.setName("test_name");
        test5.setCallNumber("test_call_number");
        test5.setIncome(1111111111);

        String test_string = createObjectDataString(test5);
        System.out.println(test_string);

    }

    public static String createObjectDataString(Employee employee) {
        String data_string = "";
        data_string += "이름 : " + employee.getName() + "\n";
        data_string += "전화번호 : " + employee.getCallNumber() + "\n";
        data_string += "연봉 : " + employee.getIncome() + "\n";

        return data_string;
    }
}

class Employee {
    private String name;
    private String call_number;
    private int income;

    public Employee() {
        this.name = "홍길동";
        this.call_number = "010-1234-5678";
        this.income = 40000000;
    }

    public Employee(String name, String call_number) {
        this.name = name;
        this.call_number = call_number;
        this.income = 40000000;
    }

    public Employee(int income) {
        this.name = "홍길동";
        this.call_number = "010-1234-5678";
        this.income = income;
    }

    public Employee(String name, String call_number, int income) {
        this.name = name;
        this.call_number = call_number;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCallNumber() {
        return call_number;
    }

    public void setCallNumber(String call_number) {
        this.call_number = call_number;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
