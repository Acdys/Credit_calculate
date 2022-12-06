public class CreditPaymentService {
    public double calculate(int term, int sumCredit, double percent) {
        double payment;
        double monthlyRate = percent / (12 * 100);
        double x = (1 + monthlyRate);
        double y = 1 / Math.pow(x, term);
        payment = sumCredit * (monthlyRate / (1 - y));
        return payment;
    }
}


