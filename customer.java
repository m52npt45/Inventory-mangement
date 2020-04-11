public class customer {
    double id;
    String name;
    String phone;
    String password;

    //constractor
    public customer(double id, String name,String phone,String password) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public void display() {
        System.out.println("ID=" + id + "\nName = " + name + "\nNumber = "+phone+"\nPassword = "+password +"");
    }
}
