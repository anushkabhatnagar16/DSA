import java.util.Arrays;

 public class _3insertNelement{
    public static void main(String[] args){
        int arr[]={1,2,3,5,6,7};
        int index=3;
        int element = 4;
        int n = arr.length;

        int newArr[] = new int[n+1];// creating a new arr ->arr(n+1)

        for (int i = 0;i<index; i++){
            newArr[i] = arr[i]; // work till 3 ele     
        }

        newArr[index] = element;

        for(int i = index;i<n;i++){
            newArr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}

// time complexity  = O(N)