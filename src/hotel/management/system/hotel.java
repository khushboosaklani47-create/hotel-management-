import java.util.Scanner;

class Hotel {

    String customerName;
    int roomNo;

    void addCustomer(String name, int room) {

        customerName = name;
        roomNo = room;

        System.out.println("Customer Added Successfully");
    }

    void showCustomer() {

        System.out.println("Customer Name : " + customerName);
        System.out.println("Room Number : " + roomNo);
    }

    void checkout() {

        System.out.println(customerName + " Checked Out");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel h = new Hotel();

        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();

        System.out.println("Enter Room Number:");
        int room = sc.nextInt();

        h.addCustomer(name, room);

        System.out.println();

        h.showCustomer();

        System.out.println();

        h.checkout();
    }
}
