package ro.mirodone;

import ro.mirodone.carpetCalculator.Calculator;
import ro.mirodone.carpetCalculator.Carpet;
import ro.mirodone.carpetCalculator.Floor;

public class Main {

    public static void main(String[] args) {

    // Testing te Carpet Calculator

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " +calculator.getTotalCost());

    //Testing Complex Number

    ComplexNumber one = new ComplexNumber(1.0, 1.0);
    ComplexNumber number = new ComplexNumber(2.5, -1.5);
    one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("one.real= " + number.getReal());
        System.out.println("one.imaginary= " + number.getImaginary());


    }
}
