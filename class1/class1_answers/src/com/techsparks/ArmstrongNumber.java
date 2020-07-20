package com.techsparks;

import java.util.Arrays;

/*
For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3
Write 2 methods:
1. Find if given number is Armstrong number
    - Hint : method - Boolean isArmstrongNumber(int number)
2. Find all Armstrong number within given
    - Hint : method - int[] armstrongNumberInRange(int fromNumber, int toNumber)
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Is number :"+isArmstrongNumber(153));
        System.out.println("\n"+Arrays.toString(armstrongNumberInRange(0, 1000)));
    }

    public static boolean isArmstrongNumber(int number) {
        int c = 0, a, temp;
        int n = number;//It is the number to check armstrong
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            System.out.println("armstrong number");
            return true;
        } else {
            System.out.println("Not armstrong number");
            return false;
        }
    }

    public static int[] armstrongNumberInRange(int fromNumber, int toNumber) {
        //generate Armstrong numbers between start and end
        int num, i, rem, temp, counter = 0;
        int start = fromNumber;
        int end = toNumber;
        int[] list = new int[0];
        for (i = start + 1; i < end; i++) {
            temp = i;
            num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + rem * rem * rem;
                temp = temp / 10;
            }
            if (i == num) {
                if (counter == 0) {
                    System.out.print("Armstrong Numbers Between " + start + " and " + end + ": ");
                }
                System.out.print(i + "  ");
                counter++;
                list = Arrays.copyOf(list, counter);
                list[counter-1] = i;
            }
        }
        // if no Armstrong number is found
        if (counter == 0) {
            System.out.println("There is no Armstrong number Between " + start + " and " + end);
        }
    return list;
    }

}
