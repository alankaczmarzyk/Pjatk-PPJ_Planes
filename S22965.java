
import java.io.*;
import java.util.Scanner;



public
    class S22965 {


    public static void main(String[] args) throws IOException {


        Pasazerski p1 = new Pasazerski(0.3, 10.3, 4, 850.3, "100", 2);
        Pasazerski p2 = new Pasazerski(2.3, 4.9, 4, 750, "50", 0);
        Pasazerski p3 = new Pasazerski(7.6, 5.5, 7, 700, "100", 2);
        Pasazerski p4 = new Pasazerski(5.3, 10.3, 12, 950, "70", 1);
        Pasazerski p5 = new Pasazerski(8.8, 5.8, 4, 750, "50", 0);
        Pasazerski p6 = new Pasazerski(9.3, 10.5, 8, 600.1, "60", 3);
        Pasazerski p7 = new Pasazerski(4.7, 3.7, 5, 700.2, "200", 2);
        Pasazerski p8 = new Pasazerski(10.6, 8.6, 3, 920.5, "70", 5);
        Pasazerski p9 = new Pasazerski(8.3, 11.7, 5, 1050, "100", 7);
        Pasazerski p10 = new Pasazerski(1.2, 10.3, 3, 975.2, "50", 1);


        Ladunkowy L1 = new Ladunkowy(1.2, 2.5, 4, 400, "dużo", "metal");
        Ladunkowy L2 = new Ladunkowy(4.6, 7.8, 13, 620.9, "dużo", "broń");
        Ladunkowy L3 = new Ladunkowy(3.9, 3.3, 2, 510, "mało", "żywność");
        Ladunkowy L4 = new Ladunkowy(1.0, 9.1, 5, 420.7, "dużo", "metal");
        Ladunkowy L5 = new Ladunkowy(5.1, 3.7, 6, 390, "bez", "barwniki");
        Ladunkowy L6 = new Ladunkowy(1.2, 10.5, 8, 565.2, "mało", "bagaże");
        Ladunkowy L7 = new Ladunkowy(6.7, 3.2, 6, 480.3, "bez", "metal");
        Ladunkowy L8 = new Ladunkowy(3.2, 2.9, 1, 600, "dużo", "żywność");
        Ladunkowy L9 = new Ladunkowy(3.4, 1.4, 7, 540, "mało", "lekarstwa");
        Ladunkowy L10 = new Ladunkowy(7.2, 4.5, 7, 430.1, "mało", "paliwo");


        silyWojskowe s1 = new silyWojskowe(2.5, 3.7, 5, 600.2, 500, false);
        silyWojskowe s2 = new silyWojskowe(1.2, 2.4, 2, 300.4, 700, true);
        silyWojskowe s3 = new silyWojskowe(2.3, 3.8, 5, 400, 800, false);
        silyWojskowe s4 = new silyWojskowe(9.7, 4.6, 1, 300.6, 500.7, false);
        silyWojskowe s5 = new silyWojskowe(6.5, 5.3, 5, 500, 900, true);
        silyWojskowe s6 = new silyWojskowe(8.5, 8.1, 6, 700.1, 500, true);
        silyWojskowe s7 = new silyWojskowe(1.8, 3.3, 9, 900.6, 500.3, true);
        silyWojskowe s8 = new silyWojskowe(4.0, 3.1, 2, 1300, 700, false);
        silyWojskowe s9 = new silyWojskowe(12.5, 4.8, 5, 800.2, 300, true);
        silyWojskowe s10 = new silyWojskowe(9.3, 9.7, 2, 700, 600, false);


        Sportowcy sp1 = new Sportowcy(2.3, 4.3, 5, 510, 600, "śmigłowy");
        Sportowcy sp2 = new Sportowcy(4.4, 9.9, 1, 400, 400.0, "odrzutowy");
        Sportowcy sp3 = new Sportowcy(7.1, 5.8, 4, 500.3, 200, "śmigłowy");
        Sportowcy sp4 = new Sportowcy(2.3, 4.3, 3, 200.1, 250.1, "śmigłowy");
        Sportowcy sp5 = new Sportowcy(6.5, 13.5, 5, 130, 310, "odrzutowy");
        Sportowcy sp6 = new Sportowcy(2.5, 10.3, 8, 220.7, 420, "śmigłowy");
        Sportowcy sp7 = new Sportowcy(2.2, 9.1, 9, 300.1, 380.2, "śmigłowy");
        Sportowcy sp8 = new Sportowcy(2.9, 1.3, 2, 280.7, 210, "odrzutowy");
        Sportowcy sp9 = new Sportowcy(3.0, 2.7, 1, 390.0, 220.4, "śmigłowy");
        Sportowcy sp10 = new Sportowcy(2.8, 7.5, 4, 435.2, 492.3, "odrzutowy");


        Modelarze m1 = new Modelarze(2.3, 9.2, 6, 70.3, 30, 800);
        Modelarze m2 = new Modelarze(6.0, 6.2, 1, 50, 20.3, 400);
        Modelarze m3 = new Modelarze(7.1, 7.2, 4, 10.7, 20.3, 1000);
        Modelarze m4 = new Modelarze(3.9, 1.2, 5, 30.1, 20.6, 820);
        Modelarze m5 = new Modelarze(9.0, 3.2, 8, 25, 40.3, 950);
        Modelarze m6 = new Modelarze(11.3, 1.2, 9, 32, 30.1, 510);
        Modelarze m7 = new Modelarze(2.6, 2.1, 10, 42, 30, 600);
        Modelarze m8 = new Modelarze(1.7, 3.0, 2, 27.8, 15.5, 720);
        Modelarze m9 = new Modelarze(4.3, 6.5, 5, 39.2, 22, 1100);
        Modelarze m10 = new Modelarze(5.2, 5.7, 1, 41.5, 27.3, 900);


        Statek[] objects = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10,
                sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9, sp10, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10};


        if (args.length > 0) {
            if (args[0].equals("save")) {

                File file = new File("resources/plik.txt");
                file.createNewFile();

                PrintWriter writer = new PrintWriter(file);

                for (int i = 0; i < objects.length; i++) {
                    writer.println(objects[i]);
                }
                writer.close();

            } else if (args[0].equals("load")) {

                String[] wyrazy = new String[50];
                Statek[] statki = new Statek[50 * Integer.valueOf(args[1])];

                try {
                    FileReader fr = new FileReader("resources/plik.txt");
                    int ret = fr.read();
                    Scanner sc = new Scanner(fr);
                    int g = 0;

                    while (ret != -1) {
                        wyrazy[g] = sc.nextLine();
                        g++;
                    }

                    fr.close();
                    sc.close();

                } catch (Exception e) {
                   System.out.println("");
                }


                int j = 0;
                for (int i = 0; i < statki.length; i++) {

                    if (j >= 50)
                        j = 0;
                    if (j < 10) {
                        String[] tab = wyrazy[j].split(",");
                        statki[i] = new Pasazerski(Math.random() * 10, Math.random() * 10, (int)(Math.random() * 10), Math.random() * 15, tab[4], Integer.valueOf(tab[5]));
                        j++;
                    } else if (j < 20) {
                        String[] tab = wyrazy[j].split(",");
                        statki[i] = new Ladunkowy(Math.random() * 40, Math.random() * 40, (int)Math.random() * 5, Math.random() * 15, tab[4], tab[5]);
                        j++;
                    } else if (j < 30) {
                        String[] tab = wyrazy[j].split(",");
                        if ((tab[5]).equals(true))
                            statki[i] = new silyWojskowe(Math.random() * 20, Math.random() * 40, (int)Math.random() * 30, Math.random() * 30, Math.random() * 30, true);
                         else
                            statki[i] = new silyWojskowe(Math.random() * 40, Math.random() * 10, (int) Math.random() * 20, Math.random() * 30, Math.random() * 30, false);
                            j++;
                    } else if (j < 40) {
                        String[] tab = wyrazy[j].split(",");
                        statki[i] = new Sportowcy(Math.random() * 20, Math.random() * 10, (int) Math.random() * 10, Math.random() * 30, Math.random() * 30, tab[5]);
                        j++;
                    } else if (j < 50){
                        statki[i] = new Modelarze(Math.random() * 40, Math.random() * 40, (int)Math.random() * 5, Math.random() * 15, Math.random() * 20,(int)(Math.random() * 5));
                        j++;
                    }
                }


                Statek[][] statki2 = new Statek[3][statki.length];
                int pierwszy = 0, drugi = 0, trzeci = 0;

                for (int i = 0; i < statki.length; i++) {
                    if (statki[i].odleglosc() < 3) {
                        statki2[0][pierwszy++] = statki[i];
                    } else if (statki[i].odleglosc() < 9) {
                        statki2[1][drugi++] = statki[i];
                    } else if (statki[i].odleglosc() < 27) {
                        statki2[2][trzeci++] = statki[i];
                    }
                }


                for (int i = 0; i < statki2.length; i++) {
                    Statek statek;
                    int miejsce;
                    for (j = 0; j < statki2[i].length; j++) {

                        if(statki2[i][j]!=null) {
                            statek = statki2[i][j];
                            miejsce = j;

                            while (miejsce > 0 && statki2[i][miejsce - 1].odleglosc() > statek.odleglosc() && statki2[i][miejsce - 1] != null && statek != null) {
                                statki2[i][miejsce] = statki2[i][miejsce - 1];
                                miejsce--;
                            }
                            statki2[i][miejsce] = statek;
                        }
                    }
                }


                for (int k = 0; k < statki2.length; k++) {
                    for (int l = 0; l < statki2[k].length; l++) {
                        if (statki2[k][l] != null)
                            System.out.print(statki2[k][l] + "  ");
                    }
                    System.out.println("");
                }

             }
            }else {
            System.out.println("Use 'save' as a program argument. Then write 'load <number>' to see how the program works.");
        }
        }



    }














