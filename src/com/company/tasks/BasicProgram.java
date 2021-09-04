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
}
