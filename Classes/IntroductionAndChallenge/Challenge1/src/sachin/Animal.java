package sachin;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private String size;
    private int weight;

    public Animal(String name, int brain, int body) {
        this.name = name;
        this.brain = brain;
        this.body = body;
    }

    public Animal(String size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    //eat() and move() function for the animals
    public void eat(){
        System.out.println("eat() function is called");
    }
    public void move(){
        System.out.println("move() function from inside the animal class is called");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animal(String name, int brain, int body, String size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
}
