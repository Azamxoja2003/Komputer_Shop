import java.util.Scanner;

public class Apple extends AddOrder {
    public static void appleMethod(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Apple MacBook Pro 16-inch M3 Max 36/1TB - - - - - -> 50 075 000 so'm ");
        System.out.println("2.Apple MacBook Pro 16-inch M3 Pro 18/512GB - - - - -> 34 265 500 so'm ");
        System.out.println("3.Apple MacBook Pro 14-inch M3 Max 48/1TB - - - - - -> 61 934 451 so'm ");
        System.out.println("4.Apple MacBook Pro 14-inch M3 Pro 18/512GB - - - - -> 28 991 000 so'm ");
        System.out.println("5.Apple MacBook Pro 14-inch M3  8/512GB - - - - - - -> 21 084 000 so'm ");
        System.out.println("6.Apple Macbook Air 15-inch M2  8/256GB - - - - - - -> 15 813 000 so'm ");
        System.out.println("0.Orqaga ");

        int  n = scanner.nextInt();
                switch(n){
                    case 0:
                        Katalog.katalogMenuMethod(id);
                        break;
                    case 1:
                        addOrderListMethod(" Apple MacBook Pro 16-inch M3 Max 36/1TB - - - - - -> ",50075000,id);
                        appleMethod(id);
                        break;
                    case 2:
                        addOrderListMethod(" Apple MacBook Pro 16-inch M3 Pro 18/512GB - - - - -> ",34265500,id);
                        appleMethod(id);
                        break;
                    case 3:
                        addOrderListMethod(" Apple MacBook Pro 14-inch M3 Max 48/1TB - - - - - -> ",61934451,id);
                        appleMethod(id);
                        break;
                    case 4:
                        addOrderListMethod(" Apple MacBook Pro 14-inch M3 Pro 18/512GB - - - - -> ",28991000 ,id);
                        appleMethod(id);
                        break;
                    case 5:
                        addOrderListMethod(" Apple MacBook Pro 14-inch M3  8/512GB - - - - - - -> ",21084000, id);
                        appleMethod(id);
                        break;
                    case 6:
                        addOrderListMethod(" Apple Macbook Air 15-inch M2  8/256GB - - - - - - -> ",15813000,id);
                        appleMethod(id);
                        break;
                    default:
                        System.out.println("Siz xato buyruq kiritdingiz !!! ");
                        Apple.appleMethod(id);
                        break;
                }

    }
}
