public class Main {

        public static void main(String[] args) {
            System.out.println("Акция!За каждые 20 рублей, потраченные на билет, начисляется 1 миля.");
            BonusMilesService service = new BonusMilesService();
            int ticketPrice = 3700;
            int miles = service.calculate(ticketPrice);
            System.out.println("Количество ваших бонусных миль = " + miles);

        }
    }
