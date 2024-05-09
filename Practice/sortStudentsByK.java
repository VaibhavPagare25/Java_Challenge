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
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j) > max) {
                    max = arrayList.get(j);
                    System.out.println(stringList.get(j) + ":" + arrayList.get(j));
                }
                arrayList.remove(j);
                stringList.remove(j);
            }
        }
    }
}