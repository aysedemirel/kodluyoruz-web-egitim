package com.ayse.classes.salarycalc;

/**
 * Calculate salary of an employee
 * <br/>
 * Output is for an employee named Kemal =>
 * Name: Kemal
 * Salary: 2000.0
 * Work hours: 45
 * Hire year: 1985
 * Tax: 60.0
 * Bonus: 150.0
 * Raise salary : 300.0
 * Salary with Taxes and Bonuses: 2090.0
 * Total salary: 2300.0
 *
 * @author aysedemirel
 * @see Employee
 */
public class SalaryCalculatorMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Kemal", 2000, 45, 1985);
        System.out.println(employee);
    }
}
