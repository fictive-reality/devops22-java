package examples;
// package follows folder structure

// public makes the class importable outside current package.
class PackageExample {

    public void printMessage() {
        System.out.println("Great success!");
    }

}

/*
 * ------------------------
 * ---- Mini Challenge ----
 * ------------------------
 * 
 * 1. Create a file DemoPackage.java in the lesson_2 folder with the following content:
 * 
 * import lesson_2.examples.PackageExample;
 * 
 * public class DemoPackage {
 *  public static void main(String[] args) {
 *      PackageExample packageExample = new PackageExample();
 *      packageExample.printMessage();
 *   }
 * }
 * 
 * 2. Make the package public by modifying PackageExample.java
 * 3. Implement the method printMessage() in PackageExample.java
 * 
 */
