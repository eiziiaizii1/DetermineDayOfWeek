package dayofweek;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d, m, y, k, j, e, f, g, h, i;

        do {
            System.out.println("Enter the day of the month (1-31)");
            d = in.nextInt();
            if (d < 1 || d > 31) {
                System.out.println("Invalid input");
            }
        } while (d < 1 || d > 31);
        do {
            System.out.println("Enter the month of the year (1-12)");
            m = in.nextInt();
            if (m < 1 || m > 12) {
                System.out.println("Invalid input");
            }
        } while (m < 1 || m > 12);
        do {
            System.out.println("Enter the year(1970-2022)");
            y = in.nextInt();
            if (y < 1970 || y > 2022) {
                System.out.println("Invalid input");
            }
        } while (y < 1970 || y > 2022);

        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }

        k = y % 100;
        j = y / 100;
        e = (int) (2.6 * m - 5.39);
        f = k / 4;
        g = j / 4;
        h = d + e + k + f + g - 2 * j;
        i = h % 7;
        if (i < 0)
            i += 7;

        switch (i) {
            case 1: System.out.println("The given date is Monday"); break;  
            case 2: System.out.println("The given date is Tuesday"); break;   
            case 3: System.out.println("The given date is Wednesday"); break;     
            case 4: System.out.println("The given date is Thursday"); break;    
            case 5: System.out.println("The given date is Friday"); break;                 
            case 6: System.out.println("The given date is Saturday"); break;                   
            case 0: System.out.println("The given date is Sunday");          
        }
    }
}
