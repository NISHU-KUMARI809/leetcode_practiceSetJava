package array;
public class RemoveDuplicate {
    public static int removeDup(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(i<arr.length && arr[i]==arr[i+1]){
                continue;
            }
            else{
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5};
        System.out.println(removeDup(arr));

    }
}
