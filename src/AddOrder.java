import java.util.Scanner;

public class AddOrder {
public static void addOrderListMethod(String Name , long Summa, int id ){
    Scanner scanner = new Scanner(System.in);
    Database database = new Database();
    int count = database.getOrderCounts();

    System.out.println("1.Buyurtma berish \uD83D\uDCE6");
    System.out.println("0.Orqaga");
    int n = scanner.nextInt();

    switch(n){
        case 0:
            Katalog.katalogMenuMethod(id);
            break;
        case 1:
            database.setUserOrderList(String.valueOf(count),count,0);
            database.setUserOrderList(String.valueOf(id),count,1);
            database.setUserOrderList(Name,count,2);
            database.setUserOrderList(String.valueOf(Summa),count,3);
            count++;
            database.setUserOrderList(count);
            System.out.println(" Buyurtmangiz qabul qilindi ✅");
            System.out.println(" Yetkazib berish xizmati bepul 1-3 kungacha buyurtmangiz yetkazib beriladi \uD83E\uDD1D \n ");

            Katalog.katalogMenuMethod(id);
            break;
        default:
            System.out.println("Siz xato buyruqni amalga oshirdingiz !!!");
            Katalog.katalogMenuMethod(id);
    }
    }
}
