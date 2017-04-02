# Numerical assertions

The following assertions work for all subtypes of `Number`(`Int`, `Byte`, `Float`, `Double`, `Long`, `Short`)

## Equality

```kt
5 shouldEqualTo 5
5 shouldNotEqualTo 10
```

## Comparison

```kt
5 shouldBeGreaterThan 2
5 shouldNotBeGreaterThan 10

2 shouldBeLessThan 5
5 shouldNotBeLessThan 2

5 shouldBeGreaterOrEqualTo 5
5 shouldNotBeGreaterOrEqualTo 10

2 shouldBeLessOrEqualTo 5
5 shouldNotBeLessOrEqualTo 2
```

## Ranges
```kt
5.shouldBeInRange(1, 10)
5 shouldBeInRange 1..10

5.shouldNotBeInRange(6, 10)
5 shouldNotBeInRange 6..10
```

## Special cases

```kt
2.shouldBePositive()
(-2).shouldBeNegative()
(-2).shouldNotBePositive()
2.shouldNotBeNegative()
```
