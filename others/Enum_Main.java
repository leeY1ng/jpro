import java.util.Scanner;

/**
 * Enum_Main
 */
public class Enum_Main {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // System.out.println("input the weekday: ");
        // var day = scan.nextLine();
        // if (day == Weekday.SAT || day == Weekday.SUN) {
        //     System.out.println("work at home");
        // }

        // Weekday day = Weekday.SUN;
        // if (day == Weekday.SAT || day == Weekday.SUN) {
        //     System.out.println("workd at home");
        // } else {
        //     System.out.println("work at office");
        // }

        // String s = Weekday.SUN.name();
        // System.out.println(s);
        // int n = Weekday.SUN.ordinal();
        // System.out.println(n);

        Weekday day = Weekday.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("today is "+ day.chineseName +"home");
            System.out.println(day.tag);
        } else {
            System.out.println("today is"+ day.chineseName +"office");
            System.out.println(day.tag);
        }

        // Weekday day1 = Weekday.SAT;
        // switch (day) {
        //     case MON:
        //         break;
        //     case TUE:˜
        //         break;
        //     default:
        //         throw new RuntimeException("can't process"+day);
        // }

    }
}

/**
 * Weekday
 */
// public class Weekday {
//     public static final int SUN = 0;
//     public static final int MON = 1;
//     public static final int TUE = 2;
//     public static final int WED = 3;
//     public static final int THU = 4;
//     public static final int FRI = 5;
//     public static final int SAT = 6;

// }

enum Weekday {
    MON(1, "星期一", "a"), TUE(2, "星期二", "b"), WED(3, "星期三", "c"), THU(4, "星期四", "d"), FRI(5, "星期五", "e"), SAT(6, "星期六", "g"), SUN(0, "星期日", "h");

    public final int dayValue;
    public final String chineseName;
    public final String tag;

    private Weekday(int dayValue, String chineseName, String tag){
        this.dayValue = dayValue;
        this.chineseName = chineseName;
        this.tag = tag;
    }

    @Override
    public String toString(){
        return this.chineseName;
    }
}

// public class Color {
//     public static final String RED = "r";
//     public static final String ORANGE = "o";
//     public static final String BLUE = "b";
// }

