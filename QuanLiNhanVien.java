import java.util.ArrayList;
import java.util.Scanner;

public class QuanLiNhanVien {
    ArrayList<Person> listPersons = new ArrayList<Person>();

    Scanner cs = new Scanner(System.in);

    public void themNhanVien() {
        System.out.print("nhap ten: ");
        String nameOfPerson = cs.nextLine();
        System.out.print("Nhap tuoi: ");
        int ageOfPerson = cs.nextInt();
        cs.nextLine();
        System.out.print("nam hay nu: ");
        int gender = cs.nextInt();
        String genderOfPerson = "";
        if (gender == 1) {
            genderOfPerson = "nam";
        } else if (gender == 2) {
            genderOfPerson = "nu";
        }
        cs.nextLine();

        System.out.println(
                "vai tro là gi \n1: cong nha\n2:nhan vien\n3: ky su\n--------------------------------------------------------");
        int vai = cs.nextInt();
        cs.nextLine();

        String role = "";
        if (vai == 1) {
            role = "cong nhan";
        } else if (vai == 2) {
            role = "nhan vien";
        } else if (vai == 3) {
            role = "ky su";
        } else {
            System.out.println("somthing is wrong!");
        }

        Person conNguoi = new Person(nameOfPerson, ageOfPerson, genderOfPerson, role);
        listPersons.add(conNguoi);
        System.out.println("--------------------------------------------------------");

    }

    public void listNhanVien() {
        System.out.println("--------------------------------------------------------");

        System.out.println("         list of person            \n");

        for (Person connguowif : listPersons) {

            System.out.printf("ten: %s     tuoi: %d     gioi tinh: %s      vai tro: %s     \n",
                    (connguowif.getHoten()), (connguowif.getAge()), (connguowif.getGender()), (connguowif.getRole()));

        }
        System.out.println("--------------------------------------------------------");

    }

    public void timKiem() {
        System.out.println("--------------------------------------------------------");
        System.out.println("tim kiem ai");
        String tenAi = cs.nextLine();
        for (Person congnuoif : listPersons) {
            if (tenAi.equals(congnuoif.getHoten())) {
                System.out.printf("ten: %s     tuoi: %d     gioi tinh: %s      vai tro: %s     \n",
                        (congnuoif.getHoten()), (congnuoif.getAge()), (congnuoif.getGender()), (congnuoif.getRole()));

            }

        }

        System.out.println("--------------------------------------------------------");

    }

}
