public class Admin extends User{
    public Admin(String userName, String password) {
        super(userName, password);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void print() {

    }
}
