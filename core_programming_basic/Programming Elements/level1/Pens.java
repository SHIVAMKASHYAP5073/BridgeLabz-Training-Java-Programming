public class Pens {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int ps = pens / students;
        int rp = pens % students;

        System.out.println("The Pen Per Student is " + ps +
                " and the remaining pen not distributed is " + rp);
    }
}