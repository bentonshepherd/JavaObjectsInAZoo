public class Bear extends Animal {
    public Bear(String name) {
        super(name,"fish");
    }

    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food == favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        } else {
            sleep();
        }
    }

    public static void main(String[] args) {
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
    }
}
