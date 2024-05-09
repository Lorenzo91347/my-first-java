import java.util.Scanner;

public class App {

    /*
     * please note, when declaring a new variable you also need to declare type of
     * the variable (int, String, boolean, double etc)
     */

    static int number = 32; // %d
    static String name = "Lorenzo"; // %s
    static String name1 = "Lorenzo";
    static String country1 = new String("Italy");
    static String country2 = new String("ITALY");
    static double dNUmber = 3.4; // %f
    static char character = '$'; // %c
    static boolean bool = false; // %b

    public static void main(String[] args) throws Exception {

        /*
         * In this first example, we show how you can concatenate the variables into a
         * string to print the sections of string plus the variables where
         * they've been inserted (e.g. "string" + variable + "string")
         */

        System.out.println("Hi, my name is " + name + ", I come from " + country1 + ",and I'm " + number);

        /*
         * the next example shows the equality operator can be used to determine whether
         * a string is in the same memory location
         * as another for performance and memory defragmentation purposes, the first
         * pair (name,name1) is piled in the same location,
         * and will turn out true, the second pair when declared sets them in a
         * different location each time,and will print out false.
         */

        System.out.println(name == name1);
        System.out.println(country1 == country2);

        /*
         * the two methods below are used to check if the actual content of two string
         * variables are equal,the second method ignoring
         * upper or lower case
         */

        System.out.println(country1.equals(country2));
        System.out.println(country1.equalsIgnoreCase(country2));

        /*
         * this method search for a character sequence(even in a multiword phrase) and
         * substitute it with
         * the sequence you set as a replacement.
         */

        String updateCountry = country1.replace("Italy", "UK");
        System.out.println(updateCountry);

        /*
         * This method checks if the target string contains the char sequence you
         * mentioned
         */

        System.out.println(country1.contains("UK"));

        /*
         * Here we are formatting a string which can output a different line depending
         * on the content, note that the formatting modulus
         * needs to correspond to the type of variable which your declare it to be a
         * placeholder of e.g. %s for string,%d for integer,
         * %f for double and so on
         */

        String formatString = String.format(
                "hello, I am %s. I am from %s, and I am %d,my favourite double number is %f, in some languages you need to use %c, but this info is %b ",
                name, country1, number, dNUmber, character, bool);
        System.out.println(formatString);

        /*
         * Here I am finding out the length of a particular string using variable.length
         */

        System.out.println(country2.length());

        /*
         * here we use the scanner utility to read the standard stream input(in this
         * case keyboard and the console),
         * first initializing it at line 91,asking a question on 92 through the
         * console,prompting the user
         * to enter His/Her name pairing the variable "name" to the scanner method
         * nextLine(),which can be used when typed appropriately to scan other types of
         * input.
         * and finally using println() to display it on console,before turning off the
         * scanner to free up the resources assigned to it.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? please enter it in the console below and the console will output it.");
        String name = scanner.nextLine();
        System.out.printf("Hello %s. How old are you?? ", name);
        int age = scanner.nextInt();
        System.out.printf("So you are %d years old,gotcha. What language do you prefer? ", age);

        /*
         * If you use nextLine() again, the program will see that a line was already
         * entered in the input buffer,
         * so here you can insert another scanner.nextLine() to clean out the buffer
         */
        scanner.nextLine();

        String language = scanner.nextLine();
        System.out.printf("%s, ok that is a good one." + "\n", language);

        System.out.println("enter the first number ");
        int number1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter the second number ");
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What operation would you like to perform? ");
        String operation = scanner.nextLine();

        // Here we play a bit more with the scanner,along with mathematical operators
        // and conditionals.

        if (operation.equals("sum")) {
            System.out.printf("%d + %d = %d", number1, number2, number1 + number2);

        } else if (operation.equals("sub")) {
            System.out.printf("%d - %d = %d", number1, number2, number1 - number2);
        } else if (operation.equals("mul")) {
            System.out.printf("%d * %d = %d", number1, number2, number1 * number2);
        } else if (operation.equals("div")) {
            if (number2 == 0) {
                System.out.println("sorry,cannot divide by 0.");
            }
            System.out.printf("%d % %d = %d", number1, number2, number1 % number2);
        } else {
            System.out.println("sorry,the operation you've entered is not valid");
        }

        scanner.close();

    }
}
