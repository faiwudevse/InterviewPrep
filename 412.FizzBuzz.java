class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for (int num = 1; num <= n; num++) {
            boolean divisbleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisbleBy3 && divisibleBy5) {
                ans.add("FizzBuzz");
            } else if (divisbleBy3) {
                ans.add("Fiizz");
            } else if (divisibleBy5) {
                ans.add("Buzz");
            } else {
                ans.add(Integer.toString(num));
            }
        }
        
        return ans;
    }
}