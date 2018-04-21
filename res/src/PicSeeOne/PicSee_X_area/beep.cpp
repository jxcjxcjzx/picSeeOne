#include <iostream>
using namespace std;

ostream& beep(ostream& os)
{
os<<char(7);    // ascii beep noise
return os;
}

main()
{
cout<<beep<<endl;
}
