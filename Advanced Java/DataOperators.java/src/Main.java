public class Main {
    public static void main(String[] args) {
        int i1 = 4, i2 = 2, ia = i1, ib = i2;
        float f1 = 8, f2 = 3, fa = f1, fb = f2;
        double d1 =4.5, d2 = 3.2, da = d1, db = d2;
        char c1 = 's', c2 = 'm', ca = c1, cb = c2;

        System.out.println("Addition:");
        System.out.println("int: \t\t\t " + i1 + " + " + i2 + " = " + (i1 + i2));
        System.out.println("float: \t\t\t " + f1 + " + " + f2 + " = " + (f1 + f2));
        System.out.println("double: \t\t " + d1 + " + " + f2 + " = " + (d1 + d2));
        System.out.println("char: \t\t\t " + c1 + " + " + c2 + " = " + (c1 + c2));

        System.out.println("\nSubtraction:");
        System.out.println("int: \t\t\t" + i1 + " - " + i2 + " = " + (i1 - i2));
        System.out.println("float: \t\t\t" + f1 + " - " + f2 + " = " + (f1 - f2));
        System.out.println("double: \t\t" + d1 + " - " + f2 + " = " + (d1 - d2));
        System.out.println("char: \t\t\t" + c1 + " - " + c2 + " = " + (c1 - c2));

        System.out.println("\nMultiplication:");
        System.out.println("int: \t\t\t" + i1 + " * " + i2 + " = " + (i1 * i2));
        System.out.println("float: \t\t\t" + f1 + " * " + f2 + " = " + (f1 * f2));
        System.out.println("double: \t\t" + d1 + " * " + f2 + " = " + (d1 * d2));
        System.out.println("char: \t\t\t" + c1 + " * " + c2 + " = " + (c1 * c2));

        System.out.println("\nDivision:");
        System.out.println("int: \t\t\t" + i1 + " / " + i2 + " = " + (i1 / i2));
        System.out.println("float: \t\t\t" + f1 + " / " + f2 + " = " + (f1 / f2));
        System.out.println("double: \t\t" + d1 + " / " + f2 + " = " + (d1 / d2));
        System.out.println("char: \t\t\t" + c1 + " / " + c2 + " = " + (c1 / c2));

        i1++; f1++; d1++; c1++;
        System.out.println("\nIncrement:");
        System.out.println("int: \t\t\t" + ia +   "++ = " + i1);
        System.out.println("float: \t\t\t" + fa + "++ = " + f1);
        System.out.println("double: \t\t" + da + "++ = " + d1);
        System.out.println("char: \t\t\t" + ca + "++ = " + c1);

        i2--; f2--; d2--; c2--;
        System.out.println("\nDecrement:");
        System.out.println("int: \t\t\t" + ib + "-- = " + i2);
        System.out.println("float: \t\t\t" + fb + "-- = " + f2);
        System.out.println("double: \t\t" + db + "-- = " + d2);
        System.out.println("char: \t\t\t" + cb + "-- = " + c2);

    }
}