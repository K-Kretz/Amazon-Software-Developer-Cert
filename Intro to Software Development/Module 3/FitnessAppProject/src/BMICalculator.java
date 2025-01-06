public class BMICalculator {

    public double calculateBmiImperial(double weightInPounds, double heightInInches){

        return weightInPounds / (heightInInches*heightInInches) * 703;
    }

    public double calculateBmiMetric(double weightInKilos, double heightInMeters){

        return weightInKilos / (heightInMeters*heightInMeters);
    }

}
