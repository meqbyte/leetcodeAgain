package org.example;

import java.util.Stack;

public class Trap {

    class Unit {
        int index;
        int height;

        public Unit(int index,int height) {
            this.index = index;
            this.height = height;
        }

    }

    public int trap(int[] height) {

        if (height.length == 0) {
            return 0;
        }

        Stack<Unit> stack = new Stack<>();
        stack.push(new Unit(0, height[0]));

        int total = 0;
        for (int i = 1; i < height.length; i++) {

            if (stack.isEmpty()) {
                stack.push(new Unit(i, height[i]));
                continue;
            }

            Unit left = stack.peek();
            int currHeight = height[i];

            if (currHeight < left.height) {

            } else {
                int rightIndex = i;

                System.out.println("left = " + left.index + ", right = " + rightIndex);

                int sum = 0;
                for (int j = left.index + 1; j < rightIndex; j++) {
                    // bug
//                    sum = sum + height[j] - left.height;
                    sum = sum +  left.height - height[j];
                }
                total += sum;
                stack.pop();
            }

        }

        return total;
    }

    public static void main(String[] args) {
        Trap trapSolver = new Trap();

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = trapSolver.trap(height);

        System.out.println("Trapped water: " + result);
    }

}
