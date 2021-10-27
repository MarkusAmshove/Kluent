# Collection assertions

## Arrays and Iterables

The following assertions work for `Array` and `Iterable`

```kt
theIntArray shouldContain 2
theIntArray shouldNotContain 10

theIntArray shouldContainSome arrayOf(1, 10, 15, 2)
theIntArray shouldContainNone arrayOf(5, 10, 11)

arrayOf(1, 2, 3) shouldBeEqualTo arrayOf(1, 2, 3)
arrayOf(4, 5, 6) shouldNotBeEqualTo arrayOf(7, 8, 9)

theIntArray.shouldBeEmpty()
theIntArray.shouldNotBeEmpty()

2 shouldBeIn arrayOf(1, 2, 3)
2 shouldNotBeIn arrayOf(4, 5, 6)

listOf(10, 15, 20) shouldContainAll listOf(10, 15, 20)
listOf(10, 15, 20) shouldNotContainAny listOf(5, 7)

listOf(1, 2, 3) shouldContainSame listOf(3, 1, 2)
```

In case of Array or Iterable contain Chars or CharSequences and do not care about the characters case you can use the
following assertions:

```kt
listOf('abc', 'cda', 'FGT') shouldContainAllIgnoringCase listOf('AbC', 'cDa', 'fgT')
listOf('abc', 'cda', 'FGT') shouldNotContainAnyIgnoringCase listOf('ab', 'CD')

listOf('abc', 'cda', 'FGT') shouldContainSomeIgnoringCase arrayOf('AbC', 'cD', 'fg')

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
