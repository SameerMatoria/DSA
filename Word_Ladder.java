class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>();
        for (String str : wordList) {
            set.add(str);
        }
        Queue<Pair<String, Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(beginWord, 1));
        while (!q.isEmpty()) {
            Pair<String, Integer> pair = q.poll();
            StringBuilder s = new StringBuilder(pair.getKey());
            if (s.toString().equals(endWord))
                return pair.getValue();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    s.setCharAt(i, (char) (j + 97));
                    if (set.contains(s.toString())) {
                        q.offer(new Pair<>(s.toString(), pair.getValue() + 1));
                        set.remove(s.toString());
                    }
                }
                s = new StringBuilder(pair.getKey());
            }
        }
        return 0;
    }
}
