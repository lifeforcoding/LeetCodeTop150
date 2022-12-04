public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> crr = new ArrayList<>();

            for (int j = 0; j < (i + 1); j++) {
                if (j == 0 || j == i)
                    crr.add(1);
                else {
                    crr.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(crr);
        }
        return ans;
    }
