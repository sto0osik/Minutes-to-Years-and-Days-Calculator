public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){


        if (minutes > 0) {

            long days = minutes / 1440;
            long years = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");

        } else {

            System.out.println("Invalid value of minutes");

        }

    }
}
