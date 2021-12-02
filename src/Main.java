public class Main {
    public static void main(String[] args) {
        int ticketPrice = 15_000;
        int costMail = 20;
        int bonus = ticketPrice / costMail;
        System.out.println ("Amount Spent" + ticketPrice);
        System.out.println ("Received Bonuses" + bonus);
    }
}
