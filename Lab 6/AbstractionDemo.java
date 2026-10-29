abstract class CAR {
    abstract void drive();
    abstract void playMusic();
}

class virtus extends CAR {
    void drive() {
        System.out.println("virtus: Driving smoothly on the highway.");
    }

    void playMusic() {
        System.out.println("virtus: Playing soft jazz through the standard speakers.");
    }
}


class Xuv700 extends CAR {
    void drive() {
        System.out.println("Xuv700: Driving confidently on rough terrain.");
    }
    void playMusic() {
        System.out.println("Xuv700: Playing rock music through the surround sound system.");
    }
}


class bmw340i extends CAR {
    
    void drive() {
        System.out.println("bmw340i: Accelerating at high speed on the race track.");
    }

   
    void playMusic() {
        System.out.println("bmw340i: Playing loud electronic music with heavy bass.");
    }
}


class Tesla extends CAR {
    
    void drive() {
        System.out.println("Tesla: can fly.");
    }

   
    void playMusic() {
        System.out.println("Tesla: Streaming music from the touchscreen infotainment system.");
    }
}


public class AbstractionDemo {
    public static void main(String[] args) {
       
        CAR virtus = new virtus();
        CAR Xuv700 = new Xuv700();
        CAR bmw340i = new bmw340i();
        CAR Tesla = new Tesla();

        
        virtus.drive();
        virtus.playMusic();
        System.out.println();

        Xuv700.drive();
        Xuv700.playMusic();
        System.out.println();

        bmw340i.drive();
        bmw340i.playMusic();
        System.out.println();

        Tesla.drive();
        Tesla.playMusic();
    }
}
