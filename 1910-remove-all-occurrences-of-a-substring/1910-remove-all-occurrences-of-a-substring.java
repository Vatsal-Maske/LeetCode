class Solution {
    public String removeOccurrences(String s, String part) {

        StringBuilder str = new StringBuilder(s);

        while (str.indexOf(part) != -1) {

            int pos = str.indexOf(part);

            str.delete(pos, pos + part.length());
        }

        return str.toString();
    }
}