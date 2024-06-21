class Hello {
    public static void main(String a[]) {
        // int num1 = 3;    // = assignment operator 
        // int num2 = 5;
        // int sum = num1 + num2;
        // System.out.println(sum);

        // float marks1 = 5.6f;
        // double marks2 = 5.6;
        // int num = 343;
        // byte num3 = 127;
        // long num5 = 949499444;
        // short sh = 9999;

        // boolean num = 1;  //error 
        // boolean num3 = true; 

         // Integer Literals
        //  int decimal = 100;
        //  int hex = 0x64;
        //  int octal = 0144;
        //  int binary = 0b1100100;
         
        //  // Floating-Point Literals
        //  float floatNumber = 3.14f;
        //  double doubleNumber = 2.71828;
         
        //  // Character Literals
        //  char letter = 'A';
        //  char unicodeChar = '\u0041';
         
        //  // String Literal
        //  String greeting = "Hello, World!";
         
        //  // Boolean Literal
        //  boolean isJavaFun = true;
         
        //  // Null Literal
        //  String str = null;
         
        //  // Printing literals
        //  System.out.println("Decimal: " + decimal);
        //  System.out.println("Hexadecimal: " + hex);
        //  System.out.println("Octal: " + octal);
        //  System.out.println("Binary: " + binary);
        //  System.out.println("Float: " + floatNumber);
        //  System.out.println("Double: " + doubleNumber);
        //  System.out.println("Char: " + letter);
        //  System.out.println("Unicode Char: " + unicodeChar);
        //  System.out.println("String: " + greeting);
        //  System.out.println("Boolean: " + isJavaFun);
        //  System.out.println("Null: " + str);

        //Lecture 8 
        //Conversion in Java & Casting 

        // float num1 = 3.5f;
        // int num2 = 345;
        // num2 = (int) num1;  //Casting 
        // System.out.println(num2);

        int num = 7;
        // num++; // post increment 
        // ++num; // pre increment 
        // num --; // decrement 
        // int result = ++num;  // first increment and then fetch the value
        int result = num++;  // fetch the value and then increment 
        System.out.println(num);

    }
}