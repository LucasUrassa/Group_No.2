
/**
 * Write a description of class Exercise11 here.
 *
 * @author (24BIA042)
 * @version (5/2/2026)
 */
import java.util.*;

public class StudentListManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<>();
        int c;

        do {
            c = sc.nextInt();
            sc.nextLine();

            if (c == 1) s.add(sc.nextLine());
            if (c == 2) s.remove(sc.nextLine());
            if (c == 3) for (String x:s) 
            System.out.println(x);
            if (c == 4) 
            System.out.println(s.contains(sc.nextLine()));
            if (c == 5) System.out.println(s.size());

        } while (c != 6);
    }
}

    