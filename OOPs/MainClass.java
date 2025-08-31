package OOPs;

class Student {
    String name;
    int age;
    float marks;

    // Parameterized Constructor
    Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.marks = s.marks;
    }

    // Method to print student info
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }
}

public class MainClass {   // better than using 'const'
    public static void main(String[] args) {
        Student s1 = new Student("Tanush", 15, 88.5f);
        Student s2 = new Student("Ankit", 22, 78.5f);

        // Using copy constructor
        Student s3 = new Student(s1);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();  // should print the same as s1
    }
}
/*
    System.out.println('Non-positive');
}
        System.out.println('Non-positive');
        for(int i=0; i<10; i++) {
            System.out.println('Non-positive');
}
            System.out.println('Hello, World!');
                System.out.println('Positive');
                System.out.println('Hello, World!');
                    System.out.println('Non-positive');
                    for(int i=0; i<10; i++) {
                    System.out.println('Hello, World!');
} else {
} else {
     System.out.println(i);
}
         System.out.println(i);
}
         for(int i=0; i<10; i++) {
         if(x > 0) {
         System.out.println('Hello, World!');
         if(x > 0) {
} else {
     System.out.println('Non-positive');
} else {
     System.out.println(i);
         System.out.println('Positive');
             System.out.println('Non-positive');
                 System.out.println('Non-positive');
}
}
if(x > 0) {
System.out.println('Hello, World!');
for(int i=0; i<10; i++) {
    System.out.println('Positive');
        System.out.println(i);
            System.out.println(i);
} else {
     System.out.println('Non-positive');
} else {
     System.out.println(i);
     for(int i=0; i<10; i++) {
         System.out.println('Positive');
             System.out.println('Non-positive');
                 System.out.println('Non-positive');
                     System.out.println('Positive');
                         System.out.println('Non-positive');
                             System.out.println('Non-positive');
                             if(x > 0) {
} else {
 for(int i=0; i<10; i++) {
     System.out.println('Positive');
     System.out.println('Hello, World!');
         System.out.println(i);
             System.out.println('Non-positive');
             System.out.println('Hello, World!');
             if(x > 0) {
}
                 System.out.println('Non-positive');
                     System.out.println(i);
                     if(x > 0) {
                     System.out.println('Hello, World!');
                     if(x > 0) {
                         System.out.println('Non-positive');
                         for(int i=0; i<10; i++) {
                             System.out.println('Positive');
                             for(int i=0; i<10; i++) {
} else {
 for(int i=0; i<10; i++) {
 if(x > 0) {
 System.out.println('Hello, World!');
 for(int i=0; i<10; i++) {
 System.out.println('Hello, World!');
     System.out.println('Positive');
}
} else {
 if(x > 0) {
 for(int i=0; i<10; i++) {
     System.out.println(i);
}
     if(x > 0) {
         System.out.println('Positive');
         for(int i=0; i<10; i++) {
         System.out.println('Hello, World!');
             System.out.println('Non-positive');
             System.out.println('Hello, World!');
                 System.out.println('Non-positive');
}
                 if(x > 0) {
                 for(int i=0; i<10; i++) {
                 System.out.println('Hello, World!');
                     System.out.println('Positive');
                     System.out.println('Hello, World!');
}
} else {
 System.out.println('Hello, World!');
     System.out.println(i);
         System.out.println('Non-positive');
} else {
 if(x > 0) {
}
 System.out.println('Hello, World!');
     System.out.println('Positive');
         System.out.println('Non-positive');
         System.out.println('Hello, World!');
} else {
 if(x > 0) {
     System.out.println('Non-positive');
} else {
 for(int i=0; i<10; i++) {
     System.out.println(i);
}
}
    System.out.println('Non-positive');
    for(int i=0; i<10; i++) {
} else {
} else {
} else {
} else {
 for(int i=0; i<10; i++) {
     System.out.println('Positive');
     if(x > 0) {
     if(x > 0) {
         System.out.println(i);
} else {
 if(x > 0) {
     System.out.println('Non-positive');
}
     if(x > 0) {
} else {
 for(int i=0; i<10; i++) {
     System.out.println(i);
     for(int i=0; i<10; i++) {
         System.out.println('Positive');
}
} else {
}
    System.out.println(i);
    for(int i=0; i<10; i++) {
}
    if(x > 0) {
    if(x > 0) {
    if(x > 0) {
    if(x > 0) {
    if(x > 0) {
        System.out.println('Non-positive');
}
           S}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}
 */