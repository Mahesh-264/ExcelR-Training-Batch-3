 public class Demo064 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        arr[0]= arr[0] + arr[arr.length - 1];
        arr[arr.length - 1]= arr[0] - arr[arr.length - 1];
        arr[0] =arr[0] - arr[arr.length - 1];
        System.out.println("After Swapping first index is : "+arr[0]+"and last index is :  "+arr[arr.length-1]);
        }
}
