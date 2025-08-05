class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                sb.append("G");
                i++;
            } else if (command.substring(i, i + 2).equals("()")) {
                sb.append("o");
                i += 2;
            } else if (command.substring(i, i + 4).equals("(al)")) {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }
}
