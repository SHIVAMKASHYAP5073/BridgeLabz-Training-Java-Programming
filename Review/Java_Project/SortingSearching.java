package Java_Project;
import java.util.*;
class SortingSearching {

    public void sortByAge(ArrayList<Passenger> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getAge() > list.get(j + 1).getAge()) {
                    Passenger temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted by Age using Bubble Sort");
    }

    public void sortByWallet(ArrayList<Passenger> list) {
        for (int i = 1; i < list.size(); i++) {
            Passenger key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getWalletBalance() > key.getWalletBalance()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
        System.out.println("Sorted by Wallet using Insertion Sort");
    }
}
