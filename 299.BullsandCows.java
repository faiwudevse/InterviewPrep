class Solution {
    /*
    time complexity: O(n)
    space complexity: O(1)
    thought process: iterate both secret and guess, if they both equal add bulls, else use the number array to 
    keep track of number appear for secret and guess; Increment for secret number and Decrement for guess number;
    add cows when the secret number is negative in the tracking number as well as 
    add cows when the guess number is postive in the tracking number 
    */
    public String getHint(String secret, String guess) {
        int cow = 0;
        int bull = 0;
        int[] number = new int[secret.length()];
        for (int i = 0; i < secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));

            if (s == g) {
                bull++;
            } else {
                if (number[s] < 0) cow++;
                if (number[g] > 0) cow++;
                number[s]++;
                number[g]--;
            }
            return bull + "A" + cow + "B";
        }

    }
}