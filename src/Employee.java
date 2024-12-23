public class Employee {
    private String name;
    private String lastName;
    private String middleName;
    private String department;
    private int salary;
    private static int id;

    public Employee(String name, String lastName, String middleName, String department, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id++;
    }
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    public String getDepartment() {
        return this.department;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public boolean equals(Object employee) {
        if (this.getClass() != employee.getClass()) {
            return false;
        }
        Employee a2 = (Employee) employee;
        return this.name.equals(a2.name) && this.lastName.equals(a2.lastName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(lastName) + java.util.Objects.hash(name);
    }
    @Override
    public String toString() {
        return "Имя " + this.name + "; Фамилия " + this.lastName + "; Отчество " + this.middleName + "; Отдел " + this.department + "; Зарплата " + this.salary;
    }

}