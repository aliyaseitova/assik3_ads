public class MyHashTable<K, V> {
    private class HashNode<K, V>{
        private class HashNode <K, V> {
            private K key;
            private V value;
            private MyHashTable.HashNode<K, V> next;

            public MyHashTable.HashNode<K key, V value> {
                this.key = key;
                this.value = value;
            }
            @Override
            public String toString(){
                return "{" + key + " " + value + "}";
            }
        }
    }
    private HashNode<K, V>[] chainArray;
    private int M = 11;
    private int size;
    public MyHashTable(){}
    public MyHashTable(int M){}
    private int hash(K key){}
    public void put(K key, V value){}
    public V get(K key){}
    public V remove(K key){}
    public boolean contains(V value){}
    public K getKey(V value){}
}
