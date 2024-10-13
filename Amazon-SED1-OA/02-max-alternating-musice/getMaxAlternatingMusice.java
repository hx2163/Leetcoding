public static int getMaxAlternatingMusic(String music, int k) {
    int n = music.length();
    char[] chars = music.toCharArray();
    int maxLen = 0;

    // ��������ģʽ�ֱ����
    maxLen = Math.max(maxLen, maxAlternating(chars, k, '0'));
    maxLen = Math.max(maxLen, maxAlternating(chars, k, '1'));

    return maxLen;
}

private static int maxAlternating(char[] chars, int k, char startChar) {
    int n = chars.length;
    int maxLen = 0;
    int left = 0;
    int diffCount = 0;

    for (int right = 0; right < n; right++) {
        // ���㵱ǰλ��Ӧ�е��ַ�
        char expectedChar = ((right % 2 == 0) ? startChar : (startChar == '0' ? '1' : '0'));
        if (chars[right] != expectedChar) {
            diffCount++;
        }

        // ����Ҫ��ת���ַ������� k���ƶ���ָ����С����
        while (diffCount > k) {
            char leftExpectedChar = ((left % 2 == 0) ? startChar : (startChar == '0' ? '1' : '0'));
            if (chars[left] != leftExpectedChar) {
                diffCount--;
            }
            left++;
        }

        // ������󳤶�
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}

