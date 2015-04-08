// Example to illustrate Method Overloading
public class overloading{
   public static int average(int n1, int n2) {          // A
      return (n1+n2)/2;
   }
 
   public static double average(double n1, double n2) { // B
      return (n1+n2)/2;
   }
  public static int average(int n1, int n2, int n3) {  // C
      return (n1+n2+n3)/3;
  
   }
    public static int average(int n1, int n2, int n3, int n4) {  // C
      return (n1+n2+n3+n4)/4;
   }


   public static void main(String[] args) {
      System.out.println(average(2, 2));     // Use A
      System.out.println(average(3.0, 2.0)); // Use B
      System.out.println(average(4, 5, 6));  // Use C
      System.out.println(average(4.0, 2));
       System.out.println(average(2,2,2,2));   // Use B - int 2 implicitly casted to double 2.0
      // average(1, 2, 3, 4); // Compilation Error - No matching method
   }
}