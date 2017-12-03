/**
* Month Name
* https://programmingbydoing.com/a/month-name.html
* Write a function.
* It will return the name of a month of the year, given the month number, according to the table below. 
* Make sure you do not put any input or output statements in the function; the month number will be passed in and the string containing the name will be returned.
*/

public class MonthName{
    public static String month_name(int month){
      if(month == 1){
        return "January";
      }
      else if(month == 2){
        return "February";
      }
      else if(month == 3){
        return "March";
      }
      else if(month == 4){
        return "April";
      }
      else if(month == 5){
        return "May";
      }
      else if(month == 6){
        return "June";
      }
      else if(month == 7){
        return "July";
      }
      else if(month == 8){
        return "August";
      }
      else if(month == 9){
        return "September";
      }
      else if(month == 10){
        return "October";
      }
      else if(month == 11){
        return "November";
      }
      else if(month == 12){
        return "December";
      }
      else {
      return "error";
      }
    }
    public static void main( String[] args ){

    System.out.println( "Month 1: " + month_name(1) );
    System.out.println( "Month 2: " + month_name(2) );
    System.out.println( "Month 3: " + month_name(3) );
    System.out.println( "Month 4: " + month_name(4) );
    System.out.println( "Month 5: " + month_name(5) );
    System.out.println( "Month 6: " + month_name(6) );
    System.out.println( "Month 7: " + month_name(7) );
    System.out.println( "Month 8: " + month_name(8) );
    System.out.println( "Month 9: " + month_name(9) );
    System.out.println( "Month 10: " + month_name(10) );
    System.out.println( "Month 11: " + month_name(11) );
    System.out.println( "Month 12: " + month_name(12) );
    System.out.println( "Month 43: " + month_name(43) );
  }
}
