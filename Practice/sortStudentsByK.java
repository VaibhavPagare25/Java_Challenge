import java.util.*;

class SortStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the students in the class");
        int students = sc.nextInt();
        System.out.println("Enter the k value");
        int k = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<String> stringList = new ArrayList<String>();
        System.out.println("Enter the student names in the class");
        for (int i = 0; i < students; i++) {
            stringList.add(sc.next());
        }
        System.out.println("Enter the student marks in the class");
        for (int i = 0; i < students; i++) {
            arrayList.add(sc.nextInt());
        }

        for (int i = 0; i < k; i++) {
            int max = 0;
            for (int j = 1; j < arrayList.size(); j++) {
                if (arrayList.get(j) > arrayList.get(max)) {
                    max = j;
                }
            }
            System.out.println(stringList.get(max) + ":" + arrayList.get(max));
            arrayList.remove(max);
            stringList.remove(max);
        }

    }
}