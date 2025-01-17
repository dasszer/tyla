import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

class A {
}

class B extends A {
}

class C extends B {
}

class Tp2q7
{
    // FIXME-begin
    public static List<Class<?>> listInheritance(Class<?> a)
    {
        List<Class<?>> list = new ArrayList();
        Class<?> curr = a;
        Class<?> toadd = a;
        list.add(a);
        while ((toadd = curr.getSuperclass()) != null) {
            list.add(toadd);
            curr = toadd;
        }
        return list;
    }
    // FIXME-end

    public static void main(String args[])
    {
        for (Class<?> c : listInheritance(C.class))
            System.out.println(c.getName());

        System.out.println("---");

        for (Class<?> c : listInheritance(B.class))
            System.out.println(c.getName());
        System.out.println("---");
    }
}