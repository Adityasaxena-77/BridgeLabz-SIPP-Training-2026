package Sorting;
public class SportsMeet {

    static int bubbleSort(int[] scores) {

        int swaps = 0;
        boolean alreadySorted = true;

        for(int i = 0; i < scores.length - 1; i++) {

            boolean swapped = false;

            for(int j = 0; j < scores.length - i - 1; j++) {

                if(scores[j] > scores[j+1]) {

                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;

                    swaps++;
                    swapped = true;
                    alreadySorted = false;
                }
            }

            if(!swapped)
                break;
        }

        if(alreadySorted)
            System.out.println("Already Sorted (Best Case)");

        return swaps;
    }

public class InsertionSports {


    static void insertionSort(int scores[]) {


        for(int i=1;i<scores.length;i++){

            int key=scores[i];

            int j=i-1;


            while(j>=0 && scores[j]>key){

                scores[j+1]=scores[j];
                j--;

            }

            scores[j+1]=key;
        }

    }


    public static void main(String[] args){

        int scores[]={85,70,95,60,88};


        insertionSort(scores);
        int swaps = bubbleSort(scores);


        System.out.println("Sorted Scores:");

        for(int x:scores)
            System.out.print(x+" ");

    }
}
}