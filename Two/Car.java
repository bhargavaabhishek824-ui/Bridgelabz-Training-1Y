package Two;
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // Encapsulated
    private double insuranceRate;
    public Car(String vehicleNumber, double rentalRate, String policyNumber, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
        this.insuranceRate = insuranceRate;
    }
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}