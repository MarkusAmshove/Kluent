# CharSequence assertions

The following assertions work with every subtype of `CharSequence` (e.g. `String`)

```kt
"name" shouldBeEqualTo "name"
"name" shouldNotBeEqualTo "abc"

"name" shouldStartWith "n"
"age" shouldNotStartWith "n"

"name" shouldEndWith "me"
"name" shouldNotEndWith "ee"

"name" shouldContain "am"
"name" shouldNotContain "abc"

"I like fluent assertions" shouldContainSome listOf("fluent", "not", "test")
"I like fluent assertions" shouldContainNone listOf("test, "compile")

"name" shouldMatch "\\w+"
"name" shouldNotMatch "\\d+"

"name" shouldMatch Regex("\\w+")
"name" shouldNotMatch Regex("\\d+")

"".shouldBeEmpty()
"name".shouldNotBeEmpty()

"".shouldBeNullOrEmpty()
"name".shouldNotBeNullOrEmpty()

" ".shouldBeBlank()
"name".shouldNotBeBlank()

" ".shouldBeNullOrBlank()
"".shouldNotBeNullOrBlank()
```

In case if you need to assert Char or CharSequence ignoring the characters case, you can use the following assertions:

```kt
"name" shouldBeEqualToIgnoringCase "nAmE"
"name" shouldNotBeEqualToIgnoringCase "abc"

"name" shouldStartWithIgnoringCase "N"
"age" shouldNotStartWithIgnoringCase "n"

"name" shouldEndWithIgnoringCase "ME"
"name" shouldNotEndWithIgnoringCase "ee"

"name" shouldContainIgnoringCase "Am"
"name" shouldNotContainIgnoringCase "abc"

"I like fluent assertions" shouldContainSomeIgnoringCase listOf("Fluent", "NOT", "tesT")
"I like fluent assertions" shouldContainNoneIgnoringCase listOf("test, "compile")
```
