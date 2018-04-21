template <class BeingCounted>
class Counted
{
public:
class TooManyObjects{};  // used to be throwed out
static int objectCount(){return numObjects;}
protected:
Counted();
Counted(const Counted& rhs);
~Counted(){--numObjects;}
private:
static int numObjects;
static const size_t maxObjects;
void init();
};

template<class BeingCounted>
Counted<BeingCounted>::Counted()
{
init();
}

template<class BeingCounted>
void Counted<BeingCounted>::init()
{
if(numObjects>=maxObjects) throw TooManyObjects();
++numObjects;
}
