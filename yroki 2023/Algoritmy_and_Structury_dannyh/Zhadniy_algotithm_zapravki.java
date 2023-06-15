package Algoritmy_and_Structury_dannyh;

public class Zhadniy_algotithm_zapravki {
    public static void main(String[] args) {
        int[] ostanovki = {0, 200, 375, 550, 750, 950};
        System.out.println(minimumOstanovok(ostanovki, 400));
    }
    public static int minimumOstanovok(int[] ostanovki, int dalnost) {
        int resultat = 0;// Оптимальное количество остановок.
        int tekushayaOstanovka = 0;

        while(tekushayaOstanovka < ostanovki.length - 1){
            int sledushayaOstanovka = tekushayaOstanovka;

            while(sledushayaOstanovka < ostanovki.length - 1 &&
            ostanovki[sledushayaOstanovka+1] - ostanovki[tekushayaOstanovka] <= dalnost)
                sledushayaOstanovka++;

            if(tekushayaOstanovka == sledushayaOstanovka)
                return -1;

            if (sledushayaOstanovka < ostanovki.length - 1)
                resultat++;

            tekushayaOstanovka = sledushayaOstanovka;

        }
        return resultat;
    }
}
