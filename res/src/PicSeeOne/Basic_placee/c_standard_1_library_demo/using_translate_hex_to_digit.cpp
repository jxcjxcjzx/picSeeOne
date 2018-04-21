#include "translate_hex_to_digit.h"
#include <iostream>
using namespace std;
main()
{
char xdigs[] = "12345ABCE3";
long sum;

sum = atox_more_simplified(xdigs);
cout<<sum<<endl;

sum = atox(xdigs);
cout<<sum<<endl;

sum = atox_simplified(xdigs);
cout<<sum<<endl;

}
