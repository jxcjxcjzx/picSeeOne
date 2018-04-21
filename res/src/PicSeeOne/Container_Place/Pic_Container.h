struct PicLink
{
PicLink* pre;
PicLink* syc;
};

class PicList
{
PicLink* head;
PicLink* curr;

public:
PicLink* get();
void put(PicLink*);
}
