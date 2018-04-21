template <class T> class PicVector
{
public:
explicit PicVector(size_t n); // initialize to hold n objects with value T
T& operator[] (size_t);

};

template <class T> class PicList
{
public:
class Link{};
PicList();   // initially empty
void put(T*);
T* get(); // get current element
};

template<class T> class PicItor
{
public:
virtual T* first() = 0; // pointer to first element
virtual T* next() = 0;

}
