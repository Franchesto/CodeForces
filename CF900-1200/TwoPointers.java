public class TwoPointers {
    public static int poiters(int arr[], int x){
        int i = 0;
        int j =arr.length - 1;
        while(i<j){
            int soma = arr[i] + arr[j];
            if(soma > x)
                j --;
            else if(soma < x)
                i ++;
            else
                return soma;
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = 15;
        poiters(arr, soma);
        System.out.println(poiters(arr, soma));
    }
}
