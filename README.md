[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/7wai54z-)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22279259)
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
