package Seleniums;

public class Test1 {

    public static void main(String[] args) {

        System.out.println(checkWeight(-8));

    }

    public static String checkWeight(int wt) {
        String msg = null;
        if (wt < 0) {
            msg = "Cannot be negative";
        } else if (wt == 0) {
            msg = "Cannot be zero";
        } else if (wt > 100) {
            msg = "Call by phone";
        } else {
            msg = "Ordered";
        }
        return msg;
    }
}
