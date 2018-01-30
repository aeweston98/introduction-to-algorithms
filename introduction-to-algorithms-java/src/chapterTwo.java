public class chapterTwo {
    public void insertSort(int[] inp){

        for(int j = 1; j < inp.length; j++){
            int key = inp[j];
            int i = j-1;

            while(i >= 0 && inp[i] > key){
                inp[i+1] = inp[i];
                i = i-1;
            }
            inp[i+1] = key;
        }
    }
    public int[] addBinaryArrays(int[] src1, int[] src2){
        int[] dest = {};

        //no need for bounds checking
        //for(int i = 0; i < src1.length;)

        return dest;
    }
}
