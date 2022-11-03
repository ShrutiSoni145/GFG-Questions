
//User function Template for Java

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
    int j=0;
    int i=0;
    for( i=0;i<N-1;i++){
        if(A[i]!=A[i+1]){
            A[j++]=A[i];
        }
    }
    A[j++]=A[i];
    return j;
    }
}
