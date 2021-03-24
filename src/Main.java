public final class Main {
    private Main() {
        throw new UnsupportedOperationException(String.format("The class \"%s\" can not be declared!", this.getClass().getName()));
    }

    public static void main(String[] args) {
        new CodeHSTester().run();
    }
}
