import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of at least 10 characters: ");
        String input = scanner.nextLine();

        if (input.length() < 10) {
            System.out.println("String is not long enough.");
            return;
        }

        if (input.length() > 10){
            System.out.println("String has exceeded the limit of 10 characters.");
            return;
        }

        StringBuilder sb = new StringBuilder(input);

        System.out.println("Length of the string: " + sb.length());

        System.out.println("First character: " + sb.charAt(0));

        System.out.println("Last character: " + sb.charAt(sb.length() - 1));

        int indexOfA = sb.indexOf("a");
        System.out.println("Index of first occurrence of 'a': " + (indexOfA != -1 ? indexOfA : "Not found"));

        System.out.println("Substring from index 3 to 6: " + sb.substring(3, 7));

        sb.append("123");
        System.out.println("After appending '123': " + sb);

        sb.insert(4, "xyz");
        System.out.println("After inserting 'xyz' at index 4: " + sb);

        sb.delete(2, 5);
        System.out.println("After deleting from index 2 to 4: " + sb);

        sb.deleteCharAt(8);
        System.out.println("After deleting the character at index 8: " + sb);

        sb.reverse();
        System.out.println("Reversed string: " + sb);
    }
}
