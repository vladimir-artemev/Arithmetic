public class Main {
    public static void main(String[] args) {
        int vasyaAge = 36;
        int katyaAge = 35;
        int mishaAge = 6;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge > katyaAge) {
            max = vasyaAge;
        } else {
            max = katyaAge;
        }

        if (mishaAge > max) {
            max = mishaAge;
            // System.out.println("Максимальный возраст: " + max + " лет");
        } else {
            // System.out.println("Максимальный возраст: " + max + " лет");
        }
        if (vasyaAge < katyaAge) {
            min = vasyaAge;
        } else {
            min = katyaAge;
        }
        if (((vasyaAge > katyaAge) && (vasyaAge < mishaAge)) || ((vasyaAge < katyaAge) && (vasyaAge > mishaAge))) {
            middle = vasyaAge;
            //System.out.println("Средний возраст: " + middle + " лет");
        } else if (((katyaAge > vasyaAge) && (katyaAge < mishaAge)) || ((katyaAge < vasyaAge) && (katyaAge > mishaAge))) {
            middle = katyaAge;
            //System.out.println("Средний возраст: " + middle + " лет");
        } else if (((mishaAge > vasyaAge) && (mishaAge < katyaAge)) || ((mishaAge < vasyaAge) && (mishaAge > katyaAge))) {
            middle = mishaAge;
            //System.out.println("Средний возраст: " + middle + " лет");
        }

        if (mishaAge < min) {
            min = mishaAge;
            //System.out.println("Минимальный возраст: " + min + " лет");
        } else {
            //System.out.println("Минимальный возраст: " + min + " лет");
        }
        System.out.println("Минимальный возраст: " + min + " лет");
        System.out.println("Средний возраст: " + middle + " лет");
        System.out.println("Максимальный возраст: " + max + " лет");






    }
}


