import java.util.Scanner;

public class WczytanieDanych {
    public static void main(String[] args) {
        // wczytajmy uczelnie i napiszmy "Studiuję na uczelni ..."
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwe uczelni");
        String uczelnia = scanner.nextLine();
        System.out.println("Studiuje na " + uczelnia);
        int wiek = scanner.nextInt();
        char znak = scanner.next().charAt(0);
    }
}
