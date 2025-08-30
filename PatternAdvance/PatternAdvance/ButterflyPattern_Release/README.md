# Butterfly Pattern Generator - Release Package

## Overview
This package contains multiple executable formats for the Butterfly Pattern Generator program written in Java.

## Files Included
- `butterFly.java` - Original Java source code
- `butterFly.class` - Compiled Java bytecode
- `ButterflyPattern.jar` - Executable JAR file
- `ButterflyPattern.bat` - Windows Batch file launcher
- `RunButterflyJAR.bat` - JAR-specific batch launcher
- `ButterflyPattern.ps1` - PowerShell script launcher
- `MANIFEST.MF` - JAR manifest file
- `README.md` - This documentation file

## How to Run

### Option 1: Using the Batch File (Recommended)
1. Double-click `ButterflyPattern.bat`
2. Enter the number of lines when prompted
3. View the butterfly pattern output

### Option 2: Using the JAR File
1. Double-click `RunButterflyJAR.bat` OR
2. Run from command line: `java -jar ButterflyPattern.jar`

### Option 3: Using PowerShell Script
1. Right-click `ButterflyPattern.ps1` and select "Run with PowerShell"
2. If execution policy prevents running, open PowerShell as admin and run:
   ```powershell
   Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser
   ```

### Option 4: Direct Java Execution
```bash
java -cp . PatternAdvance.butterFly
```

## Requirements
- Java Runtime Environment (JRE) 8 or higher
- Windows operating system (for .bat files)

## Sample Output
For input `n = 4`:
```
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
```

## Program Description
The Butterfly Pattern Generator creates a symmetric butterfly pattern using asterisks (*). The program:
1. Takes user input for the number of lines
2. Generates the upper half of the butterfly
3. Generates the lower half of the butterfly
4. Creates a symmetric pattern with stars and spaces

## Distribution
This package is ready for distribution and can be shared as a complete executable package.

## Author
Created as part of DSA (Data Structures and Algorithms) learning with Shradha Ma'am.

## License
See LICENSE file for details.
