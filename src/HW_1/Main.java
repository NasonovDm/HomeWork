package HW_1;

public class Main {

    public static void main(String[] args) {
        float calculator ( int a, int b, int c, int d){
            float result = a * (b + (c / d));
            return result;
        }



        int number ( int a, int b){
            int sum = a + b;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }



            int number ( int a){
                if (a >= 0) {
                    System.out.println(a + " Число положительное");
                } else {
                    System.out.println(a + " Число отрицательное");
                }



                String hello (String name){
                    System.out.println("Привет," + name + "!");
                }




                public static void year ( int year){
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        System.out.println("Год" + year + " високосный");
                    else
                        System.out.println("Год " + year + " не високосный");
                }


            }

        }
    }
}