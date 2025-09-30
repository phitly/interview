### Date: [09/30/2025]

#### 🎯 Today's Goals
- Goal 1 [basic of encapsulation ]
- Goal 2 [ public vs private access] 
- Goal 3 [basics of objects]

#### 📚 What I Learned
**New Concepts:**
Java class design follows a few core principles:
	1.	Cohesion
Each class should represent a single concept (e.g., Car, BankAccount). Don’t mix unrelated responsibilities.
	2.	Encapsulation
	•	Keep fields private.
	•	Expose behavior through public methods.
	•	Hide internal details with private helpers.
	3.	Clear structure
Order members in a readable flow:
	•	Constants
	•	Fields
	•	Constructors
	•	Public methods (main behaviors, story-like order)
	•	Private helpers
	4.	Minimal public interface
Only expose what external code must use. Everything else stays private or protected.
	5.	Polymorphism and inheritance (if needed)
Use abstract classes or interfaces for shared contracts, and override behavior in subclasses. Favor composition over inheritance when possible.
	6.	Readability > cleverness
Methods should be short, named clearly, and do one thing.
```
public class ClassName {

    // Constants
    private static final int SOME_CONSTANT = 100;

    // Fields
    private String name;
    private int value;

    // Constructor
    public ClassName(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Public methods (main behaviors)
    public void doWork() {
        if (isValid()) {
            process();
        }
    }

    // Private helpers
    private boolean isValid() {
        return value > 0;
    }

    private void process() {
        // implementation details
    }
}
```
    

**Code Examples:**
```java
// Add code snippets here
```

#### Key Insights:
- 

#### 🔧 What I Built/Practiced


#### ❓ Questions & Confusions
- 



#### 📝 Tomorrow's Plan
- [ ] 
- [ ] 
- [ ] 

