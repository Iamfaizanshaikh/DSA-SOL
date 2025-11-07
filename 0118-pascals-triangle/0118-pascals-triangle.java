class Solution {

    public static long combination(int n, int r) {
        if (r > n - r)
            r = n - r; // because nCr = nC(n - r)

        long result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                row.add((int) combination(i, j));
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> result = s.generate(5);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
