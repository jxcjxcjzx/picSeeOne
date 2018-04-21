// here we use the template, which make it appliable to 
// more kinds of variable inputs

template <typename T>

bool LargerThan(const T* a,const T* b)
{
return false;
}

void Insert_Sort(T* Input,int len)
{

}

void Select_Sort(T* Input,int len)
{

}


void Exchange_Sort(T* Input,int len)
{

}

void Bubble_Sort(T* Input,int len)  // this is the bubble sort algorithm, the bubble, just rising from bottom to top
{
int i,j,temp;
for(i=0;i<len;i++)
{
for(j=0;j<len-i;j++)
{
if(Input[j]>Input[j+1])
{
temp = Input[j]; Input[j] = Input[j+1]; Input[j+1] = temp;
}
}
}
}

void Improved_Bubble_Sort(T* Input,int len)  //this function improves the bubble sort 
{
int i,j;
int sentry = 0;  // the sentry to record something, for sorting
Boolean exchange; // this is the key in the improvement
for(i=0;i<len;i++)
{
exchange = false;
for(j=len-1;j>=i;j--)
{
if(Input[j+1]<Input[j]) // agaiin, if the template variable type is a struct, we should define the big-small compare function for it
{
// make a adjustment
sentry = Input[j+1];
Input[j+1] = Input[j];
Input[j] = Input[0];
exchange = true;
}
if(!exchange)
return;
}
}
}

void Shell_Sort(T* Input,int left,int right)
{
int len = right-left+1;
int d = len;
while(d>1)
{
d = (d+1)/2;
for(int i=left;i<right+1-d;i++)
{
if(Input[i+d]<Input[i])
{
int temp = Input[i+d];
Input[i+d] = Input[i];
Input[i] = temp;
}
}
}
}

void Shell_Another(T* Input,int d,int len) // the variable d is the current bias
{
for(i=d+1;i<=n;i++)
{
if(Input[i]<Inputp[)
}

}


void Merge_Sort(T* Input,int len)
{

}


void Alloc_Sort(T* Input,int len)
{


}

void Quick_sort(T* Input,int low,int high) // this function rely on the latter fucntion called Partition, which gives the partition result for it.
{
int pivotpos;   // the position of the base index value after partition
if(low<high)
{
pivotpos = Partition(Input,low,high);

Quick_sort(Input,low,povotpos-1);
Quick_sort(Input,povotpos+1,high);
}

}

int Partition(T* Input,int i,int j)  // i is the lower index while j is the higher index
{
T pivot = Input[i];
while(i<j)
{
while(i<j&&Input[j]>pivot) // if the Input type 'T' is a struct, we should define the big-small compare function for the struct 
{
j--;
}
if(i<j)
Input[i++]=Input[j];

while(i<j&&Input[i]<=pivot)
{
i++;
}
if(i<j)
Input[j--] = Input[i];
}
Input[i] = pivot;
return i;
}
