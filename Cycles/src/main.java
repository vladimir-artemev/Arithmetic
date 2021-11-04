//public class main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println(i);
//        }
//    }
//}
//public class main {
//    public static void main(String[] args) {
  //      for (int i = 200000; i <= 210000; i++)
    //    {
      //      System.out.println("Номер билета: " + i);
        //}
        //for (int i = 220000; i <= 235000; i++)
        //{
          //  System.out.println("Номер билета: " + i);
        //}
    //}
//}
public class main {
    public static void main(String[] args) {
        //int i = 200000;
        //while (i <= 210000) {
          //  System.out.println("Номер билета: " + i);
            //i++;
        //}
        for (int j = 200000; j <= 235000; j++) {
            if (((j >= 200000) && (j <= 210000)) || ((j >= 220000) && (j <= 235000))){
            System.out.println("Номер билета: " + j);
            }
        }
    }
}