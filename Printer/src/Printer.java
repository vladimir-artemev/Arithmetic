

public class Printer {

    private String queue = "";
    private int number = 0;
    private int totalNumber = 0;
    private int totalPages;

        public static void main(String[] args) {

            Printer printer = new Printer();

            printer.append ("Кто JAVA-разработчик: ");

            printer.append("Кто JAVA-разработчик: ", " Вован крутой JAVA-разработчик месяцев через ");

            printer.append("Кто JAVA-разработчик: ", " Вован крутой JAVA-разработчик месяцев через ", 5);

            printer.print("Скоро скоро!!!!");

            printer.clear();

        }



    public Printer() {

        queue = "Список документов:";
    }

        public void append (String text){
        append(text, " Вован крутой JAVA-разработчик месяцев через ", 5);
        }

        public void append (String text, String name){
        append(text, name, 5);
        }

        public void append (String text, String name,int number){
            queue = queue + "\n" + text + " - " + name + " - " + number;
            totalNumber = totalNumber + number;
            totalTotalNumber(totalNumber);
        }

        public void clear () {
        queue = "";
        totalNumber = 0;
        }

        public int getPendingPagesCount(){
        return totalNumber;
        }

        public int totalTotalNumber(int totalNumber){
            totalPages = totalPages + totalNumber;
            return totalPages;
        }



        public void print (String title){
            System.out.println(title);
            if (queue.isEmpty()) {
                System.out.println("Документ пуст");
            } else {
                System.out.println(queue);
                System.out.println(" Кол-во страниц в документе: " + totalNumber);
            }
        }


}


