package EmployeeStructure;

public class BasePlusCommissionCompensationModel extends CompensationModel{
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate,
                                               double baseSalary){
        super(grossSales,commissionRate);
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings(){
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s%n%s: %.2f",super.toString(),"base salary",baseSalary);
    }
}
