public class execute {
    public static void main(String[] args){
        int[] arr= {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        chapterSix c = new chapterSix();

        System.out.println("Full Array");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");

        c.heapsort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");
    }
}
