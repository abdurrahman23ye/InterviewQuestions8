import java.util.*;

public class Q06_AddedOrNotTask {
    public static void main(String[] args) {

        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have
        // find out what are the duplicated values

        // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
        // kaç tane tekrarli eleman olduğunu sayin
        // yinelenen değerlerin ne olduğunu öğrenin

        List<Integer> list=new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        Map<Integer,Integer> tekrarEdenler=new HashMap<>();
        int sayac=0;

        System.out.print("tekrarEdenler = ") ;     for (int i = 0; i <list.size() ; i++) {

            if(!tekrarEdenler.keySet().contains(list.get(i))){tekrarEdenler.put(list.get(i),1);}
            else {tekrarEdenler.put(list.get(i),tekrarEdenler.get(list.get(i))+1);

                System.out.print(list.get(i)+" " );}


            }
        System.out.println();






        for (int a:tekrarEdenler.values()
             ) { if(a>1){sayac++;
            }

        }
        System.out.println("Tekrar eden eleman sayısı:"+ sayac);


        }

        }




