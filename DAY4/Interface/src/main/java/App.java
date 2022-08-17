interface App {
    void college();
}
class Rmk implements App {
    @Override
    public void college() {
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        Rmk rmk = new Rmk();
        rmk.college();
    }
}

