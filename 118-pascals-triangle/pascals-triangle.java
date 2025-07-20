class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = res.get(i - 1); // Previous row
            List<Integer> row = new ArrayList<>();

            row.add(1); // First element is always 1

            for (int j = 1; j < i; j++) {
                row.add(prev.get(j - 1) + prev.get(j)); // Middle elements
            }

            row.add(1); // Last element is always 1

            res.add(row);
        }

        return res;
    }
}
