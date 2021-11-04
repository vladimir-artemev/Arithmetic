import java.util.Scanner; // импортируем в эту программу Scanner для считывания с клавиатуры

public class Main {  //создаем class Main
    private static int minIncome = 200000; // переменная minIncome int целое число
    private static int maxIncome = 900000; // переменная maxIncome int целое число

    private static int officeRentCharge = 140000; // переменная officeRentCharge int целое число
    private static int telephonyCharge = 12000; // переменная telephonyCharge int целое число
    private static int internetAccessCharge = 7200; // переменная intrnetAccessCharge int целое число

    private static int assistantSalary = 45000; // переменная assistantSalary int целое число
    private static int financeManagerSalary = 90000; // переменная financeManagerSalary int целое число

    private static double mainTaxPercent = 0.24; // переменная mainTaxPercent double не целое число. c запятой
    private static double managerPercent = 0.15; // переменная managerPercent double не целое число. c запятой

    private static double minInvestmentsAmount = 100000; // переменная minInvestmentsAmount double не целое число. c запятой

    public static void main(String[] args) {   // обьявляем начало тела програамы

        //расчёт и вывод минимальной суммы дохода для инвестирования
        while (true) {        // пока true выполняем следующее

            for (int i = 200000; i <= 900000; i++){
                double managerSal = i * managerPercent;
                double pureIncom = i - managerSal -
                        calculateFixedCharges();
                double taxAmoun = mainTaxPercent * pureIncom;
                double pureIncomeAfterTaxe = pureIncom - taxAmoun;

                boolean canMakeInvestment = pureIncomeAfterTaxe >=
                        minInvestmentsAmount;
                if (canMakeInvestment == true){
                    System.out.println("\n" + "Минимальная сумма дохода когда компания может инвестировать: " + i);


            System.out.println("Введите сумму доходов компании за месяц " +  // ппросит ввести сумму доходов
                "(от 200 до 900 тысяч рублей): ");
            int income = (new Scanner(System.in)).nextInt(); // переменная income int целое число, это сисло мы вводим с клавиатуры при запросе


            if (!checkIncomeRange(income)) {  // переходит на выполнение процедуры checkIncomeRange, если не False то выходит из программы, если не True то продолжить
                continue;  // продолжить
            }

            double managerSalary = income * managerPercent; // переменная managerSalary double число с запятой, вычисляется
            double pureIncome = income - managerSalary -    // переменная pureIncome double число с запятой, вычисляется
                calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome; // переменная taxAmount double число с запятой, вычисляется
            double pureIncomeAfterTax = pureIncome - taxAmount; // переменная pureIncomeAfterTax double число с запятой, вычисляется

            boolean canMakeInvestments = pureIncomeAfterTax >=  // переменная canMakeInvestments double число с запятой, вычисляется
                minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary); // выводит на экран зарплату менеджера
            System.out.println("Общая сумма налогов: " +  // выводит на экран налоги
                (taxAmount > 0 ? taxAmount : 0));         // выводит сумму налогов в зависимости от taxAmount
            System.out.println("Компания может инвестировать: " + // выводит на экран может ли компания инвестировать
                (canMakeInvestments ? "да" : "нет"));   // выводит да или нет в зависимости от canMakeInvestments true или false
            if (pureIncome < 0) {    // сравнивает pureIncome меньше или больше 0
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");  // выводит на экран бюджет в минусе в случает если pureIncome < 0
            }


                }
            }
        }
    }

    private static boolean checkIncomeRange(int income) {  // обьявляет процедуру checkIncomeRange int
        if (income < minIncome) {  // сравнивает income с minIncome
            System.out.println("Доход меньше нижней границы");  //если выполняется условие то выводится
            return false;  // возвращает false туда где ее вызывали
        }
        if (income > maxIncome) {  // сравнивает income с minIncome
            System.out.println("Доход выше верхней границы"); //если выполняется условие то выводится
            return false;  // возвращает false туда где ее вызывали
        }
        return true;  // возвращает true туда где ее вызывали если ни одно из условий не выполнено
    }

    private static int calculateFixedCharges() {  // здесь вычисляется calculateFixedCharges и возвращается int целое число
        return officeRentCharge +
            telephonyCharge +
            internetAccessCharge +
            assistantSalary +
            financeManagerSalary;
    }
}
