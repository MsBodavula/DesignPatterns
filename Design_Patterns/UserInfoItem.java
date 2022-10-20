import java.util.*; 

public class UserInfoItem {

    Map<String,String> userProducts = new HashMap<>();

    UserInfoItem(){
        userProducts.put("Beef","tutu");
        userProducts.put("Tomato","tutu");
        userProducts.put("Beef","mimi");
        userProducts.put("Onion","mimi");
        userProducts.put("Beef","pepe");
        userProducts.put("Tomato","pepe");
        userProducts.put("Onion","pepe");
    }
    public void createUSer() {
		System.out.println(" User Created ....");
	}

    public void getUserProducts(String username, int userType){
        if((username.equalsIgnoreCase("tutu") && (userType == 0)){
            System.out.println("Buyer Tutu has the following products "+);
            for (String key : getKeys(userProducts, "tutu")) {
                System.out.println(key);
            }
        }
        if((username.equalsIgnoreCase("mimi") && (userType == 0)){
            System.out.println("Buyer Mimi has the following products "+);
            for (String key : getKeys(userProducts, "mimi")) {
                System.out.println(key);
            }
        }
        if((username.equalsIgnoreCase("pepe") && (userType == 1)){
            System.out.println("Seller Pepe has the following products "+);
            for (String key : getKeys(userProducts, "pepe")) {
                System.out.println(key);
            }
        }
    }

}
