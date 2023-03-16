package boksoyunu;
public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alperen", 10, 120, 90, 30);
        Fighter f2 = new Fighter("Mehmet", 15, 100, 85, 45);
        
        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
    
}
