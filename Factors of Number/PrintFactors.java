//This program prints all factors of a number
public class PrintFactors {
    public static void printFactors(int number){
        System.out.println("Factors of number " + number + " are : ");
        if(number < 1)
            System.out.println("Invalid Value");
        else{
            int i = 1;
            while(i <= number){
                if(number % i == 0)
                    System.out.print(i + " ");
                i++ ;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintFactors.printFactors(6);
        PrintFactors.printFactors(32);
        PrintFactors.printFactors(10);
        PrintFactors.printFactors(-1);
    }
}
