public class Main {
    public static void main(String[] args) throws InterruptedException {
        int count = 0;
        Printer printer = new Printer();
        while (true) {
            printer.Shout(String.valueOf(count));
            Thread.sleep(3000); // 3 saat = 3000 ms
            count ++;
        }
    }
}