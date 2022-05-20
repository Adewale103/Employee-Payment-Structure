package EmployeeStructure;

public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel compensationModel;

    public Employee(String firstName, String lastName, String socialSecurityNumber,CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    public void changeEmployeeModel(CompensationModel compensationModel){
        this.compensationModel = compensationModel;
    }

    public double earnings(){
        return compensationModel.earnings();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", compensationModel.getGrossSales(),
                "commission rate",compensationModel.getCommissionRate());
    }
}
