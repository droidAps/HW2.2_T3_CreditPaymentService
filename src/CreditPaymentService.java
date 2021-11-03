public class CreditPaymentService {
    public int calculate(int creditAmount, int creditPeriod, double interestRate) {
        int numberOfPayments = creditPeriod * 12;                                // количество платежей
        double monthlyInterestRate = interestRate / 12 / 100;                    // процентная ставка по ипотеке в месяц
        double local1 = 1 + monthlyInterestRate;
        double local2 = local1;
        for (int i = 1; i < numberOfPayments; i++) {
            local2 = local2 * local1;
        }
        double annuityRatio = (monthlyInterestRate * local2) / (local2 - 1);     // коэффициент аннуитета
        double monthlyPaymentFractional = creditAmount * annuityRatio;           // ежемесячный платеж (дробное значение)
        int monthlyPayment = (int) monthlyPaymentFractional;                     // ежемесячный платеж (целое значение)
        return monthlyPayment;
    }
}