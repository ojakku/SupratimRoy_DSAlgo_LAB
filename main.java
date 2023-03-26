import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        

        MergeSort mergeSort = new MergeSort();
        notesCount notesCount = new notesCount();

        System.out.println("Enter the size of denominations : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] notes = new int[size];
        System.out.println("Enter th currency denominations values : ");
        for(int i = 0; i < size; i++) {
            notes[i] = sc.nextInt();
        }
        System.out.println("Enter the amount you want to pay : ");
        int amount = sc.nextInt();
        mergeSort.sort(notes, 0, notes.length - 1);
        notesCount.notesCount(notes, amount);
    }
}
