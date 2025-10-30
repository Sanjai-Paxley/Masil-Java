// Program to print a Welcome message using command-line input
public class Sample {
    public static void main(String[] args) {
        // Check if a name was provided as argument
        if (args.length > 0) {
            System.out.println("Welcome " + args[0]);
        } else {
            System.out.println("Please provide a name as a command-line argument.");
        }
    }
}
