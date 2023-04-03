package findMinOrMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args)throws EmptyListException {
        Main main= new Main();

      //1)wernutj wse krome tschisla 3 i bolsche
      List<Integer>list = Arrays.asList(1,2,3,4,5);
      System.out.println(main.without(list,3));

      //2)wernutj stroku kotoraja wstretschaetsa ransche. libo samaja dlinnaja lio samaja korotkaja
      List<String>list1 = Arrays.asList("aaa","bb","c","dddd");
      System.out.println(main.first(list1));
    }
    public List<Integer> without (List<Integer> list, int n){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i< list.size();i++){
            if(list.get(i) <= n ){
                result.add(list.get(i));
            }
        }
      return result;
    }
    public String first(List<String> list)throws EmptyListException{
        if(list.isEmpty()){
            throw new EmptyListException();  //schtobi pri teste empty list ne raswaliwalsa
        }

        String shortest= list.get(0);
        int indexShortest=0;

        String longest= list.get(0);
        int indexLongest=0;

        for (int i=0; i< list.size();i++){

            if(list.get(i).length() >longest.length()){
                longest=list.get(i);
                indexLongest=i;
            } else if (list.get(i).length()<shortest.length()){
                shortest=list.get(i);
                indexShortest=i;
            }
        }
        if(indexShortest<indexLongest){
            return shortest;
        }
        return longest;
    }
}