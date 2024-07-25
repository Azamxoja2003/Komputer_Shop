import java.util.ArrayList;

public class Database {
    private static final ArrayList<String> UserName = new ArrayList<>();
    private static final ArrayList<String> UserPhoneNumber = new ArrayList<>();
    private static final ArrayList<String> UserLocation = new ArrayList<>();
    private static final String[][] UserOrderList = new String[10000][4];

    private static int OrderCounts = 0;
    public static String getUserName(int id) {
        return UserName.get(id);
    }
    public static void setUserName(String userName, int id) {
        UserName.add(userName);
    }
    public static String getUserPhoneNumber(int id){
        return UserPhoneNumber.get(id);
    }
    public static void setUserPhoneNumber(String userPhoneNumber, int id){
        UserPhoneNumber.add(userPhoneNumber);
    }
    public static String getUserLocation(int id){
        return UserLocation.get(id);
    }
    public static void setUserLocation(String userLocation, int id){
        UserLocation.add(userLocation);
    }

    public String getUserOrderList(int row, int col){
        return UserOrderList[row][col];
    }
    public void setUserOrderList(String userOrderList,int row, int col){
        UserOrderList[row][col] = userOrderList;
    }
    public int getOrderCounts(){
        return OrderCounts;
    }
    public void setUserOrderList(int orderCounts){
        OrderCounts = orderCounts;
    }
    public static int getUserNameSize(){
        return UserName.size();
    }
    public static int getUserPhoneNumberSize(){
        return UserPhoneNumber.size();
    }

}

