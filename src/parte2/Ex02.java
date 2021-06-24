package parte2;

public class Ex02 {
    public static void main(String[] args) {
        double empresaX = 1.13;
        double empresaY = 18.4;
        int year = 2021;


        while(empresaX <= empresaY) {
            System.out.println("Empresa X - 01/01/" + year + " - Valor da empresa: " + empresaX + "m");
            System.out.println("Empresa Y - 01/01/" + year + " - Valor da empresa: " + empresaY + "m");

            empresaX += empresaX * 1.48;
            empresaY += empresaY * 0.32;
            year++;
        }
    }
}
