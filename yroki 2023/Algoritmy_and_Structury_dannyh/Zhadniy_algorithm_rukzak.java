package Algoritmy_and_Structury_dannyh;

import java.util.Arrays;
import java.util.Comparator;

public class Zhadniy_algorithm_rukzak {
    public static void main(String[] args) {
        final Predmety predmety = new Predmety(4, 20);
        final Predmety predmety2 = new Predmety(3, 18);
        final Predmety predmety3 = new Predmety(2, 14);

        final Predmety[] predmeties = {predmety, predmety2,predmety3};

        Arrays.sort(predmeties, Comparator.comparingDouble(Predmety::cennostNaEdinicuVesa).reversed());

        System.out.println(Arrays.toString(predmeties));

        final int VmestimostRukzaka = 7;


        int tekushayaCena = 0;
        int tekushiyVes = 0;
        int indexTekushegoPredmeta = 0;

        while (indexTekushegoPredmeta < predmeties.length && tekushiyVes != VmestimostRukzaka){
            if(tekushiyVes + predmeties[indexTekushegoPredmeta].getVes() < VmestimostRukzaka) {
                //берем объект целиком.
                tekushayaCena += predmeties[indexTekushegoPredmeta].getCena();
                tekushiyVes += predmeties[indexTekushegoPredmeta].getVes();
            } else {
                //берем только часть объекта
                tekushayaCena += ((VmestimostRukzaka - tekushiyVes) / (double) predmeties[indexTekushegoPredmeta].getVes()) *
                        predmeties[indexTekushegoPredmeta].getCena();

                tekushiyVes = VmestimostRukzaka; // полный рюкзак
            }

            indexTekushegoPredmeta++;
        }
        System.out.println("Ценность набора: " + tekushayaCena);
    }
}

class Predmety {
    private int ves;
    private int cena;

    public Predmety(int ves, int cena) {
        this.ves = ves;
        this.cena = cena;
    }

    public double cennostNaEdinicuVesa(){
        return cena / (double)ves;
    }
    public int getVes() {
        return ves;
    }

    public int getCena() {
        return cena;
    }

    public String toString() {
        return "{ves:" + ves + " cena:" + cena + "}";
    }
}
