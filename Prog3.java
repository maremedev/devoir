import java.util.Random;

public class Prog3 {
    public static int positionMin(int[] tab, int debut) {
        int position = debut;
        for (int i = debut + 1; i < tab.length; i++) {
            if (tab[i] < tab[position]) {
                position = i;
            }
        }
        return position;
    }

    public static void trieSelection(int[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            int position = positionMin(tab, i);
            int temp = tab[i];
            tab[i] = tab[position];
            tab[position] = temp;
        }
    }

    static void afficher(int[] tab) {
        for (int val : tab)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++)
            tab[i] = rand.nextInt(100);

        System.out.print("Tableau initial : ");
        afficher(tab);

        trieSelection(tab);

        System.out.println("Tableau trié : ");
        afficher(tab);
    }
}
