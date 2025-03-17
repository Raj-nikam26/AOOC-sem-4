public class employee_Test {


        public static void main(String[] args) {

            Emp_class emp1 = new Emp_class("RAJ", "NIKAM", 1000);
            Emp_class emp2 = new Emp_class("SUYOG", "KUMBHAR", 2000);
            System.out.println("Initial Salaries:");
            System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.YearlySalary());
            System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.YearlySalary());

            emp1.raise();
            emp2.raise();

            System.out.println("\nAfter 10% Raise:");
            System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.YearlySalary());
            System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.YearlySalary());

        }

}

/*
OUTPUT :
Initial Salaries:
RAJ NIKAM: 12000.0
SUYOG KUMBHAR: 24000.0

After 10% Raise:
RAJ NIKAM: 13200.0
SUYOG KUMBHAR: 26400.0

 */
