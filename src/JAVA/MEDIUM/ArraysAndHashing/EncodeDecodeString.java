package JAVA.MEDIUM.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {
    //https://neetcode.io/problems/string-encode-and-decode/question?list=neetcode150
    class Solution {
        //dummy_input = ["Hello","World"]
        public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();

            for (String str : strs) {
                sb.append(str.length()).append("#").append(str);
            }

            return sb.toString();
        }

    }

}
