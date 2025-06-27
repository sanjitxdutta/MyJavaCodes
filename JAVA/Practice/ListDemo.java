 import java.util.*;

 public class ListDemo{
    public static void populateList(Scanner sc, ArrayList<Integer> arr){
        String line = sc.nextLine();
        Scanner scs = new Scanner(line);
        while(scs.hasNextInt()){
            arr.add(Integer.parseInt(scs.next()));
        }
        scs.close();
    }

    public static void displayList(String s, ArrayList<Integer> arr){
        System.out.print(s + " :");
        for(int item: arr){
            System.out.print(item + "   ");
        }
        System.out.println();
    }

    public static void sortListDesc(ArrayList<Integer> arr){
        Collections.sort(arr);
        Collections.reverse(arr);
    }

    public static int binSearch(ArrayList<Integer> arr, int key){
        return Collections.binarySearch(arr, key, Collections.reverseOrder());
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> arr = new ArrayList<Integer>();

        populateList(sc, arr);

        displayList("Old List", arr);

        sortListDesc(arr);

        displayList("Sorted List", arr);

        int key, index;
        key = sc.nextInt();
        index = binSearch(arr, key);

        if(index >= 0){
            System.out.println("Position :" + index);
        }
        else{
            System.out.println("Not Found!");
        }
    }
 }