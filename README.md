# Theme Park Ticketing System

A Java console application for theme park ticket pricing with package management and group calculations.

## Features

- **Three Package Options:** 
  - Package A: Adult $40.00 | Child $21.00
  - Package B: Adult $23.00 | Child $14.00
  - Package C: Adult $38.00 | Child $18.00

- **Multiple Ticket Processing:** Handles calculations for two separate tickets
- **Input Validation:** Ensures valid package codes (A, B, or C)
- **Comprehensive Calculations:**
  - Individual ticket pricing
  - Total sales calculation
  - Statistical analysis (highest number of adults)

## Class Structure

### `themeParkingTicketing` Class

#### Data Members
- `packageCode`: String - Ticket package identifier (A/B/C)
- `priceForAdult`: double - Adult ticket price for selected package
- `priceForChild`: double - Child ticket price for selected package
- `numberOfAdults`: int - Number of adult tickets
- `numberOfChildren`: int - Number of child tickets

#### Methods
- **Constructors:**
  - Default constructor initializes all values

- **Mutators (Setters):**
  - `setPackageCode(String)`: Sets package code
  - `setNumberOfAdults(int)`: Sets adult count
  - `setNumberOfChildren(int)`: Sets child count

- **Retrievers (Getters):**
  - `getPackageCode()`: Returns package code
  - `getNumberOfAdults()`: Returns adult count
  - `getNumberOfChildren()`: Returns child count

- **Business Logic:**
  - `determineTicketPrice()`: Sets prices based on package code
  - `calcPrice()`: Calculates total price for the ticket

## Usage Example

```
Enter package code for ticket 1 (A/B/C): A
Enter number of adults for ticket 1: 2
Enter number of children for ticket 1: 3
Price for ticket 1: 143.0

Enter package code for ticket 2 (A/B/C): B
Enter number of adults for ticket 2: 1
Enter number of children for ticket 2: 2
Price for ticket 2: 51.0

Total price of tickets sold: 194.0
Highest number of adults among the two tickets: 2
```

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java compiler (`javac`)
- Command line interface

### Compilation
```bash
javac themeParkingTicketing.java
```

### Execution
```bash
java themeParkingTicketing
```

## Program Flow

1. Creates two ticket objects (`ticket1` and `ticket2`)
2. For each ticket:
   - Prompts for and validates package code
   - Sets corresponding adult/child prices
   - Prompts for number of adults and children
   - Calculates and displays individual ticket price
3. Calculates and displays total sales
4. Finds and displays highest number of adults across both tickets

## Object-Oriented Principles Demonstrated

- **Encapsulation:** Private data members with public accessor methods
- **Abstraction:** Complex pricing logic hidden within methods
- **Modularity:** Separate methods for different functionalities

## Error Handling

- Validates package codes (only accepts A, B, or C)
- Handles invalid package codes with re-prompting

## Future Enhancements

Potential improvements could include:
- Support for more than two tickets
- Discount calculations for large groups
- Family package options
- Seasonal pricing variations
- File I/O for saving ticket data
- GUI interface

## Author

github username: alyakhay28
