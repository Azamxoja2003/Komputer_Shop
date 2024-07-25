import java.util.Scanner;

public class RegistrationMenu {
    public static int counts = 0;
    public static void registrationMenuMethod() {
        checkUserName();

    }
    public static void checkUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ismingizni Kiriting - - - - - - - - - - -> ");
        String UserName = scanner.nextLine();
        for (int i = 0; i < UserName.length(); i++) {
            if (UserName.length() > 3 && Character.isAlphabetic(UserName.charAt(i))) {
            } else {
                System.out.println(" Ismingizni To`liq kiriting !!!");
                checkUserName();
            }
            if((Character.isUpperCase(UserName.charAt(0)))){
            }else{
                System.out.println("Ismingizni bosh harfini katta harfda kiriting !!!");
                checkUserName();

            }
        }
        Database database = new Database();

        database.setUserName(UserName, counts);
        checkUserPhoneNumber();
    }
        public static void checkUserPhoneNumber(){
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Telefon Raqamingizni kiriting(998) - - - > ");
            String UserPhoneNumber = scanner.nextLine();
            for (int i = 0; i < UserPhoneNumber.length(); i++) {
                if (!Character.isDigit(UserPhoneNumber.charAt(i))) {
                    System.out.println(" Siz raqam kiritmadingiz !!! ");
                    checkUserPhoneNumber();
                }
            }
            if (UserPhoneNumber.length() != 9) {
                System.out.println(" Telefon raqam uzunligi mos kelmadi 9 ta raqam bo'lishi kerak !!!");
                checkUserPhoneNumber();
            }

            Database database = new Database();

            database.setUserPhoneNumber(UserPhoneNumber, counts);
            checkUserLocation();
        }

        public static void checkUserLocation(){
        int suv = 0;
        Scanner scanner = new Scanner(System.in);
            System.out.print(" Manzilingizni kiriting - - - - - - - - - > ");
            String UserLocation = scanner.nextLine();
            for (int i = 0; i < UserLocation.length(); i++) {
                if(Character.isAlphabetic(UserLocation.charAt(i))){
                    suv++;
                }
            }
            if(suv <= 10){
                System.out.println(" Manzilingizni to'liq kiriting !!!");
                checkUserLocation();
            }
            else{
                System.out.println("\t\t\t\n \uD83D\uDCDDMa'lumotlaringiz Muvaffaqiyatli yozib olindi.");
                System.out.println(" ");
                MainMenu.mainMenuMethod();
            }



                Database database = new Database();

                database.setUserLocation(UserLocation, counts);


            }
        }




