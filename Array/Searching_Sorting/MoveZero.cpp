#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void MoveZero(int arr[],int n){
  int nonZeroindex = 0;
  for(int i=0; i<n; i++){
    if(arr[i]!=0){
      swap(arr[i], arr[nonZeroindex]);
      nonZeroindex++;
    }
  }
}

int main() {
  int arr[] = {1,0,3,4,0,8,0,2,3,14};
  int n = sizeof(arr)/sizeof(arr[0]);
  MoveZero(arr, n);
  for(int i=0; i<n; i++){
    cout<<"After Moving Zero : "<<arr[i]<<endl;
  }
} 