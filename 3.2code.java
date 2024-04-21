import java.util.Scanner;

public class TravelItineraryPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of destinations: ");
        int num = scanner.nextInt();
         double b=0,e=0;
        while(num-->0){
            // Get user input for destination, dates, and preferences
            System.out.println("Welcome to Travel Itinerary Planner!");
            System.out.print("Enter your destination: ");
            String destination = scanner.next();
            System.out.print("Enter your travel dates (e.g., MM/DD/YYYY - MM/DD/YYYY): ");
           
            String travelDates = scanner.next();
            System.out.print("Enter your budget: ");
            double budget = scanner.nextDouble();
            System.out.print("Enter your expenses: ");
            double expenses = scanner.nextDouble();
            b+=budget;
            e+=expenses;
    
            // Display basic itinerary details
            System.out.println("\nYour Travel Itinerary:");
            System.out.println("Destination: " + destination);
            System.out.println("Travel Dates: " + travelDates);
            //System.out.println("Budget: $" + budget);
    
            // Integration with external APIs for maps and weather
            // Code for retrieving map and weather information would go here
            // For simplicity, we'll just display sample map and weather data
            System.out.println("\nMap: (Sample map data)");
            System.out.println("https://www.example.com/maps?destination=" + destination);
            System.out.println("\nWeather Forecast: (Sample weather data)");
            System.out.println("Forecast for " + destination + " during travel dates: Sunny");
                
        }


        // Perform budget calculations and display
        // For simplicity, we'll just subtract a fixed cost from the budget
        double remainingBudget = b - e;
        // Assuming a fixed cost of $500
        if(remainingBudget>0)
        System.out.println("\nRemaining Budget after expenses: $" + remainingBudget);
        else
        System.out.println("Expenses exceed budget \n You hava additional expenses of :"+(remainingBudget*-1));

        // Offer additional features like booking accommodations, activities, etc.
        // These would typically involve further user input and integration with external services

        // Close the scanner
        scanner.close();
    }
}
