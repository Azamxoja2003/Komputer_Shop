import java.util.Scanner;

public class EnterMenu extends Database{
    public static void enterMenuMethod() {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ismingizni kiriting - - - - - - - - - - > ");
        String userName = scanner.nextLine();

        System.out.print("Telefon raqamingizni kiriting - - - - - > ");
        String userPhoneNumber = scanner.nextLine();

        for(int i = 0; i < getUserNameSize(); i++){
            if(userName.equals(getUserName(i))){
                if(userPhoneNumber.equals(getUserPhoneNumber(i))){
                    System.out.println(" Assalomu alekum \uD83D\uDE0E " + getUserName(i));
                    Katalog.katalogMenuMethod(i);
                }
            }
        }
        System.out.println(" Sizning Malumotlaringiz Topilmadi  \uD83E\uDDD0");
        MainMenu.mainMenuMethod();

    }
}