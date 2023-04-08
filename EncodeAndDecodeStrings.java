
/**Problem Statement: Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.
Please implement encode and decode */

import java.util.List;
import java.util.ArrayList;

public class EncodeAndDecodeStrings {
    /*
     * @param strs: a list of strings
     * 
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        String res = "";
        for (String s : strs) {
            res += s.length() + "#" + s;
        }
        return res;
    }

    /*
     * @param str: A string
     * 
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        List<String> res = new ArrayList<String>();
        int i = 0, j;
        while (i < str.length()) {
            j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return res;
    }
}
