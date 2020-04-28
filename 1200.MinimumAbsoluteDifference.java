class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new LinkedList();

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if ( diff < min) {
                min = diff;
                ans.clear();
                ans.add(Arrays.asList(arr[i + 1], arr[i]));
            } else if (diff == min){
                ans.add(Arrays.asList(arr[i + 1], arr[i]));
            }
        }

        return ans;
    }
}