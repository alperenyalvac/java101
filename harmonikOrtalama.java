public class Main {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5};
        double sum = 0;
        
        for (int i = 0; i < list.length; i++) {
            sum += 1 / list[i];
        }
        
        System.out.println("Harmonik Ortalama: " + list.length / sum);
    }
}
