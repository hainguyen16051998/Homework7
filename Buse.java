package Entity;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Buse implements Inputable {
    private static int AUTO_ID = 100;
    private int id;
    private String distance;
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

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
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
                ", distance='" + distance + '\'' +
                ", stopNum=" + stopNum +
                '}';
    }

    @Override
    public void inputInfo() {
        this.id = AUTO_ID;
        AUTO_ID++;
        System.out.print("Nhập mã tuyến");
        this.id = new Scanner(System.in).nextInt();
        System.out.print("Nhập khoảng cách");
        this.distance = new Scanner(System.in).nextLine();
        System.out.print("Nhập số điểm dừng");
        this.stopNum = new Scanner(System.in).nextInt();

    }


}
