#include <iostream>

// Bryan Ade Bandaso
// 19102011

using namespace std;

class Mahasiswa
{
private:
    char nama[20];
    char nim[20];

public:
    void inputData();
    void display();
};

void Mahasiswa::inputData()
{
    cout << "\n-Input Data Mahasiswa-" << endl;
    cout << "Masukkan Nama Mahasiswa : ";
    cin >> nama;
    cout << "Masukkan Nomor Induk Mahasiswa : ";
    cin >> nim;
}

void Mahasiswa::display()
{
    cout << "\n-Display Data Mahasiswa-"<< endl;
    cout << "Nama : " << nama << endl;
    cout << "NIM : " << nim << endl;
}

int main()
{
    Mahasiswa mhs;
    mhs.inputData();
    mhs.display();
    return 0;
}
