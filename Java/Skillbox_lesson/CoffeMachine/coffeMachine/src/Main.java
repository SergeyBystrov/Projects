public class Main {
    public static void main(String[] args) throws Exception {
        int moneyAmount = 0;
        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espresso = 80;
        int waterPrice = 20;
        boolean canByAnithing = false;

        if(moneyAmount >= cappucinoPrice){
            System.out.println("Вы можете купить капучино");
            canByAnithing = true;
        }
        if(moneyAmount >= lattePrice){
            System.out.println("Вы можете купить латте");
            canByAnithing = true;

        }
        if(moneyAmount >= espresso){
            System.out.println("Вы можете купить эспрессо");
            canByAnithing = true;

        }
        if(moneyAmount >= waterPrice){
            System.out.println("Вы можете купить воду");
            canByAnithing = true;

        }
        if(canByAnithing == false){
            System.out.println("Недостаточно средств");
        }
    }
}
