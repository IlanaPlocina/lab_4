import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println("231RDB042 Ilana Plociņa 11.grupa");

        // System.out.println(System.getProperty("user.home"));

        Scanner sc = new Scanner(System.in);
        System.out.println("input file name:");
        String fileName = sc.nextLine();

        try (FileReader fr = new FileReader(fileName); 
        Scanner failam = new Scanner(fr)) {

            System.out.println("result:");

            while (failam.hasNext()) {
                String vardi = "";
                int index = 0;
                String text = failam.nextLine();

                for (int i = 0; i < text.length(); i++) {
                    char v = text.charAt(i);

                    if (Character.isDigit(v)) {
                        index = i;
                        break;
                    }
                    vardi += v;
                }

                int summa = 0;
                int daudzums = 0;
                int sliktie_vertējumi = 0;

                for (int i = index; i < text.length(); i++) {
                    char v = text.charAt(i);

                    if (Character.isDigit(v)) {
                        int atzime = Character.getNumericValue(v);
                        summa += atzime;
                        daudzums++;
                        if (atzime <4){
                            sliktie_vertējumi++;
                        }
                    }
                }

                if (daudzums > 0) {
                    double vid = (double) summa / daudzums;
                    if (vid <= 5) {
                        System.out.print(vardi+sliktie_vertējumi);        
                        System.out.println();                
                        }
                    }
                }
            }catch (IOException e) {
                System.out.println("Kļūda");
        }
        }
    }

