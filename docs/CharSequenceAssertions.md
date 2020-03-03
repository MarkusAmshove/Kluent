# CharSequence assertions

The following assertions work with every subtype of `CharSequence` (e.g. `Sring`)

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