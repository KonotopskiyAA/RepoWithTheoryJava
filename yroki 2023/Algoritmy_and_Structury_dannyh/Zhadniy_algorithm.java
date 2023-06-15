package Algoritmy_and_Structury_dannyh;

import java.util.Arrays;

public class Zhadniy_algorithm {
    public static void main(String[] args) {
        int [] cifry = {1, 3, 7, 9, 9, 5};
        System.out.println(maxChisloIzCifr(cifry));
    }
    public static String maxChisloIzCifr (int [] cifry) {
        Arrays.sort(cifry);
        String resultCifr = "";
        for (int i = cifry.length -1; i >= 0; i--)
            resultCifr += cifry[i];

        return resultCifr;

    }
}
