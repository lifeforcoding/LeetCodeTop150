public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        Arrays.sort(strs);
        if (strs[0].length() == 0) return "";
        //Here we take teh 1st and last string after sorting the array, the reason behind this is the char common in both of them
        //will also common with all the string between them
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i))
                break;
            else c++;
        }
        return first.substring(0, c);
    }
