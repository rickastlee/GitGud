public class Bitwise {
  public static void main(String[] args) {
  	int mask = 3; //0011
    int num1 = 4;  //1000

    System.out.println(String.format("%d & %d = %b",
    		mask, val, func(mask, val)));
  }
  
  private static boolean func(int mask, int val) {
  	return (mask & val) == 1;
  }
}
