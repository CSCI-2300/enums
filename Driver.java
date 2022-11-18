public class Driver
{
   enum Month{
     JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
     int days;
     Month(){
        System.out.println("Month constructor is called");
     }
     public void setDays(int numDays){days = numDays;}
   }

   public static void main(String []args)
   {
      Month jan = Month.JAN;
      jan.setDays(31);
   

      Month feb = Month.FEB;
      feb.setDays(28);

      System.out.println("Days in Feb " + feb.days);
      System.out.println("Days in Jan " + jan.days);

      Month jan2 = Month.JAN;
      System.out.println("Days in Jan 2 " + jan2.days);
   }
}
