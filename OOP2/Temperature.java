package OOP2;

public class Temperature {
    private int hot;
    private int cold;

    public Temperature(int hot, int cold) {
        this.hot = hot;
        this.cold = cold;
    }

    public void checkIcyHot() {
        if (hot > 100 && cold < 0) {
            System.out.println("icy hot");
        } else {
            System.out.println("ice cold.......");
        }
    }
}
