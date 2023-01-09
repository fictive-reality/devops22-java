
Python naming conventions:
```py
a_variable = "uses snake_case"
def or_function():
    # also uses snake_case
    return a_variable

# Exceptions:
class MyClass: # Uses PascalCase
    pass

CONSTANT = "yes" # Uses CONSTANT_CASE
```

Java naming conventions:
```java
String aVariable = "uses camelCase";

class MyClass {
    // Uses PascalCase
    void myFunc() {
        // Uses camelCase
    }
}

String CONSTANT = "yes" // Uses CONSTANT_CASE
```

---

Comments differ between Python and Java
```py
# Single-line comment

"""
Multi-line 
doc string comment
"""
```

Java:
```java
// Single line comment

/*
Multi-line 
comment
*/
```

---

In Python, brackets are not used for blocks, functions, etc and instead we define a block by indentation / whitespace. No need to end lines with semi-colon.
```py
if True:
    return False
```

In Java, brackets are needed and should be used even if they sometimes can be omitted. Indentation / whitespace is not important for the structure of the code. Statement lines (most lines) must end with a semi-colon. Also note the difference in how boolean values are written.
```java
if (true) {  
  return false;  
}
```


In Python you can write functions outside a class or inside a class (method)

```py

def im_a_func():
    return True

class ImAClass:
    def im_a_method(self):
        return True
```

In Java, all functions are actually methods under a class, whereas in Python you can define a function outside a class.
```java
// Illegal
boolean illegalFunc() {
    return true;
}
// Legal
class ImAClass {
    boolean legalMethod() {
        return true;
    }
}
```

Python as no types written in the code (except for typing extensions)
```py
has_wheels = True
uses_fuel = False
has_battery = True
is_a_car = has_wheels and (uses_fuel or not has_battery)
name = "Volvo
name += " is a car"
```

Java has types, different boolean operators and cannot use + - operations on primitive types.
```java
boolean hasWheels = true
boolean usesFuel = false
boolean hasBattery = true
boolean isACar = hasWheels && (usesFuel || !hasBattery)
String name = "Volvo"
// Illegal
name += " is a car"
```

Python as some limited access controls and can differentiate between global or function local variables.

```py
# Global variable
number = 1

class AClass:
    _private_var = "can but shoudn't be accessed outside class" 

    # Will throw AttributeError if access from outside class
    def __private_func():
        # Using a global variable
        global number
        return number + 1 # Always 2
    
    def func(number):
        return number + 1 # E.g. whatever func was called with +1
```

Java has a rich and enforced system of access control on methods and variables.
```java
package examples.pkg;

class AClass {
    // Can be reached by all callers
    public int num1 = 1

    // Can be reached by this class, this package and classes that inherit from it
    protected int num3 = 3

    // Can be reached from other classes in  same package
    int num4 = 4

    // Can only be reached within this class
    private int num2 = 2
}
```
