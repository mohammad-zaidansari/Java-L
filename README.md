# Components of Java
### Java Development Kit (JDK): 
A software development kit that includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed for Java development.

### Java Runtime Environment (JRE): 
Provides the libraries, Java Virtual Machine (JVM), and other components necessary for running applications written in Java. The JRE does not contain tools and utilities such as compilers or debuggers for developing Java applications.

### Java Virtual Machine (JVM): 
An abstract computing machine that enables a computer to run a Java program. The JVM performs tasks such as loading code, verifying code, executing code, and providing runtime environment.

# Java
Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It is a widely used language in the world of software development. Here are some key features and aspects of Java:
> [!NOTE]
> WORA : Write once run any where.

# Data Types in Java

In Java, data types are classified into two main categories: primitive data types and reference (or non-primitive) data types.

**Primitive Data Types**

Java has eight primitive data types, which are predefined by the language and named by a reserved keyword.

***byte***
```
Size: 1 byte (8 bits)
Range: -128 to 127
Example: byte b = 100;
```

***short***
```
Size: 2 bytes (16 bits)
Range: -32,768 to 32,767
Example: short s = 10000;
```

***int***
```
Size: 4 bytes (32 bits)
Range: -2^31 to 2^31 - 1
Example: int i = 100000;
```

***long***
```
Size: 8 bytes (64 bits)
Range: -2^63 to 2^63 - 1
Example: long l = 100000L;
```
***float***
```
Size: 4 bytes (32 bits)
Range: approximately ±3.40282347E+38F (6-7 significant decimal digits)
Example: float f = 234.5f;
```

***double***
```
Size: 8 bytes (64 bits)
Range: approximately ±1.79769313486231570E+308 (15 significant decimal digits)
Example: double d = 123.4;
```
***char***
```
Size: 2 bytes (16 bits)
Range: 0 to 65,535 (unsigned)
Example: char c = 'A';
```
***boolean***
```
Size: JVM dependent (commonly 1 bit or 1 byte)
Values: true or false
Example: boolean b = true;
```

**Reference Data Types**

Reference data types are constructed types that refer to objects. These include classes, interfaces, arrays, and enums. They store references to the memory locations where the actual data is held.

***class***
```
class MyClass {
    int num;
    String name;
}
MyClass obj = new MyClass();
```

***interface***
```
interface MyInterface {
    void display();
}
class MyClass implements MyInterface {
    public void display() {
        System.out.println("Hello");
    }
}
```
***Arrays***
```
Example: int[] arr = new int[10];
```

***Enum***
```
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
Day day = Day.MONDAY;
```

# Type of Literals

***Integer Literals***
```
Decimal: Base 10 (0-9)
Example: int a = 100;
Hexadecimal: Base 16 (0-9, A-F)
Example: int b = 0x64; (equivalent to 100 in decimal)
Octal: Base 8 (0-7)
Example: int c = 0144; (equivalent to 100 in decimal)
Binary: Base 2 (0-1)
Example: int d = 0b1100100; (equivalent to 100 in decimal)
```

***Floating-Point Literals***
```
Float (suffix f or F is used)
Example: float pi = 3.14f;
Double (default type for floating-point numbers)
Example: double e = 2.71828;
```

***Character Literals***
```
Single characters enclosed in single quotes
Example: char letter = 'A';
Unicode representation
Example: char unicodeChar = '\u0041'; (equivalent to 'A')
```

***String Literals***
```
Sequence of characters enclosed in double quotes
Example: String greeting = "Hello, World!";
```

***Boolean Literals***
```
Two possible values: true and false
Example: boolean isJavaFun = true;
```

***Null Literal***
```
Represents a null reference (not pointing to any object)
Example: String str = null;
```
# Examples and Usage
```
public class LiteralsExample {
    public static void main(String[] args) {
        // Integer Literals
        int decimal = 100;
        int hex = 0x64;
        int octal = 0144;
        int binary = 0b1100100;
        
        // Floating-Point Literals
        float floatNumber = 3.14f;
        double doubleNumber = 2.71828;
        
        // Character Literals
        char letter = 'A';
        char unicodeChar = '\u0041';
        
        // String Literal
        String greeting = "Hello, World!";
        
        // Boolean Literal
        boolean isJavaFun = true;
        
        // Null Literal
        String str = null;
        
        // Printing literals
        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + octal);
        System.out.println("Binary: " + binary);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Char: " + letter);
        System.out.println("Unicode Char: " + unicodeChar);
        System.out.println("String: " + greeting);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("Null: " + str);
    }
}
```

## Key Features
Platform Independence: Java programs are compiled into bytecode, which can run on any device equipped with a Java Virtual Machine (JVM). This means that Java programs can be written once and run anywhere (WORA).

### Object-Oriented: 
Java is based on the object-oriented programming (OOP) paradigm, which helps in organizing complex programs into manageable pieces. Key OOP concepts include inheritance, polymorphism, encapsulation, and abstraction.

### Simple and Familiar: 
Java syntax is similar to C++ and C, which makes it easier for programmers to learn and use. However, Java removes many complex features of C++, such as pointers and multiple inheritance.

### Robust and Secure: 
Java has strong memory management and a robust exception handling mechanism. It also has a security model that allows the creation of virus-free, tamper-free systems.

### Multithreading:
Java has built-in support for multithreading, which allows concurrent execution of two or more threads. This is useful for performing multiple tasks simultaneously, improving the performance of applications.

### Dynamic: 
Java programs can carry a large amount of runtime information that can be used to verify and resolve accesses to objects at runtime. This makes Java more dynamic than other programming languages.



## Usage
Java is used in various domains such as:

### Web Development: 
Through frameworks like Spring, Hibernate, and Struts.
### Mobile Development: 
Especially Android apps are primarily written in Java.
### Enterprise Applications: 
Large-scale applications in sectors like banking, finance, retail, and healthcare.
### Embedded Systems: 
Java is used in devices like smart cards and sensors.
### Big Data Technologies: 
Hadoop and other big data technologies use Java.

