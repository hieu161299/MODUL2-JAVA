public class CopyArray {
    public static void main(String[] args) {

        //Bạn có thể viết một vòng lặp để sao chép mọi phần tử từ mảng nguồn sang phần tử tương ứng trong mảng đích.
        // Ví dụ, đoạn mã sau sao chép sourceArray sang targetArray sử dụng vòng lặp for.

        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
       /* for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        for (int i = 0 ; i < targetArray.length ; i++) {
            System.out.println(targetArray[i]);
        }*/
        // cách 2 sử dụng phương thức array copy

        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);
        for (int i = 0 ; i < targetArray.length ; i++) {
            System.out.println(targetArray[i]);
        }
    }
}
