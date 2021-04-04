package com.demo.project.stringCode;
// # 1417. Reformat The String =================================== //
public class ReformatTheString {
    public String reformat(String s) {
        char arr[] = s.toCharArray(), res[] = new char[s.length()];
        int diff = 0, d = 1, l = 0;

        for (char c : arr) {
            if (Character.isDigit(c)) diff++;
            if (Character.isLetter(c)) diff--;
        }

        if (diff == 0 || diff == 1 || diff == -1) {
            if (diff > 0) {
                d = 0;
                l = 1;
            }
            for (char c : arr) {
                if (Character.isDigit(c)) {
                    res[d] = c;
                    d = d + 2;
                }
                if (Character.isLetter(c)) {
                    res[l] = c;
                    l = l + 2;
                }
            }
            return new String(res);
        }
        return "";
    }
}
