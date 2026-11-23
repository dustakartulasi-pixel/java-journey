// package Week13-Collection;

import java.util.ArrayList;

public class ArList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums);
        System.out.println(nums.get(1));
        nums.add(1, 20);
        System.out.println(nums);
        System.out.println(nums.isEmpty());
        System.out.println(nums.remove(1));
        System.out.println(nums);
        System.out.println(nums.indexOf(30));
    }
}
