//creat a class emplo. with private variables id and salary insure that id should always be positive salary should not be less than 10000 use setter method validate before assigning value
package OOPS;

class Emplo {
    private int id;
    private double salary;

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID: must be positive.");
        }
    }

    public int getId() {
        return id;
    }

    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary: must be at least 10000.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public class employee {
        public static void main(String[] args) {
            Emplo e = new Emplo();

            e.setId(101);         // Valid
            e.setSalary(12000);   // Valid

            System.out.println("ID: " + e.getId());
            System.out.println("Salary: " + e.getSalary());
        }
    }
}
