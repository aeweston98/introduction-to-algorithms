public class chapterSix {
    public void maxHeapify(int[] A, int i){
        int l = left(i);
        int r = right(i);
        int largest = i;

        if(l <= A.length && A[l] < A[i]){
            largest = l;
        }

        if(r <= A.length && A[r] > A[largest]){
            largest = r;
        }

        if(largest != i){
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            maxHeapify(A, largest);
        }
    }

    public void buildMaxHeap(int[] A){
        for(int i = (A.length/2) - 1; i >= 0; i--){
            maxHeapify(A, i);
        }
    }

    private int left(int i){
        return i*2 + 1;
    }

    private int right(int i){
        return i*2 + 2;
    }
}
