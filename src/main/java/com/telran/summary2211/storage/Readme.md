
n - count, ArrayList

for(int i = 0; i < list.size(); i ++ ) { //int i = 0; O(1), i < list.size() O(n), i++ n
        int temp = list.get(i);  // O(1) * n
}

O(1) + O(n) + O(n) + O(1) * n = O(1) + (3 * O(n)) = 3 O(n) = O(n)

for(int i = 0; i < 10; i ++ ) {  //int i = 0; O(1), i < 10 O(1), i++ O(1)
        int temp = list.get(i); // O(1) ** 10
}