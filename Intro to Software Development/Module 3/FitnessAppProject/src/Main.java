public class Main {
    public static void main(String[] args) {
        double weightInPounds1 = 154.0;
        double heightInInches1 = 70.0;
//        double bmi1 = weightInPounds1 / (heightInInches1*heightInInches1) * 703;
//
        double weightInKilos = 70.0;
        double heightInMeters = 1.82;
//        double bmi2 = weightInPounds2 / (heightInInches2*heightInInches2) * 703;
//
//        System.out.println("BMI of User 1: "+ bmi1);
//        System.out.println("BMI of User 2: "+ bmi2);

        //Above is redundant code duplication
        //Below uses classes and methods
        BMICalculator bc1 = new BMICalculator();
        double bmiImperial = bc1.calculateBmiImperial(weightInPounds1,heightInInches1);

        BMICalculator bc2 = new BMICalculator();
        double bmiMetric = bc2.calculateBmiMetric(weightInKilos,heightInMeters);

        System.out.println("BMI of User 1: "+ bmiImperial);
        System.out.println("BMI of User 2: "+ bmiMetric);

    }
}
