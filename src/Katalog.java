import java.util.Scanner;

public class Katalog {

    public static void katalogMenuMethod(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("    \uD83D\uDCBB    ");
        System.out.println(" 1. Apple ");
        System.out.println(" 2. Samsung ");
        System.out.println(" 3. Toshiba ");
        System.out.println(" 4. Asus ");
        System.out.println(" 5. Lenovo ");
        System.out.println(" 6. Hp ");
        System.out.println(" 7. Dell ");
        System.out.println(" 8. Buyurtmalar tarixi ");
        System.out.println(" 0. Bosh menuga qaytish");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                MainMenu.mainMenuMethod();
                break;
            case 1:
                Apple.appleMethod(id);
                break;
            case 2:
                Samsung.samsungMethod(id);
                break;
            case 3:
                Toshiba.toshibaMethod(id);
                break;
            case 4:
                Asus.asusMethod(id);
                break;
            case 5:
                Lenovo.lenovoMethod(id);
                break;
            case 6:
                Hp.hpMethod(id);
                break;
            case 7:
                Dell.dellMethod(id);
                break;
            case 8:
                OrderHistory.orderHistoryMethod(id);
                break;
            default:
                System.out.println("Siz xato buyruq kiritdingiz !!!");
                Katalog.katalogMenuMethod(id);
        }

    }
}
