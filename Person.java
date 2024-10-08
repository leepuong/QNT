public class Person {
    String hoten;
    int age;
    String gender;
    String role;

    public Person() {
    }

    public Person(String hoten, int age, String gender, String role) {
        this.hoten = hoten;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
