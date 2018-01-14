#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int N;
    cin >> N;
    int givenArray[N];
    for (int i=0; i<N; i++)
        cin >> givenArray[i];
    unordered_map <int, int> nums;
    for (int i=0; i<N; i++)
        nums[givenArray[i]] = nums[givenArray[i]] + 1; 
    long countPairs = 0;
    for (auto i=nums.begin(); i!=nums.end(); i++)
    {
        long countI = i->second;
        countPairs = countPairs + (countI * (countI-1));
    }
    countPairs = countPairs/2;
    cout << countPairs;
}
