# Palindrome Checker (Java)

A lightweight, high-performance Java program designed to determine whether a given integer is a palindrome using purely mathematical operations—without relying on String conversions or secondary data structures.

---

## 📌 Features

- **Mathematical Reversal:** Uses modulo (`%`) and division (`/`) operations to achieve optimal execution speed and zero heap allocations for string parsing.
- **Negative Number Handling:** Correctly handles negative inputs based on mathematical standards (e.g., `-121` is not a palindrome).
- **Interactive CLI:** Prompts the user for real-time console input with input validation.
- **Automated Test Suite:** Built-in test suite executing 5 distinct test cases (including critical edge cases).
- **Comprehensive Inline Documentation:** Code is thoroughly documented with JavaDoc and inline comments for developer readability.

---

## 🛠️ Requirements

- **JDK:** Java Development Kit (JDK) 8 or higher.
- **IDE / Terminal:** Any Java-supported IDE (IntelliJ IDEA, Eclipse, VS Code) or command terminal.

---

## 🚀 Getting Started

### 1. Clone or Download
Save the source code file as `PalindromeChecker.java`.

### 2. Compile the Program
Open your terminal/command prompt, navigate to the directory containing the file, and execute:

```bash
javac PalindromeChecker.java
```

### 3. Run the Program
Execute the compiled bytecode:

```bash
java PalindromeChecker
```

---

## 💻 Example Usage

### Sample Console Output:

```text
Enter an integer to check if it's a palindrome: 1221
Result: 1221 IS a palindrome.

--- Running Test Cases ---
Test Case 1: Input = 121   | Is Palindrome? true
Test Case 2: Input = -121  | Is Palindrome? false
Test Case 3: Input = 0     | Is Palindrome? true
Test Case 4: Input = 123   | Is Palindrome? false
Test Case 5: Input = 10    | Is Palindrome? false
```

---

## 🧪 Test Cases & Edge Cases

| # | Input | Expected Output | Classification / Edge Case Reason |
|---|---|---|---|
| **1** | `121` | `true` | Standard odd-length palindrome. |
| **2** | `-121` | `false` | Negative number (the minus sign does not appear at the end when reversed). |
| **3** | `0` | `true` | Single-digit boundary case. All single-digit positive numbers are palindromes. |
| **4** | `123` | `false` | Standard non-palindrome number. |
| **5** | `10` | `false` | Trailing zero boundary case (reverses mathematically to `1`, which does not match `10`). |

---

## 🧮 Algorithm & Complexity

The algorithm avoids memory allocations associated with `String.valueOf(number)` or `StringBuilder.reverse()`.

### Steps:
1. **Validation:** If `number < 0`, return `false` immediately.
2. **Cache:** Store the original value in `originalNumber`.
3. **Reversal Loop:**
   - Extract the last digit: `lastDigit = number % 10`
   - Append to reverse: `reversedNumber = (reversedNumber * 10) + lastDigit`
   - Drop the last digit: `number /= 10`
4. **Comparison:** Return `originalNumber == reversedNumber`.

### Performance Metrics:
- **Time Complexity:** $\mathcal{O}(\log_{10} N)$ — The number of loop iterations corresponds to the number of digits in $N$.
- **Space Complexity:** $\mathcal{O}(1)$ — Constant space complexity with zero heap memory allocation.

---

## 📝 License

This project is licensed under the MIT License — feel free to use, modify, and distribute for educational or commercial purposes.
