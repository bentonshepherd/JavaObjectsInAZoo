public class zoo {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee ("Stinger");
        stinger.eat("pollen");
        stinger.sleep();
    }

//    String favoriteFood = "bacon";
//
//    public void eat(String name, String food) {
//        System.out.println(name + " eats " + food);
//        if (food == favoriteFood) {
//            System.out.println("YUM!!! " + name + " wants more " + food);
//        } else {
//            sleep(name);
//        }
//    }
//
//    public void sleep(String name) {
//        System.out.println(name + " sleeps for 8 hours");
//    }
}
