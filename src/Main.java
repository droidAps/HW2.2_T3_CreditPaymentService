public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();                              // метод для расчета ежемесячного ануиететного платежа
        int creditAmount = 1_000_000;                                                           // сумма ипотеки в рублях
        int creditPeriod = 1;                                                                   // срок кредитования в годах
        double interestRate = 9.99;                                                             // годовая процентная ставка

        int monthlyPayment = service.calculate(creditAmount, creditPeriod, interestRate);       // ежемесячный платеж при сроке кредитования 1 год
        System.out.println(monthlyPayment);

        creditPeriod = 2;
        monthlyPayment = service.calculate(creditAmount, creditPeriod, interestRate);           // ежемесячный платеж при сроке кредитования 2 года
        System.out.println(monthlyPayment);

        creditPeriod = 3;
        monthlyPayment = service.calculate(creditAmount, creditPeriod, interestRate);           // ежемесячный платеж при сроке кредитования 3 года
        System.out.println(monthlyPayment);
    }
}
