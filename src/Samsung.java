import java.util.Scanner;

public class Samsung extends AddOrder{

    public static void samsungMethod(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Samsung Galaxy Book Pro 15(i7-1165G7) 16/512GB  - - - - - - -> 15 000 000 so'm ");
        System.out.println("2.Samsung Galaxy Book Pro 15(i5-1135G7) 8/512GB - - - - - - - -> 12 300 000 so'm ");
        System.out.println("3.Samsung Galaxy Book Flex2 13.3(i7-1165G7) 16/512GB- - - - - -> 20 000 000 so'm ");
        System.out.println("4.Samsung Galaxy Book Pro360 13(i7-1165G7) 16/512GB - - - - - -> 18 990 000 so'm ");
        System.out.println("5.Samsung Galaxy Book Flex2 13.3(i7-1165G7) 16/512GB- - - - - -> 21 000 000 so'm \n");

        System.out.println("0.Orqaga ");

        int  n = scanner.nextInt();
        switch(n){
            case 0:
                Katalog.katalogMenuMethod(id);
                break;
            case 1:
                addOrderListMethod(" Samsung Galaxy Book Pro 15(i7-1165G7) 16/512GB  - - - - - - -> ",15000000,id);
                samsungMethod(id);
                break;
            case 2:
                addOrderListMethod(" Samsung Galaxy Book Pro 15(i5-1135G7) 8/512GB - - - - - - - -> ",12300000,id);
                samsungMethod(id);
                break;
            case 3:
                addOrderListMethod(" Samsung Galaxy Book Flex2 13.3(i7-1165G7) 16/512GB- - - - - -> ",20000000,id);
                samsungMethod(id);
                break;
            case 4:
                addOrderListMethod(" Samsung Galaxy Book Pro360 13(i7-1165G7) 16/512GB - - - - - -> ",18990000 ,id);
                samsungMethod(id);
                break;
            case 5:
                addOrderListMethod(" Samsung Galaxy Book Flex2 13.3(i7-1165G7) 16/512GB- - - - - -> ",21000000, id);
                samsungMethod(id);
                break;

            default:
                System.out.println("Siz xato buyruq kiritdingiz !!! ");
                samsungMethod(id);
                break;
        }

    }
}
