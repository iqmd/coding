#include <bits/stdc++.h>
#include <cctype>
#include <unordered_map>

using namespace std;

struct ListNode {
  int val;
  ListNode *next;
  ListNode() : val(0), next(nullptr) {}
  ListNode(int x) : val(x), next(nullptr) {}
  ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
  void reorderList(ListNode *head) {
    vector<ListNode *> nodes;

    ListNode *curr = head;

    while (curr != nullptr) {
      nodes.push_back(curr);
      curr = curr->next;
    }

    int i = 0;
    int j = nodes.size() - 1;

    while (i < j) {
      ListNode *next_elem = nodes[i]->next;
      nodes[i]->next = nodes[j];
      nodes[j]->next = next_elem;
      i++;
      j--;
    }
    if (nodes.size() % 2 == 0) {
      nodes[j]->next = nodes[i];
      nodes[i]->next = nullptr;
    } else {
      nodes[j]->next = nullptr;
    }
  }
};

int main() {

  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

#ifndef ONLINE_JUDGE
  // for getting input from input.txt
  freopen("input.txt", "r", stdin);
  // for writing output to output.txt
  freopen("output.txt", "w", stdout);
#endif

  Solution sol;
  return 0;
}
