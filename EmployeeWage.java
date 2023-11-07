package Day3;

import java.util.Random;

public class EmployeeWage {
        private static final int partTime = 1;
        private static final int fullTime = 2;

        public static void main(String[] args) {
            final int workingDays = 20;
            final int empRatePerHour = 20;
            int empHrs=0, empWage=0, totalEmpWage=0;    //initialising the values
            for (int day = 0; day < workingDays; day++) {
                int empCheck = new Random().nextInt(3);    //using random function to generate 0, 1 and 2
                empHrs = getEmployeeHours(empCheck);
                empWage = empHrs * empRatePerHour;
                totalEmpWage += empWage;
                System.out.println("Day " + (day + 1) + " : Employee Wage: " + empWage);
            }
            System.out.println("Employee Wage for total working days: " + totalEmpWage);
    }

    private static int getEmployeeHours(int empCheck) {
            switch (empCheck){
                case partTime :
                    return 4;
                case fullTime:
                    return 8;
                default:
                    return 0;
            }
    }
}
