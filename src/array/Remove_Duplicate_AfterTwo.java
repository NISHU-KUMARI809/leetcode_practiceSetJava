package array;

public class Remove_Duplicate_AfterTwo {
    public static int removeDup(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count<2 || arr[i]!=arr[count-2]){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,3,4,4,5,5};
        System.out.print(removeDup(arr));
    }
}
