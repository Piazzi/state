<div align="center">
  <h1> State  </h1>
</div>

# Code

Simple project representing the State design pattern.

# Definition

State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

![image](https://user-images.githubusercontent.com/40416044/150982877-3f339514-39c2-4e00-8a45-8b730c74a2c0.png)

This pattern is close to the concept of finite-state machines. The state pattern can be interpreted as a strategy pattern, which is able to switch a strategy through invocations of methods defined in the pattern's interface.

The state pattern is used in computer programming to encapsulate varying behavior for the same object, based on its internal state. This can be a cleaner way for an object to change its behavior at runtime without resorting to conditional statements and thus improve maintainability.

![image](https://user-images.githubusercontent.com/40416044/150983022-a051d9c6-a902-4c5d-90f0-f8ef49e46902.png)

The state pattern is set to solve two main problems:

- An object should change its behavior when its internal state changes.
- State-specific behavior should be defined independently. That is, adding new states should not affect the behavior of existing states.

Implementing state-specific behavior directly within a class is inflexible because it commits the class to a particular behavior and makes it impossible to add a new state or change the behavior of an existing state later, independently from the class, without changing the class. In this, the pattern describes two solutions:

- Define separate (state) objects that encapsulate state-specific behavior for each state. That is, define an interface (state) for performing state-specific behavior, and define classes that implement the interface for each state.
- A class delegates state-specific behavior to its current state object instead of implementing state-specific behavior directly.

This makes a class independent of how state-specific behavior is implemented. New states can be added by defining new state classes. A class can change its behavior at run-time by changing its current state object.




Source: <a href="https://pt.wikipedia.org/wiki/State"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/state"> Refactoring Guru </a>
