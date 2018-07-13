#Lab 4 - Scanner Linter for JavaScript

## Overview of Feature Tasks
#### JavaScript Linter
Let's write a program that reads a JavaScript file and prints an error whenever
it finds a line that doesn't end in a semi-colon.

Use a Scanner to read through the file line by line. Print an error message
`"Line 3: Missing semicolon."` if a line is missing a semicolon.

* Don't show an error if the line is empty.
* Don't show an error if the line ends with an opening curly brace `{`
* Don't show an error if the line ends with an closing curly brace `}`
* Don't show an error if the line contains `if` or `else`

Use the file [gates.js](./gates.js)

## Resources
* [Scanner Docs](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

