```groovy
def myMethod(Closure closure) {
  closure.call()
}

myMethod { println "Hello" }

// This works fine

def myOtherMethod(String input, Closure closure) {
  println "Input: $input"
  closure.call()
}

// This throws a MissingMethodException
myOtherMethod("World", { println "Hello" })
```