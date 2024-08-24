# CS586 Project: Vending Machine System

## Overview

This project is a comprehensive implementation of a vending machine system using various design patterns and state modeling techniques. The project is divided into multiple parts, each focusing on different aspects of the system's design and functionality.

## Project Structure

### Part 1: MDA-EFSM Model for the Vending Machine Components

- **MDA-EFSM (Model-Driven Architecture - Extended Finite State Machine):**
  - **Events:**
    - `create()`
    - `insert_cups(int n)` - Insert a specified number of cups.
    - `coin(int f)` - Insert a coin. `f=1` if sufficient funds are inserted for a drink, `f=0` otherwise.
    - `card()` - Use a card for payment.
    - `cancel()` - Cancel the transaction.
    - `set_price()` - Set the price for a drink.
    - `dispose_drink(int d)` - Dispose of a drink with a specified ID.
    - `additive(int a)` - Add a specified additive.

  - **Actions:**
    - `StorePrice()` - Store the price of the drink.
    - `ZeroCF()` - Reset the cumulative fund.
    - `IncreaseCF()` - Increase the cumulative fund.
    - `ReturnCoins()` - Return the inserted coins.
    - `DisposeDrink(int d)` - Dispose of a drink with the given ID.
    - `DisposeAdditive(int A[])` - Dispose of the specified additives.

### Part 2: Class Diagrams

- **Design Patterns Used:**
  - **State Pattern:** Handles different states of the vending machine, such as `CoinInserted` and others. Simplifies state management by encapsulating behaviors in state-specific classes.
  - **Strategy Pattern:** Encapsulates actions like `StorePrice`, `IncreaseCF`, and others, making it easier to modify or extend them.
  - **Abstract Factory Pattern:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes. Used to handle `CF1`, `CF2`, and other abstract entities.

### Part 3: Class Responsibilities

- **VM_1 and VM_2:** Responsible for handling user inputs and interacting with the `MDAEFSM`. These classes serve as the interface between the user and the system.
- **MDAEFSM:** The main context class controlling the actions based on the current state. It delegates operations to the relevant state classes.
- **State Classes:** Implement the correct actions for each state and invoke operations in the `OP` class.
- **OP Class:** Handles the execution of actions, making the system modular and easy to maintain by reducing coupling between classes. It interacts with the `AbstractFactory` and `DataStore` to manage data and actions.

### Part 4: Sequence Diagrams

- **VM_1 Sequence Diagram:** Details the interactions between the components of `VM_1` during various operations.
- **VM_2 Sequence Diagram:** Similar to `VM_1`, this diagram illustrates the sequence of interactions within `VM_2`.

## Design Considerations

The design of this vending machine system leverages key object-oriented principles to ensure scalability, maintainability, and flexibility. By using design patterns such as State, Strategy, and Abstract Factory, the system is structured in a way that makes it easy to add new features, modify existing behaviors, and maintain the system over time.

## How to Run

To run the project, follow these steps:

1. Clone the repository.
2. Compile the source code using your preferred IDE or command line.
3. Run the main class to start the vending machine simulation.
4. Interact with the vending machine using the available commands and inputs.

## Future Enhancements

- **Expand State Coverage:** Add more specific states to handle finer details of vending machine operations.
- **Extend Strategy Pattern:** Implement additional strategies to accommodate different types of vending machines or payment methods.
- **Improve User Interface:** Enhance the user interface for better usability and interaction.

## License

This project is licensed under the [MIT License](LICENSE).
