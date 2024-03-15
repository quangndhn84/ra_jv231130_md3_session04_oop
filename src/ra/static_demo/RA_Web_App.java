package ra.static_demo;

public class RA_Web_App {
    private static int countVisited = 0;

    public int getCountVisited() {
        return countVisited;
    }

    public void setCountVisited(int countVisited) {
        this.countVisited = countVisited;
    }

    public static void userVisited() {
        countVisited++;
        System.out.println("Số lượt truy cập hiện tại là: " + countVisited);
    }
}
