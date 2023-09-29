package leetCode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int indexFound = -1;

        if (target < nums[0]) {
            indexFound = 0;
        }else{
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    indexFound = i;
                }
            }
    
            if (indexFound == -1) {
                for (int i = 0; i < nums.length; i++) {
    
                    if (nums[i] < target) {
                        indexFound = i + 1;
                    }
                }
            }
        }

        return indexFound;
    }
}
