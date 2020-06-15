package org.evidenceptacku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    private static SortedMap<Integer, Ptacek> evidencePtacku = new TreeMap<>();

    private static int posledniCisloPtacka = 0;

    public static void main(String[] args) throws IOException {

        while (true) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("1. Vlozeni ptacka");
            System.out.println("2. Uprava ptacka");
            System.out.println("3. Smazani ptacka");
            System.out.println("0. Exit  ");

            System.out.println("*****************************************************************************");

            System.out.print("Napis cislo akce, kterou chces provest: ");
            String cislo = reader.readLine();


            switch (Integer.parseInt(cislo)) {

                case 1:
                    VlozeniPtacka();

                case 2:
                    UpravaPtacka();

                case 3:
                    SmazaniPtacka();


                case 0:
                    System.exit(0);
                    break;

            }
        }
    }


    private static void VlozeniPtacka() {
        Ptacek ptacek = new Ptacek();
        ptacek.setJmeno("");
        ptacek.setDruh("");
        evidencePtacku.put(posledniCisloPtacka,ptacek);
        posledniCisloPtacka++;

    }

    private static void UpravaPtacka() {
        evidencePtacku.get(0).setJmeno("Geralt");
    }

    private static void SmazaniPtacka() {
        evidencePtacku.remove(evidencePtacku.get(0));
    }


}


