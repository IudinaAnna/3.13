package com.company;
        import java.time.Year;
        import java.util.Scanner;
class Employee {
    private String first_name;
    private String last_name;
    private double salary;
    public Employee(String first_name,String last_name,double salary){
        this.first_name=first_name;
        this.last_name=last_name;
        if(salary>0.00)
            this.salary=salary;
    }
    public void getFirst_name()
    {
        System.out.println("Имя: "+this.first_name);
    }
    public void getLast_name()
    {
        System.out.println("Фамилия: "+this.last_name);
    }
    public void getSalary()
    {
        System.out.println("Текущая заработная плата: "+this.salary);
    }
    public double Year_salary(double salary) {
        System.out.println("Годовая заработная плата: " + (salary*12));
        return salary;
    }
    public void Change_salary() {
        double result=salary*0.1;
        double month_salary=Year_salary(salary)+result;
        double year_salary=month_salary*12;
        System.out.println("Изменение заработной платы после 10% прибавки: " + (month_salary)+" в месяц");
        System.out.println("Изменение заработной платы после 10% прибавки: " + (year_salary)+" в год");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Первый сотрудник
        Employee emp1=new Employee("Petr","Ivanov",2500);
        emp1.getFirst_name();
        emp1.getLast_name();
        emp1.getSalary();
        emp1.Change_salary();
        System.out.println("-------------------------------------------------------------");
        Employee emp2=new Employee("Victor","Nicolaev",3500);
        emp2.getFirst_name();
        emp2.getLast_name();
        emp2.getSalary();
        emp2.Change_salary();
    }
}
