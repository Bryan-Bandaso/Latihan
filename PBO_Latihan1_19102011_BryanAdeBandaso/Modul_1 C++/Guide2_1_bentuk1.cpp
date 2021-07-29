#include <iostream>
#include <conio.h>

// Bryan Ade Bandaso
// 19102011

using namespace std;

class Welcome
{
public:
    void display()
    {
        cout << " Selamat Datang di Praktikum PBO " << endl;
    }
};

int main()
{
    Welcome W;
    W.display();
    getch();
    return 0;
}
