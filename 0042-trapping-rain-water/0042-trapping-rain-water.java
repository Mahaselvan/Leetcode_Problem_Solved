class Solution {
    public int trap(int[] height) {
        int waterTrap = 0;
        int n = height.length;

        int start[] = new int[n];
        start[0] = height[0];
        for (int i = 1; i < n; i++) {
            start[i] = Math.max(start[i - 1], height[i]);
        }

        int end[] = new int[n];
        end[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            end[i] = Math.max(height[i], end[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(start[i], end[i]);
            waterTrap += Math.max(0, waterLevel - height[i]);
        }

        return waterTrap;
    }

    
    }
    
