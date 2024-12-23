public class Main {
    static Employee[] cache;

    public static void getAllEmployees(Employee[] cache) {
        for (Employee employer : cache) {
            System.out.println(employer.toString());
        }
    }
    public static int getTotalSalary(Employee[] cache) {
        int totalSalary = 0;
        for (Employee employer : cache) {
            totalSalary += employer.getSalary();
        }
        return totalSalary;
    }
    public static int getMaxSalary(Employee[] cache) {
        int maxSalary = 0;
        for (Employee employer : cache) {
            if (employer.getSalary() > maxSalary) {
                maxSalary = employer.getSalary();
            }
        }
        return maxSalary;
    }
    public static int getMinSalary(Employee[] cache) {
        int minSalary = cache[0].getSalary();
        for (Employee employer : cache) {
            if (employer.getSalary() < minSalary) {
                minSalary = employer.getSalary();
            }
        }
        return minSalary;
    }
    public static int getAvgSalary(int totalSalary, Employee[] cache) {
        return totalSalary / cache.length;
    }
    public static void main(String[] args) {
        cache = new Employee[10];
        cache[0] = new Employee("Федор", "Акимов", "Иванов", "1", 150000);
        cache[1] = new Employee("Илья", "Дурманов", "Петров", "2", 140000);
        cache[2] = new Employee("Виктория", "Шишкина", "Михайловна", "3", 100000);
        cache[3] = new Employee("Даниил", "Травинов", "Романович", "4", 104000);
        cache[4] = new Employee("Владимир", "Сидоров", "Тигранович", "5", 110000);
        cache[5] = new Employee("Егор", "Тушкевич", "Максимович", "6", 142000);
        cache[6] = new Employee("Алеся", "Крутова", "Федоровна", "7", 180000);
        cache[7] = new Employee("Екатерина", "Харитонова", "Тимофеевна", "8", 155000);
        cache[8] = new Employee("Лидия", "Кругляшова", "Данииловна", "9", 145210);
        cache[9] = new Employee("Таня", "Анисимова", "Богдановна", "10", 123520);

        System.out.println("Затрата на зарплату составляет " + getTotalSalary(cache));
        System.out.println("Максимальная зарплата " + getMaxSalary(cache));
        System.out.println("Минимальная зарплата " + getMinSalary(cache));
        System.out.println("Средняя зарплата " + getAvgSalary(getTotalSalary(cache),cache));
    }
}