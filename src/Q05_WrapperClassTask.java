public class Q05_WrapperClassTask {

    public static void main(String[] args) {
        // create a method that accepts an int
        // and returns twice of that int
        // overload this method with wrapper class: Integer

        // int kabul eden bir metot yarat
        // ve bu int'nin iki katını döndürür
        // bu yöntemi wrapper sınıfıyla overload et : Integer

        int input1=10;
        Integer input2=10;

        ikiKatiniGetir(input1);
        ikiKatiniGetir(input2);
    }

    private static void ikiKatiniGetir(int input1) {

        System.out.println(input1*2);
    }
    private static void ikiKatiniGetir(Integer input2){System.out.println(input2*2);}
}
