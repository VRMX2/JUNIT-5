package Tp2;

public class MethodsUnderTest {
    private Livre l = null;


    public int add(int a, int b) {
        int res = a;
        if (b > 0) {
            while (b-- != 0) {
                res++;
            }
        } else if (b < 0) {
            while (b++ != 0) { // changed b-- to b++ for negative b
                res--;
            }
        }
        return res;
    }

    public int mult(int a, int b) {
        int res = 0;
        while (b > 0) {
            if (b % 2 != 0) {
                res += a;
                b -= 1;
            }
            a *= 2;
            b /= 2;
        }
        return res;
    }

    public double calculatePI(int n) {
        double PI, s = 0;
        if (n < 0) {
            PI = -1;
        } else {
            for (int i = 0; i <= n; i++) {
                s += (Math.pow(-1, i)) / ((2 * i) + 1);
            }
            PI = 4 * s;
        }
        return PI;
    }

    public int[] leftRotating(int[] T, int n) {
        int[] T2 = new int[n];
        for (int i = 0; i < n; i++) {
            T2[(i + 4) % n] = T[i]; // replaced hardcoded 5 with n for flexibility
        }
        return T2;
    }

    public Livre addLivre(String titre, String auteur, int nbpages, double prix) {
        if (!titre.equals(" ") && !auteur.equals(" ")) {
            l = new Livre(titre, auteur, nbpages, prix);
        }
        return l;
    }

    public Livre getLivre() {
        return l;
    }
}