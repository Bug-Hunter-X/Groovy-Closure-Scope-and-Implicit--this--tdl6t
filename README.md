# Groovy Closure Scope and Implicit 'this'

This example demonstrates a subtle issue in Groovy related to the implicit `this` object within closures. When a closure is passed as an argument to a method, and that method has other arguments, it can be difficult to understand what `this` refers to within the closure, leading to `MissingMethodException` errors if not handled carefully.  This is particularly common when closures are used with optional arguments.  The provided solution shows ways to resolve this.

## Steps to Reproduce

1. Run the `bug.groovy` script.
2. Observe the `MissingMethodException` thrown by `myOtherMethod`.

## Solution

The solution involves clarifying the scope of variables for the closure, either by explicitly passing them as arguments or by using a different closure approach, such as binding variables in a map before passing it to the closure.