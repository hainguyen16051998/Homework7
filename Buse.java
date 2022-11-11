package Entity;


import java.util.Scanner;

public class Buse implements Inputable {
    private static int AUTO_ID = 100;
    private int id;
    private int code;
    private int distance;
    private int stopNum;

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getStopNum() {
        return stopNum;
    }

    public void setStopNum(int stopNum) {
        this.stopNum = stopNum;
    }

    @Override
    public String toString() {
        return "Buse{" +
                "id=" + id +
                ", code=" + code +
                ", distance=" + distance +
                ", stopNum=" + stopNum +
                '}';
    }

    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập mã tuyến: ");
        this.setCode(new Scanner(System.in).nextInt());
        distancelogic();
        stopNumlogic();
    }


    public void distancelogic() {
        System.out.print("Nhập khoảng cách: ");
        int a = 0;
        do {
            a = new Scanner(System.in).nextInt();
            if (a > 0) {
                break;
            }
            System.out.print("Khoảng cách phải lớn hơn 0, mời nhập lại: ");
        } while (true);
        this.distance = a;
    }

    private void stopNumlogic() {
        System.out.print("Nhập số điểm dừng: ");
        int b = 0;
        do {
            b = new Scanner(System.in).nextInt();
            if (b > 0) {
                break;
            }
            System.out.print("Số điểm dừng phải lớn hơn 0, mời nhập lại: ");
        } while (true);
        this.stopNum = b;
    }
}
