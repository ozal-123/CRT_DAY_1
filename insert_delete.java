import java.util.Scanner;
public class insert_delete {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[100]; 

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert (0 to " + n + "): ");
        int pos = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos] = element;
        n++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // DELETIOn
        System.out.print("\nEnter position to delete: ");
        int delPos = sc.nextInt();

    
        for (int i = delPos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
    

