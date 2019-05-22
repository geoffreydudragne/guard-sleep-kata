# Guard sleep refactoring kata

This kata is based on the day 4 of the [advent of code 2018](https://adventofcode.com/2018)

This implementation was wrote by a friend in one shot as quickly as possible, imperative style, ignoring good practices.
 He couldn't figure out his own code after a few weeks. We used it as a refactoring exercise because it's easy to test non regression. 

## Subject

To understand the underlying problem, refer to the web page of the advent of code [here](https://adventofcode.com/2018/day/4)

The 2 answers expected by the subject are:
1. Find the guard that has the most minutes asleep. What minute does that guard spend asleep the most.
2. Of all guards, which guard is most frequently asleep on the same minute?

`Result = (Id of the guard) * (minute)`

## How to

This repo provides a validation input and the implementation that passed the challenge on the advent site.

- Write a non regression test using the validation input
- Refactor

A branch with a passing acceptance test is also provided if you want to jump directly to refactoring