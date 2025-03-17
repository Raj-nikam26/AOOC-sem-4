public class Emp_class {

        String firstName;
        String lastName;
        double monthlySalary;

        public Emp_class(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
            MonthSalary(monthlySalary);
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getMonthlySalary() {
            return monthlySalary;
        }

        public void MonthSalary(double monthlySalary) {
            if (monthlySalary > 0) {
                this.monthlySalary = monthlySalary;
            } else {
                this.monthlySalary = 0.0;
            }
        }

        public double YearlySalary() {
            return monthlySalary * 12;
        }

        public void raise() {
            this.monthlySalary *= 1.10;
        }
}