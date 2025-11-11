public class Test {
    public static void main(String[] args) {
        Domino d1 = new Domino(1, 5);
        Domino d2 = new Domino(4, 6);

        System.out.println("Domino 1 : " + d1);
        System.out.println("Domino 2 : " + d2);

        System.out.println("d1 total points = " + d1.totalPoint());
        System.out.println("d2 est un double ? " + d2.isDouble());

        d1.rotate();
        System.out.println("Après rotation d1 : " + d1);

        System.out.println("Comparaison d1 et d2 : " + d1.compareTo(d2));
    }
}