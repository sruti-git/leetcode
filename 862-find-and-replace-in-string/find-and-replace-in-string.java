class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        String[] replace = new String[n];
        int[] skip = new int[n];
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            if (s.startsWith(sources[i], idx)) {
                replace[idx] = targets[i];
                skip[idx] = sources[i].length();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ) {
            if (replace[i] != null) {
                sb.append(replace[i]);
                i += skip[i];
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}
