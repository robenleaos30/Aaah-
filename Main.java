package Day13;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            if (scanner.next().length() >= scanner.next().length())
            {
                System.out.println("go");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}