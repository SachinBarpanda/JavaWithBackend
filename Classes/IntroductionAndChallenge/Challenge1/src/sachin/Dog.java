package sachin;

public class Dog extends Animal {
    private int eye;
    private int legs ;
    private int tails;
    private int teeth;
    private String coat;



    public Dog(int eye, int legs, int tails, int teeth, String coat){
       super("Monty", 5,10,"big", 20);
       this.eye = eye;
       this.legs = legs;
       this.tails = tails;
       this.teeth = teeth;
       this.coat = coat;
    }

    public void walk(){
        System.out.println("But when the walk() class is called with super.move() then ");
        super.move();
    }
    public void run(){
        System.out.println("When only the run method is called ");
        move();
    }

    public void puttingtheLegsTogether(){
        System.out.println("puttingtheLegsTogether is called inside the dog class");
    }

    @Override
    public void move(){
        System.out.println("Then the overidden method will be searched and called and thus");
        puttingtheLegsTogether();

    }
    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(int tails) {
        this.tails = tails;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }
}
