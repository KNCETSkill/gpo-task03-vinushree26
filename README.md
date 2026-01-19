# 💰 Smart Balance Checker

## 🧠 Problem Description

You are developing a **Smart Balance Checker** application that helps users verify whether their bank balance is sufficient before making a purchase.

The program must read a balance amount and display an appropriate message based on predefined rules.

---

## 📥 Input Specification

- A **single value** representing the bank balance
- Can be a **decimal number**
- Input must be **positive**
- Invalid or negative inputs must be handled properly

---

## 📤 Output Specification

Print **exactly one line** based on the rules below.

---

## 📏 Decision Rules

| Condition | Output |
|---------|--------|
| Balance < 1000 | `Alert! Your balance is low.` |
| Balance ≥ 1000 | `Your balance is sufficient.` |
| Negative value | `Error: Invalid balance entered.` |
| Non-numeric input | `Error: Please enter a valid number.` |

---

## 🧪 Sample Test Cases

| Input | Output |
|------|--------|
| `175.50` | Alert! Your balance is low. |
| `1000.00` | Your balance is sufficient. |
| `-50.00` | Error: Invalid balance entered. |
| `abc` | Error: Please enter a valid number. |

---

## 📌 Instructions

- Name your class: **`SmartBalanceChecker`**
- Read input from **standard input**
- Print output **exactly as specified**
- Do **not** print extra spaces or text

---

## ✅ Evaluation Criteria

- Correct logic
- Proper error handling
- Output format accuracy
- All test cases must pass to receive full marks

---

🎯 **Note:**  
Your submission will be automatically graded using hidden and sample test cases.
