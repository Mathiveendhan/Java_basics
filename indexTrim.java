// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class indexTrim {
    public static void main(String[] args) {
       String str = "hello";
      int index = str.indexOf("lo"); // index = 3
        System.out.println(index);
        String str1 = "  Hello  ";
       String trimmed = str1.trim(); // trimmed = "Hello"
       System.out.print(trimmed);
    }
}