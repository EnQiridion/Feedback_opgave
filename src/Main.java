import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);

        //Definerer variabler herunder

        String tid;
        String trafik;
        String type;
        Boolean tilstand;
        String outPrint = "";
        String outPrint1 = "";

        //Herunder giver vi brugeren mulighed for at skrive ind i konsollen hvilken given situation man er i

        System.out.println("Hvad tid på dagen er det? (Dag, Aften, Nat)");
        tid = per.nextLine();

        System.out.println("Hvordan er trafikken? (Høj/Lav)");
        trafik = per.nextLine();

        System.out.println("Hvad er dine omgivelser? (Erhverv, Bolig, Blandet");
        type = per.nextLine();

        System.out.println("Er det en nødsituation? (True/False)");
        tilstand = per.nextBoolean();

        //Herunder laver vi algoritmen for at finde ud af hvad lyset skal lyse i en given situation

        if (tilstand || tid.equals("dag") && trafik.equals("lav") ){
            outPrint = ("lyset er grønt");
        }else if (tid.equals("Aften") || tid.equals("Nat") && trafik.equals("Lav")){
            System.out.println("Lyset er Gult");
        }else if (trafik.equals("Høj") && tid.equals("Nat") || type.equals("type") && trafik.equals("Høj")){
            System.out.println("Lyset er Rødt");
        }

        //Herunder laver vi algoritmen for om man må køre gennem de forskellige områder

        if (type.equals("Erhverv") || type.equals("Blandet")){
            System.out.println("Tilladelse til gennemkørsel");
        } else if (type.equals("Bolig") && tid.equals("Nat")) {
            System.out.println("Ingen gennemkørsel");
        }

        System.out.println(outPrint);
        System.out.println(outPrint1);
    }
}