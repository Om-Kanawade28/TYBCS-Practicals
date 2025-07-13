# ☕ How to Run Java Programs in Linux Terminal

This guide will help you write, compile, and run Java programs step-by-step using the terminal on a Linux system.

---

## ✅ Prerequisites

- Java installed on your system (JDK)
- Terminal access
- Basic knowledge of Linux commands

Check if Java is installed:

```bash
java -version
javac -version
```

If not installed, install it using:

```bash
sudo apt update
sudo apt install default-jdk
```

---

## 📝 Step-by-Step Guide

### 🔹 Step 1: Create a Java File

Use any terminal editor like `nano`, `vim`, or `gedit`:

```bash
nano MyProgram.java
```

Paste the following code:

```java
public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Hello from Java in Linux!");
    }
}
```

Save and exit:
- In `nano`: Press `Ctrl + O` → `Enter` → `Ctrl + X`

---

### 🔹 Step 2: Compile the Java Program

In the terminal, run:

```bash
javac MyProgram.java
```

- This creates a file named `MyProgram.class` in the same directory.
- This is the bytecode file created by the Java compiler.

---

### 🔹 Step 3: Run the Java Program

Now run the compiled program:

```bash
java MyProgram
```

✅ Output:
```
Hello from Java in Linux!
```

---

## 📁 Full Example

```bash
mkdir java_test
cd java_test
nano MyProgram.java
# (write code and save)
javac MyProgram.java
java MyProgram
```

---



## 📌 Example with Input (Optional)

If your program uses `Scanner`:

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

Compile and run:

```bash
javac InputExample.java
java InputExample
```

---


