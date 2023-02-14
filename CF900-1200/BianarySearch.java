public class BianarySearch {
    static int search(int array[], int i){
        int l = 0;
        int r = array.length - 1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(array[m] == i)
                return m;
            if(array[m]<i)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int i = 1;
        System.out.println(search(array, i));
    }    
}
