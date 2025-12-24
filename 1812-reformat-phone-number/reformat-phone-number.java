class Solution {
    public String reformatNumber(String number) {
        number = number.replace(" ", "").replace("-", "");
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (number.length() - i > 4) {
            sb.append(number.substring(i, i+3)).append("-");
            i += 3;
        }

        if (number.length() - i == 4) {
            sb.append(number.substring(i, i+2)).append("-");
            sb.append(number.substring(i+2));
        } else {
            sb.append(number.substring(i));
        }

        return sb.toString();
    }
}
