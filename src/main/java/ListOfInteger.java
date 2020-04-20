import java.util.ArrayList;
import java.util.List;

public class ListOfInteger {
    public  List<Integer> numbers(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

}
