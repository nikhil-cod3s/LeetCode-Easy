

public class RemoveDuplictatesFromArraySorted {
    public static void main(String[] args){
        int[] numbers = {1, 1, 2};
        removeDuplicate(numbers);
    }

    private static int removeDuplicate(int[] array) {
        int k = 0;
        int prevNum = 0;
        for(int i = 1; i < array.length; i++ ){
            if(array[i] == array[prevNum]){
                
            }
        }
        return k;
    }
}
