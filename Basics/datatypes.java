class datatypes
{
        public static void main(String a[])
        { 
             //float float1 = 1.6;//wont wrk (double sud be used)
             int num2 = 5;
             double d = 2.3;
             char c = 'A';
             byte by = 127;
             boolean b = true;
            //creates an error - float + int wont work
             System.out.println(d);
             System.out.println(c);
             System.out.println(by);
             System.out.println(b);

             //literals
             int num1 = 0b101;//displays binary 5
             System.out.println(num1);
             int num3 = 10_00_00_000;
             System.out.println(num3);

             boolean n = true;
             System.out.println(n);
}
}