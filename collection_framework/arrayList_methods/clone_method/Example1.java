/*
 * Using Assignment Operator to create a copy of the reference variable
 */
package collection_framework.arrayList_methods.clone_method;
    class Test{
        int x, y;
        Test()
        {
            x = 10;
            y = 20;
        }
    }
public class Example1 {
    public static void main(String[] args) {
    
        Test obj1 = new Test();
        System.out.println(obj1.x+" "+obj1.y);

        //creating a new reference variable obj2
        //pointing to same address as obj1
        Test obj2 = obj1;

        //Any change made in obj2 will
        //be reflected in obj1
        obj2.x = 100;

        System.out.println(obj1.x+" "+obj1.y);
        System.out.println(obj2.x+" "+obj2.y);
    }
}
