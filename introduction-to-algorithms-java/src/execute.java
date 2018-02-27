public class execute {
    public static void main(String[] args){
        int[] arr= {2, 8, 7, 1, 3, 5, 6, 4};
        chapterSeven c = new chapterSeven();

        System.out.println("Full Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");

        c.quicksort(arr, 0, arr.length-1);

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");
    }
}
