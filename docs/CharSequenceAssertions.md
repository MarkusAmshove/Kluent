# CharSequence assertions

The following assertions work with every subtype of `CharSequence` (e.g. `Sring`)

```kt
"name" shouldEqualTo "name"
"name" shouldNotEqualTo "abc"

"name" shouldStartWith "n"
"age" shouldNotStartWith "n"

"name" shouldEndWith "me"
"name" shouldNotEndWith "ee"

"name" shouldContain "am"
"name" shouldNotContain "abc"

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