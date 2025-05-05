// Boilerplate code and running my first program(printing statements)!

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("I am a programmer!");
        System.out.println("Hello World!");
        System.out.println("I love Java!");
        System.out.println(args[0]);
    }
}

// What are Variables and how to define it!
class Variables {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;
        int num_3 = 30;
        int num_4;
        num_4 = 80;
        System.out.println(num_3);
        System.out.println(num_4);
        System.out.println(num2);
        System.out.println(num);
    }
}

//Data types
//Primitive data types
class data_types {
    public static void main(String[] args) {
        //Non-Numeric
        char c = '=';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);

        //Numeric
        byte b = 2; //(range = -228 : 227  /8bits)
        System.out.println(b);

        short s = 5; //(range = -32768 : 32767  /16bits)
        System.out.println(s);

        int i = 10; //(range = -2,147,483,648 : 2,147,483,647  /32bits)
        System.out.println(i);

        long l = 20; //(range = -9,223,372,036,854,775,808 : 9,223,372,036,854,775,807  /64bits)
        System.out.println(l);

        long g = 3_000_000_000L;
        System.out.println(g);

        float f = 3.8F;  //(range = 1.40239846 x 10^-45 : 3.40239846 x 10^38  /32bits)
        System.out.println(f);

        double d = 2.7; //(range = 4.94065............ x 10^-324 : 1.79769............. x 10^308  /64bits)
        System.out.println(d);
    }
}

//Non-Primitive data types
class string {
    public static void main(String[] args) {
        String s = "I love java!";
        System.out.println(s);

        System.out.println(s.charAt(7));
        System.out.println(s.charAt(2));

        String s2 = """
                Harry potter and the philosopher's Stone
                Harry potter and the Chambers of secrets
                Harry potter and the prisoner of Azkaban
                Harry potter and the Goblet of fire
                Harry potter and the Order of phoenix
                Harry potter and the half Blood prince
                Harry potter and the Deathly hallows Part 1
                Harry potter and the Deathly hallows Part 2
                """;

        System.out.println(s2);
        /*
        This is a multiline comment example!
         */
    }
}

//Typecasting
class Typecast {
    public static void main(String[] args) {

        //Widening typecasting(Automatically done by Java!)
        int i = 200;
        long l = i;
        System.out.println(l);

        //Explicit Typecasting(User defined)
        long x = 1000000;
        int y = (int) x;
        System.out.println(y);

        int a = 2000;
        byte b = (byte) a;
        System.out.println(b);
    }
}

//final keyword to define constants
class constant {
    public static void main(String[] args) {
        final double PI;
        PI= 3.14159265358979;
        System.out.println(PI);
        //PI = 3;
        //System.out.println(PI);
        //Once variable set to constant(final keyword), it cannot be reassigned, or it's value cannot be changed.
    }
}

//Reading input in java
import java.util.Scanner;

 class Reading_input {
    public static void main(String[] args) {
        Scanner sc = new Sannner(System.in);
    }
}
