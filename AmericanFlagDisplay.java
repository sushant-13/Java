public class AmericanFlagDisplay{
  public static void main(String[] args){
      for (int i = 1; i <= 13; i++) {
          if (i <= 9) {
              if (i % 2 == 1) {
                  System.out.println("* * * * * * ===============================");
              } else {
                  System.out.println(" * * * * *  ===============================");
              }
          } else {
              System.out.println("===========================================");
          }
      }
  }
}
