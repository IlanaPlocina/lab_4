import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("231RDB042 Ilana Plociņa 11.grupa");

        Scanner sc = new Scanner(System.in);
        System.out.println("input file name:");
        String fileName = sc.nextLine();
        sc.close();

        try (FileReader fr = new FileReader(fileName);
             Scanner failam = new Scanner(fr)) {

            System.out.println("result:");

            while (failam.hasNext()) {
                String vards = failam.next();
                int summa = 0;
                int skaits = 0;
                int vertejums;
                int sliktie_vertējumi = 0;

                while (failam.hasNextInt()) {
                    vertejums = failam.nextInt();
                    summa += vertejums;
                    skaits++;
                    if (vertejums < 4) {
                        sliktie_vertējumi++;
                    }
                }

                if (skaits > 0) {
                    double vid = (double) summa / skaits;
                    if (vid <= 5) {
                        System.out.print(vards + " " + sliktie_vertējumi);
                        System.out.println();
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Kļūda: " + e.getMessage());
        }
    }
}