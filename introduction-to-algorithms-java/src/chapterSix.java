public class chapterSix {
    private void maxHeapify(heap h, int i){
        int l = left(i);
        int r = right(i);
        int largest = i;

        if(l < h.heapsize){
            if(h.A[l] > h.A[i]) {
                largest = l;
            }
        }

        if(r < h.heapsize){
            if(h.A[r] > h.A[largest]) {
                largest = r;
            }
        }

        if(largest != i){
            System.out.println("looo");
            exchange(h.A, i, largest);
            maxHeapify(h, largest);
        }
    }

    private void buildMaxHeap(heap h){
        for(int i = (h.A.length/2) - 1; i >= 0; i--){
            System.out.println(i);
            maxHeapify(h, i);
        }
    }

    private void exchange(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    private int left(int i){
        return i*2 + 1;
    }

    private int right(int i){
        return i*2 + 2;
    }

    public void heapsort(int[] A){
        heap h = new heap(A);
        buildMaxHeap(h);
        
        for(int i = h.A.length - 1; i >= 1; i--){
            exchange(h.A, i, 0);
            h.heapsize--;
            maxHeapify(h, 0);
        }
    }
}
