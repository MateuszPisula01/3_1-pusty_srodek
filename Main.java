class Main {
  public static void main(String[] args) {

    String znak="*"; 
   
     for (int i = 1; i <= 4; i++) 

    {
for (int y=1;y<=4;y++)
  { 
    if((i>1 && i<4 ) && (y>1 && y<4))
    {
    System.out.print(" ");
  }
      else 
      System.out.print("*");

    }
      System.out.println();
 }
}}