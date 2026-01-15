public class Main {
    public static void main(String[] args) {

        int ticketprice = 17000;
        int rublespermile = 20;
        int bonusmiles = ticketprice / rublespermile;
        System.out.println("Начислено бонусных миль: " + bonusmiles);
    }
}