class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int open = 0, close = 1;
        List<int[]> events = new ArrayList<>();
        
        for (int[] interval : intervals) {
            events.add(new int[]{interval[0], open});
            events.add(new int[]{interval[1], close});
        }

        events.sort((e1, e2) -> {
            if (e1[0] != e2[0]) {
                return e1[0] - e2[0];
            } else {
                // 如果时间相同，将关闭事件排在前面，以确保在计数时先减去
                return e2[1] - e1[1];
            }
        });

        int count = 0, max = 0;
        for (int[] e : events) {
            if (e[1] == open) {
                count++;
            } else if (e[1] == close) {
                count--;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}