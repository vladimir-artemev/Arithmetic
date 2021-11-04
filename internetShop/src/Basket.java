public class Basket {
    private  String items ="";
    private int totalPrice = 0;
    private int limit;


   public Basket(){
       this.limit = 1000000;
       items = "Список товаров: ";
   }

    //public Basket (int totalPriceLimit){
    //limit = totalPriceLimit;
    public Basket(int limit){
       this();
        this.limit = limit;
      //  items = "Список товаров: ";
    }

    public Basket (String items, int totalPrice){
       this();
       this.items = this.items + items;
       this.totalPrice = totalPrice;
    }

    public void add(String name, int price)
    {
        add (name, price, 1);
    }

    public void add(String name, int price, int count){

        if (contains(name)){
            return;
        }
        if (totalPrice + count * price >= limit){
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. -" + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear(){

        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice()
    {
        return totalPrice;
    }

    public boolean contains(String name){
       // if (items.contains(name)){
       //     return true;
        //}
        //return false;

        return items.contains(name);
    }

    public void print (String title){
        System.out.println(title);
        if (items.isEmpty() ){
            System.out.println("Корзина пуста");
        }
        else {
            System.out.println(items);
            System.out.println();
        }
    }
}
