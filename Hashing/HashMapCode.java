import java.util.*;
public class HashMapCode {
    static class HashMap<K,V>{
        private class Node{
            K Key;
            V value;
            public K key;
            public Node(K key, V value){
                this.Key = key;
                this.value = value;
            }
        }
        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }
        private int SearchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for(int i=0 ; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;
            for(int i=0 ; i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
            // nodes -> add in bucket
            for(int i=0; i<oldBucket.length ;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j =0 ;j<ll.size(); j++){
                    Node node = ll.remove();
                    put(node.key , node.value);
                }
            }
        }
        public void put(K key, V value){
            int bi = hashFunction(key); // index must be 0 to size-1
            int di = SearchInLL(key,bi); // valid index milega aagr key exist kregi pehla sa toh vrna -1 milega
           
            if(di != -1){
              Node node = buckets[bi].get(di);
              node.value = value;
            }
            else{
              buckets[bi].add(new Node(key,value));
              n++;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
               rehash();
            }
        }
        public boolean containsKey(K key){
            return false;
        }
        public V remove(K key){
            return null;
        }
        public V get(K key){
            return null;
        }
    }
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",200);
        hm.put("Indonesia",150);
        hm.put("Nepal",250);
        hm.put("Bhutan",300);
    }
}
