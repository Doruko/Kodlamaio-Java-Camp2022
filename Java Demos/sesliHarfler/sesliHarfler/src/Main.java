public class Main {
    public static void main(String[] args) {
        char harf = 'a';
        switch (harf) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın Sesli Harf");
                break;
            default:
                System.out.println("İnce Sesli Harf");
        }


    }
}