/**
 * Created by alhanger on 10/26/15.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        //Create alligator from separate class
        Alligator a1 = new Alligator();
        System.out.println(a1);

        // ^
        // These do the same thing but the one below allows you to do it all in one place without having to create a separate class
        // v

        //Create alligator from anonymous class
        Reptile a2 = new Reptile(){
            @Override
            public String toString() {
                return "Alligator";
            }
        };
        System.out.println(a2);
    }
}

class Alligator extends Reptile {
    @Override
    public String toString() {
        return "Alligator";
    }
}