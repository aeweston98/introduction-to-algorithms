import java.util.List;

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
    private void merge(int[]inp, int a, int b, int c){
        int n1 = b-a+1;
        int n2 = c-b;

        int[] l1 = new int[n1];
        for(int i = 0; i < n1; i++){
            l1[i] = inp[a+i];
        }

        int[] l2 = new int[n2];
        for(int i = 0; i < n2; i++){
            l2[i] = inp[b+i+1];
        }

        int i = 0;
        int j = 0;
        int k = a;

        while(i < n1 && j < n2){
            if(l1[i] <= l2[j]){
                inp[k] = l1[i];
                i++;
            }
            else {
                inp[k] = l2[j];
                j++;
            }
            k++;
        }

        while(j<n2){
            inp[k] = l2[j];
            k++;
            j++;
        }

        while (i < n1) {
            inp[k] = l1[i];
            k++;
            i++;
        }
    }

    public void mergeSort(int[] inp, int a, int c){
        if(c>a){
            int b = (c+a)/2;
            mergeSort(inp,a,b);
            mergeSort(inp,b+1,c);
            merge(inp,a,b,c);
        }
    }
}
