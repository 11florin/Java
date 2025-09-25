package exercise.practiceExercise.challengeInheritance;

public class SalariedEmployee extends Employee {
    
    double annualSalary;
    boolean isRetaired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetaired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }
    public void retaire() {
        terminate("12/12/2025");
        isRetaired = true;
    }
}
