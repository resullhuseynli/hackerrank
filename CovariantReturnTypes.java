import java.io.*;
import java.util.*;

public class CovariantReturnTypes {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim();
        Region region = switch (name) {
            case "WestBengal" -> new WestBengal();
            case "AndhraPradesh" -> new AndhraPradesh();
            default -> null;
        };
        assert region != null;
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());

        sc.close();
    }
}

class Flower {

    String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{

    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    String whatsYourName(){
        return "Lily";
    }
}

class Region {
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class WestBengal extends Region{
    public Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    public Lily yourNationalFlower(){
        return new Lily();
    }
}
