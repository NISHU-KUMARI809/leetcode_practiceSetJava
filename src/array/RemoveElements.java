package array;
public class RemoveElements {
    public static int remove_ele(int arr[],int val){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,67,6};
        int val=5;
        System.out.println(remove_ele(arr,val));
    }
}
