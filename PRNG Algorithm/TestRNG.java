package ict.customrng;

public class TestRNG {
    public static void main(String[] args) {

        System.out.println(MyRandom.randomInt());
        System.out.println(MyRandom.randomInt(100));
        System.out.println(MyRandom.randomInt(10, 50));

        System.out.println(MyRandom.randomLong());
        System.out.println(MyRandom.randomFloat());
        System.out.println(MyRandom.randomDouble());

        System.out.println(MyRandom.randomMixed());
    }
}
