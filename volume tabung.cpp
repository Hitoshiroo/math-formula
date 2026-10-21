#include <iostream>
#define phi 22/7
#define t 28
using namespace std;

int main() {
  double v, r;
  cout<<"jari-jari: ";
  cin>>r;
  v = phi * (r * r) * t;
  cout<<"Volume Tabung adalah: "<<v<<endl;
  return 0;
}
