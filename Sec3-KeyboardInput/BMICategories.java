/**
 * BMI Categories
 * http://programmingbydoing.com/a/bmi-categories.html
 * The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in
 * populations. It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of
 * their height in meters.
 * Start with the BMI Calculator you wrote previously (BMICalc.java). Then use some if statements to show the category
 * for a given BMI.
 * BMI	            category
 * less than 18.5	underweight
 * 18.5 to 24.9	    normal weight
 * 25.0 to 29.9	    overweight
 * 30.0 or more	    obese
 * Note: Although BMI is a very good estimate of human body fat, the formula doesn't work well for athletes with a lot
 * of muscle, or people who are extremely short or very tall. If you are concerned about your BMI, check with your
 * doctor.
 */

import java.util.Scanner;

public class BMICategories {

    public static void main(String[] args) {
        BMICalculator();
    }

    public static String BMICategory(double BMI) {
        if (BMI < 18.5) {
            return "underweight";
        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            return "normal weight";
        }
        if (BMI >= 25.0 && BMI <= 29.9) {
            return "overweight";
        }
        if (BMI >= 30.0) {
            return "obese";
        }
        return null; // Should not reach there
    }
