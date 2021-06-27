public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация
        System.out.println("1011 + 0001 = " + bins.sum("1011", "0001"));
        System.out.println("11011 + 10001 = " + bins.sum("11011", "10001"));
        System.out.println("1011 * 0001 = " + bins.mult("1011", "0001"));
        System.out.println("11011 * 10001 = " + bins.mult("11011", "10001"));
    }

}
