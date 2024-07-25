import java.util.Scanner;


public class OrderHistory {
    public static void orderHistoryMethod(int id){
        Database database = new Database();

        long Summa = 0;
        System.out.println("\t\t\t\t\t\t Buyurtmalar Tarixi  \uD83D\uDCCB");
        for (int i = 0; i < 10000; i++){
            if(database.getUserOrderList(i,2) == null){
                break;
            }
            if(i < 9){
                if (database.getUserOrderList(i,1).equals(String.valueOf(id))){
                    System.out.println(" 0 " + (i + 1) + " --> " + database.getUserOrderList(i,2) + database.getUserOrderList(i , 3) + " so`m ");
                    Summa += Long.parseLong(database.getUserOrderList(i,3));
                }
                else{
                    if(database.getUserOrderList(i,1).equals(String.valueOf(id))){
                        System.out.println(" " + (i + 1) + " --> " + database.getUserOrderList(i ,2) + database.getUserOrderList(i , 3) + " so`m ");
                        Summa += Long.parseLong(database.getUserOrderList(i,3));
                    }
                }
            }
        }

        System.out.println(" Jami summa --> " + Summa + " so`m \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 0. Oqraga ");
        int n = scanner.nextInt();
        switch (n){
            case 0:
                Katalog.katalogMenuMethod(id);
                break;
            default:
                System.out.println(" Siz xato buyruq kiritdingiz !!! ");
                OrderHistory.orderHistoryMethod(id);
                break;
        }

    }

}
