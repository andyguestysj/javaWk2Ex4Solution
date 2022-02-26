## Time is an illusion; lunchtime doubly so

1. Make a **class** to hold a time of day

```java
class Time {
  int hour;
  int minute;
}
```

2. Add a ***constructor** which takes an `hour` and a `minute` value.
3. Write a **method** `addMinutes` which can add any number of minutes onto a `Time` object. For example, if I  have an object with `hour = 5` and `minute = 35` and I call `addMinutes(45)` I would like the object to have new values `hour = 6` and `minute = 20`. Remember you can only go up to 59 minutes in any hour!
4. Add a **method** called `toString` which returns a `String` of the form HH:MM. For example calling `toString` on a time with `hour = 12` and `minute = 31` should return "12:31".
5. Write a **method** like

```java
void addTime( Time other) {
// something
}
```

Fill in this method to add the `time` in `other` to the `time` in the `object` that `addTime` was called on.
Ensure you test this to make sure it works.
6. Write a method which looks like

```java
void subtractTime( Time other) {
// something
}
```
Ensure you test this to make sure it works.
