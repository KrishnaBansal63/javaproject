package com.company.pratice;

public class Project1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an Employee ID as a command-line argument.");
            return;
        }

        String[][] employees = {
            {"Emp No.", "Emp Name", "Join Date", "Desig Code", "Dept", "Basic", "HRA", "IT"},
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "01/01/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

        boolean flag = false;
        int salary = 0;
        String designation = null;
        String da = null;

        for (int row = 1; row < employees.length; row++) {
            if (args[0].equals(employees[row][0])) {
                flag = true;
                String key = employees[row][3];
                
                switch (key) {
                    case "e":
                        designation = "Engineer";
                        da = "20000";
                        break;
                    case "c":
                        designation = "Consultant";
                        da = "32000";
                        break;
                    case "k":
                        designation = "Clerk";
                        da = "12000";
                        break;
                    case "r":
                        designation = "Receptionist";
                        da = "15000";
                        break;
                    case "m":
                        designation = "Manager";
                        da = "40000";
                        break;
                }

                salary = Integer.parseInt(employees[row][5]) + 
                         Integer.parseInt(employees[row][6]) + 
                         Integer.parseInt(da) + 
                         Integer.parseInt(employees[row][7]);

                // Displaying Employee Information
                System.out.printf("%-15s %-15s %-15s %-15s %-15s", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
                System.out.println();
                System.out.printf("%-15s %-15s %-15s %-15s %-15s", employees[row][0], employees[row][1], employees[row][4], designation, salary);
                break;
            }
        }
        
        if (!flag) {
            System.out.println("Employee Not Found with entered ID!");
        }
    }
}
