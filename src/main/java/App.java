import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class App {

    public static void printAllPrintableObjects(IPrint[] prints){
    for(IPrint x : prints ){
        System.out.println(x);
    }
    }

    public static void consumeConsumables(Consumable[] consumables){

    }

    public static void getTotalPriceOfCustomerProducts(Customer[] customer){
        double sum = 0;
        for(int i = 0; i < customer.length; i++){
            sum += customer[i].getPrice();
        }
    }

    public static String getSecondaryAddressOfCustomer(Customer[] address){
        return String.valueOf(address[1]);
    }

    public static void reverseSortAndPrintAllProductsByPrice(ArrayList<Product> products){
      //  Collections.sort;
    }

    public static ArrayList<Double> getListOfProductPricesGreaterThanThePriceOfProductGiven(ArrayList<Product> Product){

        return null;
    }
    public static void addASingleProductToDirectoryTiedToCustomerByNameThenPrint(Map<String,Product> Customer,Product product){

    }
}
