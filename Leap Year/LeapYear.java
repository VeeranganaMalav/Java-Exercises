public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean leap ;

        if(year < 1){
            leap = false ;
        }
        else{
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        leap = true ;
                    }
                    else{
                        leap = false ;
                    }
                }
                else{
                    leap = true;
                }
            }
            else{
                leap = false ;
            }
        }
        return leap;
    }

    public static void main(String[] args) {
        boolean  result;
        result = LeapYear.isLeapYear(-1600);
        System.out.println(result);
        result = LeapYear.isLeapYear(1600);
        System.out.println(result);
        result = LeapYear.isLeapYear(2017);
        System.out.println(result);
        result = LeapYear.isLeapYear(2000);
        System.out.println(result);
    }
}
