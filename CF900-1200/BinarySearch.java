public class BinarySearch {
    
    public static int search(int arr[], int a){
        int l = 0;
        int r = arr.length - 1;
        while(l<=r){
            int meio = (l+r)/2;
            if(a>arr[meio])
                l = meio + 1;
            else if(a<arr[meio])
                r = meio - 1;
            else if(a==arr[meio])
                return meio;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = 10;
        search(arr, index);
        System.out.println(search(arr, index));
    }
}
