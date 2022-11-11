import Constant.DriverType;

import Entity.Driver;
import Entity.Buse;

import java.util.Scanner;

public class MainRun {

    public static Driver[] drivers = new Driver[10000];
    public static Buse[] buses = new Buse[100];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            showMenu();
            int functionChoice = functionChoice();
            switch (functionChoice) {
                case 1:
                    addNewDriver();
                    break;
                case 2:
                    showDriverInfo();
                    break;
                case 3:
                    addNewBuse();
                    break;
                case 4:
                    showBuseInfo();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    return;
            }
        }
    }


    private static void showMenu () {
        System.out.println("-------PHẦN MỀM QUẢN LÝ TRẢ LƯƠNG TÀI XẾ-------");
        System.out.println("1. Nhập danh sach tài xế mới");
        System.out.println("2. In ra danh sách tài xế mới");
        System.out.println("3. Nhập danh sách tuyến mới mới");
        System.out.println("4. In ra danh sách tuyến mới mới");
        System.out.println("5. Lập lịch phân công lái xe");
        System.out.println("6. Sắp xếp lịch phân công lái xe");
        System.out.println("7. Thoát.");
        System.out.println("Mời chọn: ");
    }

    private static int functionChoice () {
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 7) {
                break;
            }
            System.out.print("nhập lại");
        } while (true);
        return choice;
    }


    private static void showDriverInfo() {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] != null) {
                System.out.println(drivers[i]);
            }
        }
    }

    private static void addNewDriver() {
        System.out.println("Nhập số lượng lái xe mới muốn thêm");
        int driverNum = new Scanner(System.in).nextInt();
        Driver driver = new Driver();
        driver.inputInfo();
        saveDriver(driver);
    }

    private static void saveDriver(Driver subject) {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] == null) {
                drivers[i] = subject;
                break;
            }
        }
    }


    private static void showBuseInfo() {
        for (int i = 0; i < buses.length; i++) {
            if (buses[i] != null) {
                System.out.println(buses[i]);
            }
        }
    }

    private static void addNewBuse() {
        System.out.println("Nhập số lượng tuyến mới muốn thêm");
        int buseNum = new Scanner(System.in).nextInt();
        Buse buse = new Buse();
        buse.inputInfo();
        saveBuse(buse);
    }

    private static void saveBuse(Buse buse) {
        for (int i = 0; i < buses.length; i++) {
            if (buses[i] == null) {
                buses[i] = buse;
                break;
            }
        }
    }
}



