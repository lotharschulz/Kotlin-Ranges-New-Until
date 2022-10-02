# How to run the kotlin script

```shell
kotlinc ranges_new_until.kts -script -language-version 1.8 -include-runtime
```

[Kotlin scripting is Experimental](https://kotlinlang.org/docs/custom-script-deps-tutorial.html)- 
I assume that explains the errors:

```text
warning: language version 1.8 is experimental, there are no backwards compatibility guarantees for new language and library features
error: expecting an element (ranges_until_new.kts:5:27)
error: expecting ')' (ranges_until_new.kts:5:28)
error: property getter or setter expected (ranges_until_new.kts:5:28)
ranges_until_new.kts:5:27: error: expecting an element
val A_NEW_UNTIL_D = ('a'..<'d')
                          ^
ranges_until_new.kts:5:28: error: expecting ')'
val A_NEW_UNTIL_D = ('a'..<'d')
                           ^
ranges_until_new.kts:5:28: error: property getter or setter expected
val A_NEW_UNTIL_D = ('a'..<'d')
                           ^
```
