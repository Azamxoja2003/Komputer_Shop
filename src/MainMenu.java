import java.util.Scanner;

public class MainMenu extends RegistrationMenu {
    public static void mainMenuMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Ro'yxatdan o'tish");
        System.out.println("2. Kirish");
        System.out.println("0. Orqaga");
        int n = scanner.nextInt();

        switch (n){
            case 0 :
                LanguageMenu.languageMenuMethod();
                break;

            case 1:
                RegistrationMenu.registrationMenuMethod();
                break;

            case 2:
                EnterMenu.enterMenuMethod();
                break;


            default:
                System.out.println("Siz xato buyruq kiritdingiz !!!");
                MainMenu.mainMenuMethod();
        }
    }
}
