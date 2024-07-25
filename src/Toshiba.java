import java.util.Scanner;

public class Toshiba extends AddOrder {
    public static void toshibaMethod(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Toshiba Tecra Z50-C 15.6 FHD i5-6200U 8GB 256SSD - - - - - - - -> 3 545 000 so'm ");
        System.out.println("2.Toshiba Tecra Z50-C 15.6 FHD i5-6200U 8GB 512SSD - - - - - - - -> 3 746 000 so'm ");
        System.out.println("3.Toshiba Tecra Z50-C 15.6 FHD i5-6200U 16GB 256SSD- - - - - - - -> 3 807 000 so'm ");
        System.out.println("4.Toshiba Tecra Z50-C 15.6 FHD i5-6200U 16GB 512SSD- - - - - - - -> 3 996 000 so'm ");
        System.out.println("5.Toshiba Tecra Z50-C 15.6 FHD i5-6200U 8GB 1SSD - - - - - - - - -> 4 063 000 so'm \n");

        System.out.println("0.Orqaga ");

        int  n = scanner.nextInt();
        switch(n){
            case 0:
                Katalog.katalogMenuMethod(id);
                break;
            case 1:
                addOrderListMethod(" Toshiba Tecra Z50-C 15.6 FHD i5-6200U 8GB 256SSD - - - - - - - -> ",3545000,id);
                toshibaMethod(id);
                break;
            case 2:
                addOrderListMethod(" Toshiba Tecra Z50-C 15.6 FHD i5-6200U 8GB 512SSD - - - - - - - -> ",3746000,id);
                toshibaMethod(id);
                break;
            case 3:
                addOrderListMethod(" Toshiba Tecra Z50-C 15.6 FHD i5-6200U 16GB 256SSD- - - - - - - -> ",3807000,id);
                toshibaMethod(id);
                break;
            case 4:
                addOrderListMethod(" Toshiba Tecra Z50-C 15.6 FHD i5-6200U 16GB 512SSD- - - - - - - -> ",3996000 ,id);
                toshibaMethod(id);
                break;
            case 5:
                addOrderListMethod(" Toshiba Tecra Z50-C 15.6 FHD i5-6200U 8GB 1SSD - - - - - - - - -> ",4063000, id);
                toshibaMethod(id);
                break;

            default:
                System.out.println("Siz xato buyruq kiritdingiz !!! ");
                toshibaMethod(id);
                break;
        }
    }
}
