import java.util.*;

public class Q03_CollectionsMethodsTask {

    public static void main(String[] args) {
        // part 1: create list of 5 numbers from user input
        // sort the list in reverse order and print it
        // shuffle the list and print it
        // rotate right by 3 places and print it

        // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
        // listeyi ters sırada sırala ve yazdır
        // listeyi karıştır ve yazdır
        // 3 yer sağa döndür ve yazdır

        List<Integer> list= new ArrayList<>();


        Scanner scan=new Scanner(System.in);

        int sayac=1;
        int input=0;


       while (sayac<=5){ sayac++;

            input=scan.nextInt();

           list.add(input);
                 }

       for (int i = list.size()-1; i >=0 ; i--) {

           System.out.print(list.get(i)+" ");

        }

       int index=0;

        List<Integer> list2= new ArrayList<>();

        while(list.size()>list2.size()){
            index=(int)(Math.random()*5);

            if(!list2.contains(list.get(index))){

            list2.add(list.get(index));}

            System.out.println("list2 = " + list2);
        }

        Collections.rotate(list,3); //belirtilen listedeki ogeleri kaydirir distance hangi no ise ordan baslar
        System.out.println("rotate edildikten sonra :" + list);

        /*
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("sayi giriniz :");
            arrList.add(scan.nextInt());
        }


        Collections.sort(arrList,Collections.reverseOrder());   //  reverseOrder() ters siralar..
                                                                // decending(azalan siralama)
                                                                // sort () siralar

        System.out.println("ters siraladiktan sonra arrList :" + arrList);



        Collections.shuffle(arrList) ; //rastgele karistirir
        System.out.println("shuflle yaptiktan sonra " + arrList);


        Collections.rotate(arrList,3); //belirtilen listedeki ogeleri kaydirir distance hangi no ise ordan baslar
        System.out.println("rotate edildikten sonra :" + arrList);


        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.replaceAll(arrList,max,min);
        System.out.println("replaceAll dan sonra :" + arrList);




         */



    }

}




