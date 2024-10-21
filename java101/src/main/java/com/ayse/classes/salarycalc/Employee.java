package com.ayse.classes.salarycalc;

/**
 * Class Attributes =>
 * name: Employee's name and surname, salary: Employee's salary, workHours: Weekly working hours, hireYear: Job start year,
 * <br/>
 * Class Methods =>
 * Employee(name,salary,workHours,hireYear): It is a constructor method and will take 4 parameters.
 * tax(): It will calculate the tax applied to the salary.
 * 1- If the employee's salary is less than 1000 TL, no tax will be applied.
 * 2- If the employee's salary is more than 1000 TL, 3% of the salary will be taxed.
 * bonus(): If the employee has worked more than 40 hours a week, it will calculate bonus fees as 30 TL for each extra hour worked.
 * raiseSalary(): It will calculate the salary increase according to the employee's job start year. Take the current year as 2021.
 * 1- If the employee has been working for less than 10 years, their salary will be increased by 5%.
 * 2- If the employee has been working for more than 9 years and less than 20 years, their salary will be increased by 10%.
 * 3- If the employee has been working for more than 19 years, their salary will be increased by 15%.
 * toString() : It will print the information about the employee on the screen.
 *
 * @author aysedemirel
 */
public class Employee {

    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n"
                + "Salary: " + salary + "\n"
                + "Work hours: " + workHours + "\n"
                + "Hire year: " + hireYear + "\n"
                + "Tax: " + tax() + "\n"
                + "Bonus: " + bonus() + "\n"
                + "Raise salary : " + raiseSalary() + "\n"
                + "Salary with Taxes and Bonuses: " + (salary - tax() + bonus()) + "\n"
                + "Total salary: " + (salary + raiseSalary());
    }

    private double tax() {
        return (salary < 1000) ? 0 : (salary * 3 / 100);
    }

    private double bonus() {
        return (workHours < 40) ? 0 : ((workHours - 40) * 30.0);
    }

    private double raiseSalary() {
        int year = 2021 - hireYear;
        if (year < 10) {
            return (salary * 0.05);
        } else if (year < 20) {
            return (salary * 0.1);
        } else {
            return (salary * 0.15);
        }
    }
}
