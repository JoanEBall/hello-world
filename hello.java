public class hello {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Did you pass your proficiency test? (Y / N): ");
    String ans = input.next();
    if(ans.equals("Y")) {
      System.out.println("Yay");
    }
    else {
      System.out.println("lol ouch.");
    }
  }
}
