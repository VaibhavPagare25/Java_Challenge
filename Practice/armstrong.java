import java.util.*;

class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int sum = 0;
            int temp = num;
            int count = 0;
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
            temp = num;
            while (temp != 0) {
                int rem = temp % 10;
                int mult = 1;
                for (int j = 0; j < count; j++) {
                    mult = mult * rem;
                }
                sum = sum + mult;
                temp = temp / 10;
            }
            if (sum == num) {
                flag = true;
                System.out.print(sum + " ");
            }
        }
        if (flag == true) {
            System.out.println();
        } else {
            System.out.println("No armstrong No. found");
        }
    }
}