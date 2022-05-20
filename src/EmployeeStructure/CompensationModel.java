package EmployeeStructure;

public class CompensationModel {
    private double grossSales;
    private double commissionRate;

    public CompensationModel(double grossSales, double commissionRate) {
        if(grossSales < 0){
            throw new IllegalArgumentException("grossSales must be > 0.0");
        }
        if(commissionRate < 0 || commissionRate > 1){
            throw new IllegalArgumentException("commission rate must be > 0 and <= 1");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double earnings(){
        return grossSales * commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f%n%s: %.2f","Gross sales",grossSales,
                "Commission rate",commissionRate);
    }
}
