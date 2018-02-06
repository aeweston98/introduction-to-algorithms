public class chapterFour {

    private triple maxCrossSubArray(int[] A, int l, int m, int h){
        int leftSum = A[m] - 1;
        int sum = 0;
        int maxLeft = m;
        for(int i = m; i >= l; i--){
            sum += A[i];
            if(sum > leftSum){
                leftSum = sum;
                maxLeft = i;
            }
        }
        sum = 0;
        int rightSum = A[m+1] - 1;
        int maxRight = m+1;
        for(int i = m+1; i <= h; i++){
            sum += A[i];
            if(sum > rightSum){
                rightSum = sum;
                maxRight = i;
            }
        }
        triple t = new triple(maxLeft, maxRight, leftSum +rightSum);
        return t;
    }

    public triple maxSubArray(int[] A, int l, int h){
        if(l == h){
            triple t = new triple(l,l,A[l]);
            return t;
        }
        else{
            int mid = (l+h)/2;
            triple left = maxSubArray(A,l,mid);
            triple right = maxSubArray(A,mid+1,h);
            triple cross = maxCrossSubArray(A,l,mid,h);
            if(left.value >= right.value && left.value >= cross.value){
                return left;
            }
            else if(right.value >= left.value && right.value >= cross.value){
                return right;
            }
            else{
                return cross;
            }
        }
    }

    public triple linearMaxSubArray(int[] A){
        int maxStart = 0;
        int maxEnd = 0;
        int maxVal = A[0];
        int curEnd = 0;
        int curVal = A[0];

        for(int i = 1; i < A.length; i++){
            int t = A[i];

            if(maxVal < 0){
                if(t >= maxVal){
                    maxVal = t;
                    maxStart = i;
                    maxEnd = i;
                    curVal = t;
                    curEnd = i;
                }
            }
            else if(t > maxVal){
                if(curVal > 0){
                    curVal += t;
                    maxVal = curVal;
                    maxEnd = i;
                    curEnd = i;
                }
                else{
                    maxVal = t;
                    maxStart = i;
                    maxEnd = i;
                    curEnd = i;
                    curVal = t;
                }
            }
            else{
                if(t > 0){
                    maxEnd = i;
                    curEnd = i;
                    curVal += t;
                    maxVal = curVal;
                }
                else{
                    curEnd = i;
                    curVal += t;
                }
            }
        }

        triple t = new triple(maxStart,maxEnd,maxVal);
        return t;
    }

    public void SquareMatrixMultiply(int size, squareMatrix A, squareMatrix B, squareMatrix c){

        if()
    }
}
