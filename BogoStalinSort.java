import java.util.Collections;
import java.util.List;

public class BogoStalinSort {
    /*** BoGo Stalin sort, inspired from Bogo sort and how Stalin dealt with problematic people
     * CAN ONLY SORT IN ASCENDING ORDER
     * runs through the list to find the first item that breaks the ascending order
     * example: [ 1, 2, 4 , 3] , ascending order until the item "4"
     * next step: "stalin" aka remove the problematic item [ 1, 2, 3]
     * if the list is not sorted, we shuffle the list
     * Rinse and repeat until the list is sorted or there is 1 item left
     * @param list, any list class that is extends comparable
     */
    public static <T extends Comparable<T>> void sort(List<T> list){
        if (list.size() > 1){
            while(isSorted(list) != 0) {
                list.remove(isSorted(list)); // Boom get Stalined
                if (isSorted(list) != 0) {
                    Collections.shuffle(list);  // BoGo
                }
            }
        }
    }

    /*** isSorted, checks if list is sorted
     *  returns 0 if its sorted
     *  else returns the index of the object that breaks the ascending order
    * */
    public static <T extends Comparable<T>> int isSorted(List<T> list) {
        if (list.size() <= 1){
            return 0;
        }
        for (int i = 0; i < list.size() - 1 ; i++){
            if (list.get(i).compareTo(list.get(i+1)) > 0){
                return i+1;
            }
        }
        return 0;
    }

}