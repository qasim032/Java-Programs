public class SalaryManagementSystem {
    public static void main(String[] args) {
        // Task 1
        double Salary = 50000;
        double bonus = 7500;
        double totalSalary = Salary + bonus;
        System.out.println("Total Salary before tax: " + totalSalary);

        // Task 2
        int performanceScore = 85;
        int passingScore = 75;
        int yearsOfService = 3;
        boolean qualifiesForPromotion = (performanceScore > passingScore) && (yearsOfService >= 2);
        System.out.println("Employee qualifies for promotion: " + qualifiesForPromotion);

        // Task 3
        double taxRate = 0.10;
        totalSalary *= (1 - taxRate); // Deducting 10% tax
        System.out.println("Final Salary after tax deduction: " + totalSalary);

        // Task 4
        int leaveBalance = 10;
        leaveBalance--; // Employee takes a leave
        System.out.println("Leave balance after taking one leave: " + leaveBalance);
        leaveBalance++; // Employee works extra and earns one leave
        System.out.println("Leave balance after earning one extra leave: " + leaveBalance);
    }
}


