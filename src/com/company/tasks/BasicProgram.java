package com.company.tasks;

public class BasicProgram {
    /**
     * https://www.codewars.com/kata/you-cant-code-under-pressure-number-1/
     */
    public static int doubleInteger(int i) {
        return i * 2;
    }

    /**
     * https://www.codewars.com/kata/function-3-multiplying-two-numbers/
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * https://www.codewars.com/kata/volume-of-a-cuboid/
     */
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        // Your code here
        return length * width * height;
    }

    /**
     * https://www.codewars.com/kata/thinkful-number-drills-pixelart-planning
     */
    public static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;
    }

    /**
     * https://www.codewars.com/kata/jennys-secret-message
     */
    public static String greet(String name) {

        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        else
            return String.format("Hello, %s!", name);
    }

    /**
     * https://www.codewars.com/kata/convert-to-binary
     */
    public static int toBinary(int n) {
        String result = Integer.toBinaryString(n);
        return Integer.parseInt(result);
    }


    /**
     * https://www.codewars.com/kata/beginner-series-number-2-clock/
     */
    public static int Past(int h, int m, int s)
    {
            return s * 1000 + m * 60000 + h * 3600000;
    }

    /**
     * https:https://www.codewars.com/kata/return-negative
     */
    public static int makeNegative(final int x) {

        int negative;
        if(x > 0){
            negative = -x;
        }else{
            negative = x;
        }

        return negative;

    }

}
