/*
 * Creating a copy using the clone() method
 * i) Usage of clone() method -Shallow Copy
 */
package collection_framework.arrayList_methods.clone_method;

//An object reference of this class is contained by Test2
class Test{
    int x, y;
}

//contains a reference of Test and
//implements clone with shallow copy
class Test2 implements Cloneable{
    int a;
    int b;
    Test c = new Test();
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Example2 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Test2 t = new Test2();
        t.a = 10;
        t.b = 20;
        t.c.x = 30;
        t.c.y = 40;

        Test2 t2 = (Test2)t.clone();

        //creating a copy of object t
        //and passing it to t2
        t2.a = 100;

        //change in primitive type of t2 will
        //not be reflected in t1 field
        t2.c.x = 300;
    
        //change in object type field will be reflected
        //in both t2 and t(shallow copy)
        System.out.println(t.a+" "+t.b+" "+t.c.x+" "+t.c.y);
        System.out.println(t2.a+" "+t2.b+" "+" "+t2.c.x+" "+t2.c.y);
    }
}
