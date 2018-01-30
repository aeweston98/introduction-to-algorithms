public class execute {
    public static void main(String[] args){
        int[] arr = {-1, 20, -56, 12, 887, 91, -100};
        chapterTwo c = new chapterTwo();

        System.out.println("Before sorting");
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");

        c.insertSort(arr);

        System.out.println("After sorting");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
        }
        System.out.println("");
    }
}
