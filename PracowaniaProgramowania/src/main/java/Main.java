
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        String numer_zadania;
        String zapytanie_sql;

        String yes_no="YES";
        Scanner scanner = new Scanner(System.in);

        Parsing Parse = new Parsing();
        Add Adding = new Add();

        while(!yes_no.equals("NO")) {
            System.out.println("Podaj numer zadania");
            numer_zadania = scanner.nextLine();
            System.out.println("Podaj zapytanie SQL");
            zapytanie_sql = scanner.nextLine();

            if(Parse.check_sql(zapytanie_sql)){
                Adding.Add(numer_zadania,zapytanie_sql);
            }

            System.out.println("Do you wish to continue? YES/NO ");
            yes_no=scanner.nextLine();

        }
        Adding.execute();
        Adding.close();
    }
}