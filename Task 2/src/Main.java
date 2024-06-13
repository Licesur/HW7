public class Main {
    public static void main(String[] args) {
        int i =0;
        while (i < 100){
            i++;
            if (i % 2 == 1) continue;
            System.out.println("deemployed " + i);
        }
    }
}
