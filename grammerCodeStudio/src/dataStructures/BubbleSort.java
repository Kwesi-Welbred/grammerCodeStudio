package dataStructures;

public class BubbleSort {
    public static int Sorting(int[]sort, int temp){
        int i, s;
        for(i=0; i<sort.length; i++){
            for (s=i+1; s<=sort.length-1; s++){
                if(sort[i]<=sort[s]){
                    //swap
                    temp = sort[s];
                    sort[s] = sort[i];
                    sort[i] = temp;

                }
            }
        }
        return Sorting(sort, temp);
    }
}
