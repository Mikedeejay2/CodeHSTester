import java.util.Random;

public final class Randomizer {
    private static final Random random = new Random();

    private Randomizer() {
        throw new UnsupportedOperationException(String.format("The class \"%s\" can not be declared!", this.getClass().getName()));
    }

    public static int nextInt(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    public static boolean nextBoolean() {
        return random.nextBoolean();
    }

    public static boolean nextBoolean(double probability) {
        return random.nextDouble() <= probability;
    }

    public static double nextDouble() {
        return random.nextDouble();
    }

    public static double nextDouble(double low, double high) {
        return random.nextDouble() * (high - low) + low;
    }
}
