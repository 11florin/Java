package exercise.practiceExercise.challengeInheritance;

public class Main {
    
    public static void main(String[] args) {
        
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee john = new SalariedEmployee("Florin", "01/01/1988", "02/02/2025", 35000);
        System.out.println(john);
        System.out.println("Age = " + john.getAge());
        System.out.println("Pay = " + john.collectPay());


        john.retaire();
        System.out.println("John's pension check = $" + john.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
