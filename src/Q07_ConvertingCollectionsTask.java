import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q07_ConvertingCollectionsTask {
    public static void main(String[] args) {
        // create an array of random numbers of size 10
        // convert that array into a list
        // convert list into set

        // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
        // bu arrayi bir listeye dönüştür
        // listeyi sete çevir

        int[] array=new int[10];

        List<Integer> list=new ArrayList<>();
        Set<Integer> list2=new HashSet<>();

        int sayac=0;

        while (sayac<10){

            array[sayac]=(int)(Math.random()*30);

            list.add(array[sayac]);
            list2.add(array[sayac]);

            sayac++;
        }
        System.out.println(list);
        System.out.println(list2);
    }
}
