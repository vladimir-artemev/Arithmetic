public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");
        int fuelType = 95;
        int amount = 420;
        int maxamount = 400;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double fuelPrice = 0;

        if(fuelType == 92) {
            fuelPrice = fuel92price;
        }
        else if(fuelType == 95) {
            fuelPrice = fuel95price;
        }
        else {
            System.out.println("Указан неверный тип топлива");
        }

        if (amount < 1){
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        if (amount > maxamount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = maxamount;
            System.out.println("Максмальное количество топлива: " + maxamount + "л");
        }

        System.out.println("Цена и марка выбранного топлива:" + fuelPrice + "руб." + "АИ" + fuelType);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");

    }
}
