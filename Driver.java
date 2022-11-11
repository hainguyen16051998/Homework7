package Entity;

import Constant.DriverType;


import java.util.Scanner;

public class Driver extends Person {
    private static int AUTO_ID = 10000;
    private int id;
    private String level;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", level='" + level + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    public void nhapThongTin() {
        this.id = AUTO_ID;
        AUTO_ID++;
        super.inputInfo();
        System.out.println("Nhập trình độ Lái xe");
        System.out.println("1.A");
        System.out.println("2.B");
        System.out.println("3.C");
        System.out.println("4.D");
        System.out.println("5.E");
        System.out.println("6.F");
        System.out.println("Mời chọn");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 6) {
                break;
            }
            System.out.print("nhập lại");
        } while (true);
        switch (choice) {
            case 1:
                this.level = DriverType.A.value;
                break;
            case 2:
                this.level = DriverType.B.value;
                break;
            case 3:
                this.level = DriverType.C.value;
                break;
            case 4:
                this.level = DriverType.D.value;
                break;
            case 5:
                this.level = DriverType.E.value;
                break;
            case 6:
                this.level = DriverType.F.value;
                break;
        }

    }
}
