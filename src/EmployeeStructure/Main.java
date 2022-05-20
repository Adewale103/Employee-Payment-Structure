package EmployeeStructure;

public class Main {
    public static void main(String[] args) {
        Employee commissionEmployees = new Employee("Wale","Samuel","3456",
                new CommissionCompensationModel(3278,0.21));

        Employee basePlusCommissionEmployees = new Employee("Shola","Allyson","87654"
                ,new BasePlusCommissionCompensationModel(5489,0.32,3200));

        System.out.println("Commission employee earnings: "+commissionEmployees.earnings());
        System.out.println("Base Plus Commission employee earnings: "+basePlusCommissionEmployees.earnings());

        commissionEmployees.changeEmployeeModel(new BasePlusCommissionCompensationModel(3278,
                0.21,2500));

        basePlusCommissionEmployees.changeEmployeeModel(new CommissionCompensationModel(5489,
                0.32));

        System.out.println();
        System.out.println("After Swapping Employee’s CompensationModel................");

        System.out.println("Commission employee earnings: "+commissionEmployees.earnings());
        System.out.println("Base Plus Commission employee earnings: "+basePlusCommissionEmployees.earnings());

    }

}
