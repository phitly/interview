# Java Learning Journal

## Entry Template (Copy this for each day)
------------------------------------------------------------------------
# Header 1
## Header 2
### Header 3

**Bold text**
*Italic text*

- Bullet point 1
- Bullet point 2

1. Numbered list
2. Second item

## we divide modifiers into two groups
- access modifiers: controls the access level
- NOn access mods- do not control access level but proivdes other functionality

### non access mods
**FINAL**
- If you don't want the ability to override existing attribute values, declare attributes as final:
```
public class Main {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
```
**STATIC**
-A static method means that it can be accessed without creating an object of the class, unlike public:
```
public class Main {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    Main myObj = new Main(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method
  }
}

```
### Hierarchy:
	1.	Constants
	2.	Fields
	3.	Constructors
	4.	Public methods (logical flow, top to bottom as a narrative)
	5.	Private helpers (only used internally, placed last)

