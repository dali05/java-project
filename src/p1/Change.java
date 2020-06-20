package p1;

// Do not modify p1.Change
class Change {
    long coin2 = 0;
    long bill5 = 0;
    long bill10 = 0;
}

class Solution {

    // Do not modify this method​​​​​​‌​​​​‌‌​‌‌‌‌‌‌​‌​​​​​‌​​‌ signature
    static Change optimalChange(long s) {
        Change change = new Change();
        long moduleTen = 0;
        long moduleFive = 0;
        long moduleTwo = 0;
        if (s<2 ) {return null;}
        if (s >= 10 || s >= 5 || s >= 2) {
            change.bill10 = s /10;
            moduleTen = s%10;
        }
        if (moduleTen >=5 && ((moduleTen % 5) % 2 == 1)) {
            change.coin2 = moduleTen / 2;
        }
        else {
            change.bill5 = moduleTen / 5;
            moduleFive = moduleTen % 5;
        }
        if (moduleFive >=2) {
            change.coin2 = moduleFive / 2;
            moduleTwo = moduleFive % 2;
        }
        return change;
    }

    public static void main(String[] args) {
        long s = 31L; // p1.Change this value to perform other tests
        Change m = Solution.optimalChange(s);

        System.out.println("Coin(s)  2€: " + m.coin2);
        System.out.println("Bill(s)  5€: " + m.bill5);
        System.out.println("Bill(s) 10€: " + m.bill10);

        long result = m.coin2 * 2 + m.bill5 * 5 + m.bill10 * 10;
        System.out.println("\np1.Change given = " + result);
    }

}





