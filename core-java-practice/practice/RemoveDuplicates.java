public class RemoveDuplicates{
    public static void main(String[] args){
        int[] arr = {1,13,123,1,12,1,9,11,11,0,121,123};
        int size = arr.length;

        for (int i= 0; i < size; i++) {
            for(int j=i+1;j<size; j++){
                if(arr[i]==arr[j])
                {
                    for(int k=j; k<size-1;k++){
                        arr[k]=arr[k+1];
                    }
                    size--;
                    j--;
                    System.out.print(arr[i]+ " ");
                }
            }
        }
    }
    }