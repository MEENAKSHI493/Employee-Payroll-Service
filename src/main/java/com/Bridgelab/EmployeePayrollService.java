package com.Bridgelab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    /**
     *  create a  employee payrollservice class
     *  create arrylist and list to  collect and read data.
     *  read and write Employee Payroll to a Console
     */

public class EmployeePayrollService {

    public enum IOService { CONSOLE_IO,FILE_ID,DB, REST_IO}
    private List<EmployeePayrollData> employeePayrollist;

    private ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
    public  EmployeePayrollService() {
    }
    public  EmployeePayrollService(List<EmployeePayrollData> employeePayrollDataList2) {
        this.employeePayrollDataList = (ArrayList<EmployeePayrollData>) employeePayrollDataList2;
    }

        /**
         * Mian method
         * @param args calling method
         */
        public static  void main (String[] args){
            System.out.println("Welcome to employeepayrollService");
            ArrayList<EmployeePayrollData> employeePayrollDataList = new ArrayList<EmployeePayrollData>();
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollDataList);
            Scanner sc = new Scanner(System.in);
            employeePayrollService.readEmployeePayrollData(sc);
            employeePayrollService.writeEmployeePayrollData();
        }
         /**
          * read employee payroll data using console
          */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Please enter Employee ID:");
        int id = consoleInputReader.nextInt();
        System.out.println("Please enter the Employee name");
        String name = consoleInputReader.next();
        System.out.println("Please enter the Employee salary");
        double salary = consoleInputReader.nextDouble();
        EmployeePayrollData.add(new EmployeePayrollData(name, id, salary));
    }
        /**
         *  write Writing payroll to console
         */
    private void writeEmployeePayrollData() {
        System.out.println(("Writing payroll to console\n" + employeePayrollDataList));
        }


}
