package Two;
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    private double insuranceRate;
    public Truck(String vehicleNumber, double rentalRate, String policyNumber, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
        this.insuranceRate = insuranceRate;
    }
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2;
    }
    @Override
    public double calculateInsurance() {
        return insuranceRate;
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
