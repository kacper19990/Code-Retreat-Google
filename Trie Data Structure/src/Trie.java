public interface Trie {
    public int size();
    public Object put(String key, Object val);
    public Object get(String key);
    public void clear();
    public void delete(String key);
    public String longestPrefixOf(String input);
    public String[] getPrefixes(String prefix);

}
