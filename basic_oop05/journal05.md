### HEAP
- a region of memory where java stores objects and instance var
1. what stored? 
    - all objects 
    - instance var of objects
    - arrays
    - static var 
    //
## what is scope??
- the region of your program where a variable can be accessed
**KEY POINTS**
- local var have scope within the method they are declared in
- instance var have scope within the entire class
- static var have scope within the entire class
- parameters have scope within the method they are declared in
- block scope: var declared within a block {...} have scope within that block

**Examples**
```java
public class ScopeExample {
    // instance variable
    private int instanceVar = 10;
    // static variable
    private static int staticVar = 20;  

