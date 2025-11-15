package ict.customrng;

public class MyRandom {

    private static long seed = System.currentTimeMillis();
    private static final long A = 1103515245;
    private static final long C = 12345;
    private static final long M = (long) Math.pow(2, 31);

    private static long next() {
        seed = (A * seed + C) % M;
        return seed;
    }

    public static int randomInt() {
        return (int) next();
    }

    public static int randomInt(int max) {
        return (int) (next() % max);
    }

    public static int randomInt(int min, int max) {
        return min + (int) (next() % (max - min + 1));
    }

    public static long randomLong() {
        return next();
    }

    public static float randomFloat() {
        return next() / (float) M;
    }

    public static double randomDouble() {
        return next() / (double) M;
    }

    public static String randomMixed() {
        int num = randomInt(10);
        char ch = (char) ('A' + randomInt(26));
        return num + "-" + ch;
    }
}
