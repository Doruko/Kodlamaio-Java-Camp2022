public class Main {
    public static void main(String[] args) {
//ctrl+shift+alt+L komutları düzgün bir sıraya sokar
        char grade = 'X';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;

            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;

            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;

            default:
                System.out.println("Geçersiz not girdiniz");

        }


    }
}