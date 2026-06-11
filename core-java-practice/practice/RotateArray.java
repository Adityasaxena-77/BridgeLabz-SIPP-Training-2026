public class RotateArray{
    public static void main(String[] args){
        int[] arr = {1,13,123,1,12,1,9,11,11,0,121,123};
        int size = arr.length;
        int k=2;
        k=k%size;
        int [] temp= new int[size];
        for(int i=0; i<size; i++){
            temp[(i+k)%size]= arr[i];
        }
    }
}