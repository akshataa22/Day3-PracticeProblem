package Day3;

public class EmployeeWage {
        static final int workingDays = 20;
        static final int empRatePerHour = 20;
        private static final int partTime = 1;
        private static final int fullTime = 2;
        private static double empCheck = 0;

        public static void main(String[] args) {
            int empHrs=0, empWage=0, totalEmpWage=0;    //initialising the values
            for (int day = 0; day < workingDays; day++) {
                empCheck = Math.floor(Math.random() * 10) % 3;       //using random function to check attendance
                System.out.println(empCheck);
            }

            switch ((int) empCheck) {
                case partTime:
                    System.out.println("Employee is Present half Day");
                    empHrs = 4;
                    empWage = empHrs * empRatePerHour;
                    System.out.println("Employee Wage: " + empWage);
                    break;
                case fullTime:
                    System.out.println("Employee is Present full day");
                    empHrs = 8;
                    empWage = empHrs * empRatePerHour;
                    System.out.println("Employee Wage: " + empWage);
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is absent.");
            }

            totalEmpWage = workingDays * empWage;
            System.out.println("Employee Wage for total working days: " + totalEmpWage);
    }
}
