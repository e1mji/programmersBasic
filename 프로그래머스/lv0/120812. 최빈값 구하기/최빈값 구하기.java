class Solution {
    static int solution(int[] array) {
        int maxFrequency = 0;
        int mode = -1;

        for (int i = 0; i < array.length; i++) {
            int frequency = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency++;
                }
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = array[i];
            } else if (frequency == maxFrequency && array[i] != mode) {
                mode = -1; // 다중 모드이므로 mode를 -1로 설정합니다.
            }
        }

        return mode;
    }

 
}
