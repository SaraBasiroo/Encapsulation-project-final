

# Bank System with Encapsulation

This project demonstrates the concept of **Encapsulation** in Object-Oriented Programming (OOP) using a simple Bank System. The system includes different types of accounts, such as **Savings Account** and **Transaction Account**, and allows for operations such as deposits, withdrawals, and interest calculation. Encapsulation is implemented by keeping the internal details of each class hidden from the outside and providing controlled access via public methods.

## Table of Contents
- [Overview](#overview)
- [Classes](#classes)
  - [BankCustomers](#BankCustomers)
  - [BankAccount](#bankaccount)
  - [SavingsAccount](#savingsaccount)
  - [TransactionAccount](#transactionaccount)
- [Usage](#usage)
- [Encapsulation Explanation](#encapsulation-explanation)
  
## Overview

This project simulates a banking system with basic account management. The primary focus is on **Encapsulation**, a core principle in Object-Oriented Programming, to ensure that the internal workings of the system are hidden from the outside and can only be accessed or modified through well-defined interfaces.

## Classes

### BankCustomers

The `bankCustomers` class manages a list of accounts. It provides methods to:
- **Add new accounts** to the bank.
- **Find accounts** by their account number.
- **Show all account balances**.


### BankAccount

The `BankAccount` class is the base class for all types of bank accounts. It provides:
- **Private fields** for account number, holder name, and balance.
- **Public methods** to access and modify these fields in a controlled manner (getters and setters).
- **Deposit and withdraw operations** to manage account balance.
- **Encapsulation of the internal state** to protect from unauthorized access.


### SavingsAccount

The `SavingsAccount` class extends the `BankAccount` class and adds functionality for calculating interest. It demonstrates how you can extend base class functionality by overriding methods.



### TransactionAccount

The `TransactionAccount` class is another type of account that could represent checking or transactional accounts, allowing deposits and withdrawals.

## Usage

The system creates several instances of accounts, such as `SavingsAccount` and `TransactionAccount`, and performs operations like deposits, withdrawals, and interest calculations.



## Encapsulation Explanation

In this banking system, **Encapsulation** is demonstrated by hiding the internal details of each account. The `BankAccount` class has:
- Private fields for account details (`accountNumber`, `accountHolderName`, and `balance`).
- Public methods (`deposit`, `withdraw`, `getBalance`, etc.) to control access to these fields. This prevents direct manipulation of these fields from outside the class.

For example, the balance of an account is hidden and can only be accessed or modified through controlled methods:
- **Deposit and withdrawal operations** ensure that the balance is only changed in a safe manner (e.g., preventing negative deposits or withdrawals exceeding the available balance).
- **Interest calculations** are handled by the `calculateInterest` method, which ensures that interest is applied in a consistent and controlled way.

By using **Encapsulation**, the program ensures that all account operations are performed in a way that maintains the integrity of the account's state and prevents unauthorized access to the internal data.

## Conclusion

This simple bank system demonstrates the core principles of **Encapsulation** in object-oriented programming. It provides a way to model real-world banking operations while protecting account data and ensuring operations are carried out securely and predictably.

### Key Points Covered:
- **Encapsulation** is illustrated by hiding the internal fields (`balance`, `accountHolderName`, etc.) of the bank account and only exposing controlled methods (e.g., `deposit()`, `withdraw()`) to interact with these fields.
- The `BankAccount` class provides a common interface for managing account details, while `SavingsAccount` and `TransactionAccount` extend it, showing how **inheritance** works along with encapsulation.
- Methods like `calculateInterest()` show how specific functionality can be customized in subclasses while still maintaining a controlled interface.
