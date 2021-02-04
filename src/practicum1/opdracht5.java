package practicum1;

public class opdracht5 {
    public static void main(String[] args) {
        String zaagblad = "s";
        for (int i = 1 ; i < 5 ; i++) {
            if (zaagblad.equals("s")) {
                System.out.println(zaagblad);
                zaagblad = "ss";
            } else {
                System.out.println(zaagblad);
                zaagblad = "s";
            }
        }
    }
}
