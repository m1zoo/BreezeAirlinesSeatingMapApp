import java.util.Scanner;

public class BreezeAirlinesSeatingApp {
    private static String[][] courseMembers;
    private static int[] passengerNumbers;
    private static double[] premiumCharges;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Breeze Airlines Seating Map Application!");

        
        initializeCourseMembers(scanner);

        
        assignSeatsAndCalculateCharges(scanner);


        displaySeatingMap();


        displayCharges();

        System.out.println("Thank you for using the Breeze Airlines Seating Map Application!");
        scanner.close();
    }

    private static void initializeCourseMembers(Scanner scanner) {
        System.out.println("Enter the number of course members (including the professor):");
        int numMembers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over
    
        // initialize the arrays based on the number of members
        // include an extra field for class level and separate fields for each possible seat assignment
        courseMembers = new String[numMembers][10]; // each member has first name, MI, last name, seats A-F, and class level
        passengerNumbers = new int[numMembers];
        premiumCharges = new double[numMembers];
    
        // collect details for each course member
        for (int i = 0; i < numMembers; i++) {
            System.out.println("Enter details for course member " + (i + 1));
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Middle Initial: ");
            String middleInitial = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Class Level (e.g., Freshman, Sophomore, etc.): ");
            String classLevel = scanner.nextLine();
    
            // initially no seat assignments
            courseMembers[i][0] = firstName;
            courseMembers[i][1] = middleInitial;
            courseMembers[i][2] = lastName;
            for (int j = 3; j < 9; j++) {
                courseMembers[i][j] = "";  // Seats A-F are initially unassigned
            }
            courseMembers[i][9] = classLevel; // Store class level at index 9
    
            // Assume passenger number and charges are to be assigned later
            passengerNumbers[i] = 0; // Placeholder, real passenger number needed
            premiumCharges[i] = 0.0; // Initial charge is zero, to be calculated
        }
    }
    

    private static void assignSeatsAndCalculateCharges(Scanner scanner) {
  
    }

    private static void displaySeatingMap() {

    }

    private static void displayCharges() {

    }
}
