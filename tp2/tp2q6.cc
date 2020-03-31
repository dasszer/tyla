#include <iostream>

class telephone
{
public:
  void decrocher()
  {
    // FIXME-begin
    std::cout << "telephone_mural::telephone_decrocher_impl\n";
    // FIXME-end
  }

private:
  // FIXME-begin
  // FIXME-end
};

class objet_mural
{
public:
  void decrocher()
  {
    // FIXME-begin
    std::cout << "telephone_mural::objet_mural_decrocher_impl\n";
    // FIXME-end
  }

private:
  // FIXME-begin
  // FIXME-end
};

class telephone_mural: private objet_mural, private telephone
{
public:

  void decrocher_telephone()
  {
    // FIXME-begin
    telephone_.decrocher();
    // FIXME-end
  }

  void decrocher_objet_mural()
  {
    // FIXME-begin
    objet_mural_.decrocher();
    // FIXME-end
  }

private:
  // FIXME-begin
  telephone telephone_;
  // FIXME-end

  // FIXME-begin
  objet_mural objet_mural_;
  // FIXME-end
};


int main()
{
  telephone_mural* t = new telephone_mural();

  std::cout << "---" << std::endl;
  t->decrocher_telephone();

  std::cout << "---" << std::endl;
  t->decrocher_objet_mural();

  std::cout << "---" << std::endl;
  ((telephone*) t)->decrocher();

  std::cout << "---" << std::endl;
  ((objet_mural*) t)->decrocher();

  delete t;
}