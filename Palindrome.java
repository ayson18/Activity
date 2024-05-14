class Palindrome {
    public static void main(String[] args) {
        
       // Tester
      String str = "Radar", reverseStr = "";
       int num = 12321;
      int reversedNum = 0, remainder;
      int originalNum = num;

      int strLength = str.length();
  
      for (int i = (strLength - 1); i >=0; --i) {
        reverseStr = reverseStr + str.charAt(i);
      }
  
      if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
        System.out.println(str + " is a Palindrome String.");
      }

      else {
        System.out.println(str + " is not a Palindrome String.");
      }

      while (num != 0) {
          remainder = num % 10;
          reversedNum = reversedNum * 10 + remainder;
          num /= 10;
      }

      if (originalNum == reversedNum) {
          System.out.println(originalNum + " is a palindrome number.");
      }
        else {
          System.out.println(originalNum + " is not a palindrome number.");
      }

    }
  }