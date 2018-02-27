public class chapterSeven {

    public void quicksort(int[] A, int p, int r){
        if( p < r){
            int q = partition(A,p,r);
            quicksort(A,p,q-1);
            quicksort(A, q+1, r);
        }
    }

    private void exchange(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1;

        for(int j = p; j <= r-1; j++){
            if(A[j] <= x){
                i = i + 1;
                exchange(A, i, j);
            }
        }

        exchange(A, i+1, r);
        return i+1;
    }
}
