import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AIdaysTillNextMonth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Create LocalDate object
        LocalDate userDate = LocalDate.of(year, month, day);

        // First day of next month
        LocalDate firstOfNextMonth = userDate.plusMonths(1).withDayOfMonth(1);

        // Calculate difference in days
        long daysUntilNextMonth = ChronoUnit.DAYS.between(userDate, firstOfNextMonth);

        // Print result
        System.out.println("There are " + daysUntilNextMonth + 
                           " days until " + firstOfNextMonth.getMonth() + " starts.");

        sc.close();
    }
}
