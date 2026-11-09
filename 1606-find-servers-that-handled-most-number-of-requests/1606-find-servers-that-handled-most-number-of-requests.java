class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        int[] count = new int[k];

        TreeSet<Integer> available = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            available.add(i);
        }

        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> a[0] - b[0]
        );

        for (int i = 0; i < arrival.length; i++) {

      
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                int[] curr = busy.poll();
                available.add(curr[1]);
            }

            if (available.isEmpty()) {
                continue;
            }

            int start = i % k;

            Integer s = available.ceiling(start);

            if (s == null) {
                s = available.first();
            }

            available.remove(s);

            count[s]++;

            busy.offer(new int[]{
                arrival[i] + load[i], s
            });
        }

        int max = 0;

        for (int num : count) {
            max = Math.max(max, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (count[i] == max) {
                ans.add(i);
            }
        }

        return ans;
    }
}