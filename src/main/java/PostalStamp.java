public class PostalStamp extends Product implements LickAble, IPrint{

    private int ammount;

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    @Override
    public boolean safeToLick() {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public String toString() {
        return "PostalStamp{" +
                "ammount=" + ammount +
                '}';
    }
}
