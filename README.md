# Time Conversion Program

This project is a simple **Time Conversion** utility implemented in Java that converts a given number of seconds into various humorous and unconventional time units such as _Decaseconds_, _Jiffies_, _New York Minutes_, _Nanocenturies_, and _Scaramuccis_. It is a fun demonstration of how to implement multiple conversion methods and handle user input in Java.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Setup](#setup)
- [Usage](#usage)
- [Conversion Units](#conversion-units)
- [Future Enhancements](#future-enhancements)
- [License](#license)

## Overview

This program accepts a number of seconds from the user and converts that time into different units that are rarely seen in conventional programming. Each unit has a unique conversion ratio and is displayed alongside an explanation of its meaning. This project showcases the use of methods, user input handling, and formatted console output in Java.

## Features

- Converts a given number of seconds into multiple unconventional time units.
- Displays explanations for each time unit.
- Simple and interactive command-line interface.
- Easily extensible for additional time units.

## Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- A Java IDE or command-line environment for compiling and running Java programs.

### Installation

1. Clone the repository or download the source code.
2. Compile the Java files:
   ```bash
   javac src/TimeConversion.java src/TimeConversionDriver.java
   ```
3. Run the compiled program:
   ```bash
   java src.TimeConversionDriver
   ```

## Usage

1. When the program starts, it displays a welcome message and prompts the user to enter a number of seconds.
2. The program then converts the given seconds into the following unconventional time units:
   - **Decaseconds**
   - **Jiffies**
   - **New York Minutes**
   - **Nanocenturies**
   - **Scaramuccis**
3. For each time unit, the program displays a description and the calculated value based on the given seconds.
4. The program ends with a concluding message, wrapping up the time conversion process.

   ### Example Output

```
-------------------------------------------------------------------------

Start - Time Conversion Program

-------------------------------------------------------------------------
Please enter a number of seconds 100 A decasecond is 10 secs. For 100 seconds, there are 10.0 decaseconds. A jiffy is a unit of time used in computer operation system. It is 10 milliseconds. For 100 seconds, there are 10000 milliseconds. A new york minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second. For 100 seconds, there are 5.0 new york minutes. A nanocentury is a computing measurement coined from the expression - "never to let the user wait more than a few nanocenturies for a response". It is 3.156 seconds. For 100 seconds, there are 31.689342403628114 nanocenturies. A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days. For 100 seconds, there are 0.00011574074074074075 scaramuccis.

-------------------------------------------------------------------------

End - Time Conversion Program

-------------------------------------------------------------------------

```

## Conversion Units

Here is a brief description of each time unit used in the program:

1. **Decasecond**: A decasecond is equal to 10 seconds.
2. **Jiffy**: In computing, a jiffy typically represents 10 milliseconds (0.01 seconds).
3. **New York Minute**: Represents 1/20th of a second, humorously defined as the time between a traffic light turning green and the car behind you honking in New York.
4. **Nanocentury**: A nanocentury is approximately 3.156 seconds, a term coined by computing professionals to represent small time intervals.
5. **Scaramucci**: A Scaramucci is equal to 11 days, named after the short tenure of former White House Communications Director Anthony Scaramucci.

## Future Enhancements

Possible improvements to this project include:

- **Adding more unconventional time units**, such as a "dog year" or "light year in time."
- **Implementing additional input validation** to handle negative or non-integer inputs.
- **Enhancing the user interface** with more descriptive messages and better formatting.

## License

This project is open-source and available under the [MIT License](LICENSE).

## Author

Jai Vang
