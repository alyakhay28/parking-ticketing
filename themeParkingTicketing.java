import java.util.Scanner;

public class themeParkingTicketing {

    // data members
    private String packageCode;
    private double priceForAdult;
    private double priceForChild;
    private int numberOfAdults;
    private int numberOfChildren;

    // default constructor
    public themeParkingTicketing() {
        this.packageCode = "";
        this.priceForAdult = 0.0;
        this.priceForChild = 0.0;
        this.numberOfAdults = 0;
        this.numberOfChildren = 0;
    }

    // mutator methods
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    // retriever methods
    public String getPackageCode() {
        return this.packageCode;
    }

    public int getNumberOfAdults() {
        return this.numberOfAdults;
    }

    public int getNumberOfChildren() {
        return this.numberOfChildren;
    }

    // determine ticket price based on the package code
    public void determineTicketPrice() {
        switch (this.packageCode) {
            case "A":
                this.priceForAdult = 40.00;
                this.priceForChild = 21.00;
                break;
            case "B":
                this.priceForAdult = 23.00;
                this.priceForChild = 14.00;
                break;
            case "C":
                this.priceForAdult = 38.00;
                this.priceForChild = 18.00;
                break;
            default:
                System.out.println("Invalid package code.");
                break;
        }
    }

    // calculate and return the price per package
    public double calcPrice() {
        return (this.numberOfAdults * this.priceForAdult) + (this.numberOfChildren * this.priceForChild);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        themeParkingTicketing ticket1 = new themeParkingTicketing();
        themeParkingTicketing ticket2 = new themeParkingTicketing();

        // Function to read package code and validate it
        System.out.print("Enter package code for ticket 1 (A/B/C): ");
        String packageCode = scanner.next();
        while (!packageCode.equals("A") && !packageCode.equals("B") && !packageCode.equals("C")) {
            System.out.print("Invalid package code. Enter package code (A/B/C): ");
            packageCode = scanner.next();
        }
        ticket1.setPackageCode(packageCode);
        ticket1.determineTicketPrice();

        // Read number of adults and children
        System.out.print("Enter number of adults for ticket 1: ");
        int numberOfAdults = scanner.nextInt();
        ticket1.setNumberOfAdults(numberOfAdults);

        System.out.print("Enter number of children for ticket 1: ");
        int numberOfChildren = scanner.nextInt();
        ticket1.setNumberOfChildren(numberOfChildren);

        // Calculate and display price
        double price1 = ticket1.calcPrice();
        System.out.println("Price for ticket 1: " + price1);

        // Repeat for the second ticket
        System.out.print("Enter package code for ticket 2 (A/B/C): ");
        packageCode = scanner.next();
        while (!packageCode.equals("A") && !packageCode.equals("B") && !packageCode.equals("C")) {
            System.out.print("Invalid package code. Enter package code (A/B/C): ");
            packageCode = scanner.next();
        }
        ticket2.setPackageCode(packageCode);
        ticket2.determineTicketPrice();

        System.out.print("Enter number of adults for ticket 2: ");
        numberOfAdults = scanner.nextInt();
        ticket2.setNumberOfAdults(numberOfAdults);

        System.out.print("Enter number of children for ticket 2: ");
        numberOfChildren = scanner.nextInt();
        ticket2.setNumberOfChildren(numberOfChildren);

        // Calculate and display price
        double price2 = ticket2.calcPrice();
        System.out.println("Price for ticket 2: " + price2);

        // Calculate and display the total price of tickets sold
        double totalPrice = price1 + price2;
        System.out.println("Total price of tickets sold: " + totalPrice);

        // Display the highest number of adults among the two tickets
        int maxAdults = Math.max(ticket1.getNumberOfAdults(), ticket2.getNumberOfAdults());
        System.out.println("Highest number of adults among the two tickets: " + maxAdults);

        scanner.close();
    }
}
