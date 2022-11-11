package Entity;

import java.util.Scanner;

public class Person implements Inputable {

    protected String name;
    protected String address;
    protected int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public void inputInfo() {
        System.out.print("Nhập tên lái xe: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ lái xe: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại lái xe: ");
        this.setPhone(new Scanner(System.in).nextInt());
    }

}