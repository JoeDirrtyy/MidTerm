import java.util.ArrayList;

public class Customer extends  User {

    private int rewardPoints;
    private double accountBalance;
    ArrayList<String> addresses;
    Size size;
    Product[] products;

    public Customer(String userName, String password, int rewardPoints, double accountBalance, Size size, Product[] products) {
        super(userName, password);
        this.rewardPoints = rewardPoints;
        this.accountBalance = accountBalance;
        this.addresses = addresses;
        this.size = size;
        this.products = products;
    }


    public Customer(String userName, String password) {
        super(userName, password);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        if(accountBalance < 0.00){
            System.out.println("Negative Balance");
        }else{
            this.accountBalance = accountBalance;
        }
    }

    public void useRewardPoints(int rewardPoints){
        int points = 1000;
        points = points - 10;
        System.out.println(points);


    }


    public int getRewardPoints() {
        System.out.println("You have this many reward points");
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        if(rewardPoints < 0.00){
            System.out.println("Negative Balance");
        }else{
            this.rewardPoints = rewardPoints;
        }
    }

    @Override
    public void print() {

    }
}
