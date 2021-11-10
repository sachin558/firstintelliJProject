/*
Write a java program which generates the minimum and maximum value for each of the Numeric Wrapper classes
(Byte, Short, Integer, Long, Float, Double)
Sample Output:
Integer range:
min: -2147483648
max: 2147483647
Double range:
min: 4.9E-324
max: 1.7976931348623157E308
Long range:
min: -9223372036854775808
max: 9223372036854775807
Short range:
min: -32768
max: 32767
 */
package assingnment1;

public class NumericWapperClass {
    void display(){
        System.out.println("Integer  Range");
        System.out.println("Min  Range  = "+Integer.MIN_VALUE);
        System.out.println("Max Range  = "+Integer.MAX_VALUE);
        System.out.println("Double Range ");
        System.out.println("Min Range ="+Double.MIN_VALUE);
        System.out.println("Max Range = "+Double.MAX_VALUE);
        System.out.println("Long Range ");
        System.out.println("Min"+Long.MIN_VALUE);
        System.out.println("Max"+Long.MAX_VALUE);
        System.out.println("Short Range ");
        System.out.println("Short Range ");
        System.out.println("Min"+Short.MIN_VALUE);
        System.out.println("Max"+Short.MAX_VALUE);
    }

    public static void main(String[] args) {
        NumericWapperClass obj=new NumericWapperClass();
        obj.display();
    }
}
