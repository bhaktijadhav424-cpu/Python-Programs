class Employee {

    private String name;
    private int employeeId;
    private double monthlySalary;
    private int rating;

    // Parameterized Constructor
    Employee(String name, int employeeId, double monthlySalary, int rating) {

        this.name = name;
        this.employeeId = employeeId;

        if (monthlySalary >= 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }

        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            this.rating = 1;
        }
    }

    // Calculate Annual Salary
    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Calculate Bonus
    double calculateBonus() {

        double percentage = 0;

        if (rating == 5) {
            percentage = 20;
        } else if (rating == 4) {
            percentage = 15;
        } else if (rating == 3) {
            percentage = 10;
        } else if (rating == 2) {
            percentage = 5;
        } else {
            percentage = 0;
        }

        return calculateAnnualSalary() * percentage / 100;
    }

    // Display Employee Details
    void display() {

        double annualSalary = calculateAnnualSalary();
        double bonus = calculateBonus();
        double total = annualSalary + bonus;

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Annual Bonus: " + bonus);
        System.out.println("Total Annual Compensation: " + total);
    }

    public static void main(String[] args) {

        Employee e = new Employee("Amit", 105, 50000, 4);

        e.display();
    }
}

//Employee Name: Amit
//Employee ID: 105
//Monthly Salary: 50000.0
//Annual Salary: 600000.0
//Annual Bonus: 90000.0
//Total Annual Compensation: 690000.0