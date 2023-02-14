public class SelectionSort {
    
    public static void sort(int arr []){
        for(int i=0;i<5;i++){
            int max = 100000;
            int index = 0;
            for(int j=i;j<5;j++){
                if(arr[j]<max){
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = max;
        }
    }
    public static void main(String args[]){
        int[] str = {3, 1, 5, 2, 4};
        sort(str);
        for (int p : str) {
            System.out.println(p);
        }
    }
}   

