import java.util.Scanner;

public class LanguageMenu extends MainMenu{
    public static void languageMenuMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Uzb ");
        ///System.out.println("2. Rus ");
        ///System.out.println("3. Eng ");
        int n = scanner.nextInt();

        switch(n){
            case 1:
                MainMenu.mainMenuMethod();
                break;
            default:
                System.out.println("Siz xato buyruq kiritdingiz !!!");
                LanguageMenu.languageMenuMethod();
                break;
        }


    }
}
