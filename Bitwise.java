public class Main {
  public static void main(String[] args) {
    int maxLen = 4;
    int[] tests = { 0, 1, 2, 3, 4 };

    for (int i = 0; i < maxLen - 1; i++) {
      test(i, tests);
    }
  }

  private static void test(int mask, int[] testArray) {
    for (int i = 0; i < testArray.length; i++) {
      int val = testArray[i];
      System.out.println(String.format("%d & %d = %b",
          mask, val, (mask & val) == 1));
    }
  }
}
