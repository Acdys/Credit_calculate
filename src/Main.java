public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма ежемесячного платежа на 12 месяцев: ");
        System.out.println(service.calculate(12, 1_000_000, 9.99));

        System.out.println("Сумма ежемесячного платежа на 24 месяца: ");
        System.out.println(service.calculate(24, 1_000_000, 9.99));

        System.out.println("Сумма ежемесячного платежа на 36 месяцев: ");
        System.out.println(service.calculate(36, 1_000_000, 9.99));
    }
}