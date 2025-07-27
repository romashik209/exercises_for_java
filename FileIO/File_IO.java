package FileIO;

import java.util.Scanner;

public class File_IO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // the sys.in is the way that the code can get an input from your keyboard
        // and the scanner is a util that helps with things that are connected to
        // getting an input from the
        // user by making it a variable

        System.out.println("HelloWorld!"); // sys.out can show information to thing like your screen
        // and the println is one of the most used ways to
        // write (as in everyday typing and not writing a value to something) something
        // to somewhere in codes
        // theres also an altenative to println: print and it just doesnt prints on the
        // line under

        System.out.printf("Hello %s!%n", "World");
        // printf is print format and it can print formatted
        // this is the syntax for it: 'System.out.printf(locale, formatString, args)'
        // %n = line break
        // %,d = puts ',' where needed in big numbers
        // %b/%B = Boolean
        // %c/%C = unicode character
        // %s/%S = String
        // %d = decimal
        // %x/%X = hexadecimal
        // %h/%H = insigned hexadecimal
        // %o = octal
        // %e/%E = scientific notation
        // %f = floating point number
        // %g/%G = general number
        // %a/%A = hexadecimal floating point number
        // %t/%T = time or date (for more inf search in google 'printf java')
        // these are the usual ones that we use, but there are more
        // if you need them search in google 'all of the java printf uses'
        // more examples:
        System.out.printf("One kilobyte is %,d bytes. %n", 1024);

        System.out.printf("Formatted with precision: PI = %.2f%n", Math.PI);

        float n = 2324435.3000005f;

        // Right-aligning and formatting a
        // float to 20-character width
        System.out.printf("Formatted to right margin: n = %20.5f%n", n);

        System.err.print("this is an error message \n");
        System.err.println("this is another error message but with println");
        System.err.printf("error code: %d, Message: %s%nthe previous error message was made with printf %n", 404,
                "Not Found");
        // Sys.err is a print/println/printf that is used to make error messages that
        // can happen in the code
        // so instead of getting a long, hard to read error from the system you can make
        // it short and understandable

        // InputStream and OutputStream are used to write and read files, source arrays
        // or any peripheral devices

    }
}
