public class WyrazenieWarunkowe {
    public static void main(String[] args) {
        // Sprawdźmy czy liczba jest parzysta
//        int liczba = 20;
//        if (liczba % 2 == 0)
//            System.out.println("Parzysta");
//        else
//            System.out.print("Nie");
//            System.out.println("parzysta");
//
//
        int wiek = 10;
        if (wiek > 0) {
            if (wiek >= 18) {
                System.out.println("Pelnoletni");
            } else {
                System.out.println("Niepelnoletni");
            }
        } else {
            System.out.println("Blad");
        }
    }
}
