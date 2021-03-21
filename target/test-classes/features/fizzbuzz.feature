Feature: FizzBuzz integer converter

  Fizzbuzz converts int into:
  - the same int by default
  - Fizz if the int is divisible by 3
  - Buzz if the int is divisible by 5
  - FizzBuzz if the int is divisible by both 3 and 5

  Scenario Outline: Do not convert input
    Given an input of <input>
    When the input is fizzbuzzed
    Then the output is <expectedOutput>
    Examples:
      | input | expectedOutput |
      | 1     | 1              |
      | 2     | 2              |
      | 4     | 4              |

  Scenario Outline: Convert input to Fizz
    Given an input of <input>
    When the input is fizzbuzzed
    Then the output is Fizz
    Examples:
      | input |
      | 3     |
      | 9     |
      | 27    |

  Scenario Outline: Convert input to Buzz
    Given an input of <input>
    When the input is fizzbuzzed
    Then the output is Buzz
    Examples:
      | input |
      | 5     |
      | 20    |
      | 50    |

  Scenario Outline: Convert input to FizzBuzz
    Given an input of <input>
    When the input is fizzbuzzed
    Then the output is FizzBuzz
    Examples:
      | input |
      | 15     |
      | 30    |
      | 45    |

#  Scenario: Do not convert input
#    Given an input of 2
#    When the input is fizzbuzzed
#    Then the output is 2
#
#  Scenario: Do not convert input
#    Given an input of 4
#    When the input is fizzbuzzed
#    Then the output is 4