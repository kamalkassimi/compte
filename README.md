
---

# CompteBancka - Java Banking System

## Overview

`CompteBancka` is a simple banking system implemented in Java. It simulates basic bank account operations such as withdrawing, depositing, and calculating interest for different types of accounts.

The project defines multiple classes:
- **compte**: An abstract class representing a generic bank account.
- **CompteSimple**: A class representing a simple bank account with overdraft capabilities.
- **ComptePayant**: A class representing a paying account with fees.
- **CompteEpargne** (currently commented out in the code): Represents a savings account with interest calculation.
- **CompteInterface**: An interface defining the basic operations that a bank account should have.

## Features

1. **Account Management**:
    - Create a `CompteSimple` or `ComptePayant` with initial balance and overdraft.
    - Deposit and withdraw funds, handling overdrafts and insufficient balance.
  
2. **Exception Handling**:
    - The system checks for negative balances and invalid operations, throwing appropriate exceptions.

3. **Modular Design**:
    - Separation of account types for clarity and maintainability.
    - Extensible design allows for adding new account types in the future.

## Classes

### 1. `compte`
The abstract base class for all account types:
- Fields: `code`, `solde` (balance), and `nbrComptes`.
- Methods: 
  - `getCode()`, `setCode()`
  - `getSolde()`, `setSolde()`
  - `toString()`: Returns the account code and balance.

### 2. `CompteSimple`
Extends `compte`:
- Fields: `decouvert` (overdraft limit).
- Methods:
  - `retirer()`: Withdraws funds, checking if overdraft is sufficient.
  - `toString()`: Inherits from `compte`.

### 3. `ComptePayant`
Extends `compte`:
- Fields: `decouvert` (overdraft limit).
- Methods:
  - `retirer()`: Withdraws funds, throwing exceptions for insufficient balance.
  - `verser()`: Deposits funds into the account.
  - `toString()`: Inherits from `compte`.

### 4. `CompteInterface`
Interface for defining basic bank account operations:
- `verser()`: Method for depositing funds.
- `retirer()`: Method for withdrawing funds.
- `calculinterets()`: Calculates interest for the account (to be implemented in specific account classes).

## How to Run

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Compile the program**:
   Navigate to the directory where the files are located and use `javac` to compile:
   ```bash
   javac -d bin src/comptebancka/*.java
   ```

3. **Run the program**:
   ```bash
   java -cp bin comptebancka.programmetest
   ```

4. **Interact with the console**:
   The program will ask you to enter the initial balance and overdraft limit. Then, you can simulate withdrawals and deposits.

## Sample Output

```
enter solde:
1500
Enter decouvert:
500
Withdrawal successful. New balance: 1300.0
Deposit successful. New balance: 1470.0
Votre Code est : 1 Votre Solde est : 1300.0
Votre Code est : 2 Votre Solde est : 1470.0
```

## License

This project is open source and available under the [MIT License](LICENSE).

---

