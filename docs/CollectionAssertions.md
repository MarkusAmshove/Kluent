# Collection assertions

## Arrays and Iterables

The following assertions work for `Array` and `Iterable`

```kt
theIntArray shouldContain 2
theIntArray shouldNotContain 10

arrayOf(1, 2, 3) shouldEqual arrayOf(1, 2, 3)
arrayOf(4, 5, 6) shouldNotEqual arrayOf(7, 8, 9)

theIntArray.shouldBeEmpty()
theIntArray.shouldNotBeEmpty()

2 shouldBeIn arrayOf(1, 2, 3)
2 shouldNotBeIn arrayOf(4, 5, 6)
```

## Maps

```kt
theMap shouldHaveKey "Name"
theMap shouldNotHaveKey "Age"

theMap shouldHaveValue "Peter"
theMap shouldNotHaveValue "Max"

theMap shouldContain ("Name" to "Peter")
theMap shouldNotContain ("Age" to 10)

theMap.shouldBeEmpty()
theMap.shouldNotBeEmpty()
```
