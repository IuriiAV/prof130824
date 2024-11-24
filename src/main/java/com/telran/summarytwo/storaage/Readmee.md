n - count, ArrayList


for(int i = 0; i < list.size(); i++) { // int i = 0; 0(1), i<list.size() n , i++ n
          int temp = list.get(i); // 0(1) * n 
}

0(1) + 0(n) + 0(n) + 0(1) * n = 0(1) +3*0(n) = 3 0(n) = O(n)


for(int i = 0; i < 10; i++) { // 0(1)
int temp = list.get(i); // 0(1) ** 10
}