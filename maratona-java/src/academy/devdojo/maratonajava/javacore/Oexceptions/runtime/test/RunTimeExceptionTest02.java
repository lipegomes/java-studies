package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(nums[1]);
        System.out.println(nums[2]); // Exception
    }
}
