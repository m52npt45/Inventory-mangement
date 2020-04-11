public class worker {
    double id;
    String name;
    String phone;
    String password;
    // constroctor
    public worker (double id,String name,String phone,String password){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }
    public void display(){
        System.out.println("ID :"+id+"\nName: "+name+"\nPassword : "+password+"\nContact : "+phone+"");
    }
}
