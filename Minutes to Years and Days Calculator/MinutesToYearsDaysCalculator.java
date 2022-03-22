//This program converts minutes to years and days
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long hours = (minutes / 60);
            hours += (minutes % 60);
            long days = (hours / 24);
            days += (hours % 24);
            long years = (days / 365);
            long remainingDays = (days % 365);
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}
