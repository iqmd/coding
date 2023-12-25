#include <deque>
#include <iostream>
#include <queue>
#include <stack>

using namespace std;

auto main(int argc, char *argv[]) -> int {
    priority_queue<int> pq(greater<int>);
    pq.push(3);
    pq.push(4);
    pq.push(8);
    pq.push(1);
    for(; !pq.empty(); pq.pop()){
        cout << pq.top() << endl;
    }
    return 0;
}
