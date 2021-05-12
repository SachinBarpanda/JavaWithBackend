package justForfun;

public class VipPerson {
    private String name ;
    private String email;
    private int creadit_limit ;

    public VipPerson(){
        this("name", "email", 0);
        System.out.println("EMpty const called");
    }
    //will take 2 values and rest will be default
    public VipPerson(String name, String email){
        this(name, email, -1);
        System.out.println("Field with 2 para called ");
    }

    public VipPerson(String name, String email, int creadit_limit) {
        this.name = name;
        this.email = email;
        this.creadit_limit = creadit_limit;
        System.out.println("Feild with 3 para called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreadit_limit() {
        return creadit_limit;
    }

    public void setCreadit_limit(int creadit_limit) {
        this.creadit_limit = creadit_limit;
    }
}
