package com.Bridgelab;
   /**
    * @ authour Meenakshi
    * Create employee Payroll data
    */
public class EmployeePayrollData {
    private String name;
    private int id;
    private  double salary;

     /**
      *  constructor Employee Payroll data
      */
    public EmployeePayrollData(String name, int id, double salary) {
        super();
        this.name = name;
        this.id = id;
    }
    public  String getName() {

        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public double getSalary() {
        return salary;
    }

    public static void add(EmployeePayrollData employeePayrollData){
}
}
