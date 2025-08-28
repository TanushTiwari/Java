@echo off
title DSA Learning Hub - Complete Collection
color 0F
cls

:: Check if Java is installed
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ===============================================
    echo          JAVA NOT FOUND ERROR
    echo ===============================================
    echo Java is not installed or not in PATH!
    echo Please install Java JDK/JRE to run this program.
    echo Download from: https://www.oracle.com/java/technologies/downloads/
    echo.
    pause
    exit /b 1
)

:main_menu
cls
echo ===============================================
echo         DSA LEARNING HUB - COMPLETE
echo ===============================================
echo          Pattern Advanced ^& Sorting
echo ===============================================
echo.
echo 🎯 MAIN CATEGORIES:
echo.
echo 1. 🎨 Pattern Advanced Programs (9 Types)
echo 2. 🔄 Sorting Algorithms (7 Types)
echo 3. 📚 View Documentation
echo 4. ℹ️  About This Collection
echo 5. 🚪 Exit
echo.
echo ===============================================
set /p main_choice="Enter your choice (1-5): "

if "%main_choice%"=="1" goto pattern_menu
if "%main_choice%"=="2" goto sorting_menu
if "%main_choice%"=="3" goto documentation
if "%main_choice%"=="4" goto about
if "%main_choice%"=="5" goto exit
echo Invalid choice! Please try again.
timeout /t 2 >nul
goto main_menu

:pattern_menu
cls
echo ===============================================
echo         🎨 PATTERN ADVANCED PROGRAMS
echo ===============================================
echo.
echo Available Patterns:
echo.
echo 1. Butterfly Pattern
echo 2. Diamond Pattern  
echo 3. Floyd's Triangle
echo 4. Hollow Rhombus
echo 5. Hollow Rectangle
echo 6. Inverted Half Pyramid
echo 7. Inverted Rotated Half Pyramid
echo 8. Rhombus Pattern
echo 9. Triangle with 0s and 1s
echo 10. 🔙 Back to Main Menu
echo.
echo ===============================================
set /p pattern_choice="Enter your choice (1-10): "

if "%pattern_choice%"=="10" goto main_menu

if "%pattern_choice%"=="1" (
    echo.
    echo 🦋 Running Butterfly Pattern...
    echo.
    java -cp . PatternAdvanceMenu
    goto pattern_continue
)

if "%pattern_choice%"=="2" (
    echo.
    echo 💎 Running Diamond Pattern...
    echo.
    java -cp . PatternAdvanceMenu
    goto pattern_continue
)

:: For brevity, all patterns use the same menu program
if "%pattern_choice%" geq "1" if "%pattern_choice%" leq "9" (
    echo.
    echo 🎨 Running Pattern Program...
    echo.
    java -cp . PatternAdvanceMenu
    goto pattern_continue
)

echo Invalid choice! Please try again.
timeout /t 2 >nul
goto pattern_menu

:pattern_continue
echo.
echo ===============================================
echo 1. Run another pattern
echo 2. Back to main menu
echo 3. Exit
set /p continue_choice="Enter your choice (1-3): "
if "%continue_choice%"=="1" goto pattern_menu
if "%continue_choice%"=="2" goto main_menu
if "%continue_choice%"=="3" goto exit
goto pattern_menu

:sorting_menu
cls
echo ===============================================
echo          🔄 SORTING ALGORITHMS
echo ===============================================
echo.
echo Available Sorting Algorithms:
echo.
echo 1. Bubble Sort (O(n²))
echo 2. Selection Sort (O(n²))
echo 3. Insertion Sort (O(n²))
echo 4. Counting Sort (O(n+k))
echo 5. Quick Sort (O(n log n))
echo 6. Merge Sort (O(n log n))
echo 7. Inbuilt Sort (Optimized)
echo 8. 🔙 Back to Main Menu
echo.
echo ===============================================
set /p sorting_choice="Enter your choice (1-8): "

if "%sorting_choice%"=="8" goto main_menu

if "%sorting_choice%" geq "1" if "%sorting_choice%" leq "7" (
    echo.
    echo 🔄 Running Sorting Algorithm...
    echo.
    java -cp . SortingMenu
    goto sorting_continue
)

echo Invalid choice! Please try again.
timeout /t 2 >nul
goto sorting_menu

:sorting_continue
echo.
echo ===============================================
echo 1. Run another sorting algorithm
echo 2. Back to main menu  
echo 3. Exit
set /p continue_choice="Enter your choice (1-3): "
if "%continue_choice%"=="1" goto sorting_menu
if "%continue_choice%"=="2" goto main_menu
if "%continue_choice%"=="3" goto exit
goto sorting_menu

:documentation
cls
echo ===============================================
echo              📚 DOCUMENTATION
echo ===============================================
echo.
echo 🎨 PATTERN PROGRAMS:
echo   • Butterfly Pattern - Creates butterfly shape
echo   • Diamond Pattern - Creates diamond shape  
echo   • Floyd's Triangle - Numbers in triangle
echo   • Hollow Rhombus - Hollow rhombus shape
echo   • Hollow Rectangle - Hollow rectangle
echo   • Inverted Half Pyramid - Inverted triangle
echo   • Inverted Rotated Half Pyramid - Right-aligned
echo   • Rhombus Pattern - Solid rhombus
echo   • Triangle 0s and 1s - Alternating pattern
echo.
echo 🔄 SORTING ALGORITHMS:
echo   • Bubble Sort - Simple comparison sorting
echo   • Selection Sort - Find min and swap
echo   • Insertion Sort - Insert in sorted portion
echo   • Counting Sort - Non-comparison based
echo   • Quick Sort - Divide and conquer
echo   • Merge Sort - Divide and merge
echo   • Inbuilt Sort - Java's optimized sort
echo.
echo 💡 USAGE TIPS:
echo   • For patterns: Enter number of lines/rows
echo   • For sorting: Enter array size, then elements
echo   • All programs loop until you choose exit
echo.
pause
goto main_menu

:about
cls
echo ===============================================
echo               ℹ️  ABOUT THIS COLLECTION
echo ===============================================
echo.
echo 📚 DSA Learning Hub - Complete Collection
echo.
echo 🎯 PURPOSE:
echo   Educational tool for learning Data Structures
echo   and Algorithms through interactive programs
echo.
echo 👨‍💻 CREATED FOR:
echo   Students learning DSA concepts
echo   Practice with pattern programming
echo   Understanding sorting algorithms
echo.
echo 🛠️  TECHNICAL DETAILS:
echo   • Written in Java
echo   • Menu-driven interface
echo   • Cross-platform compatible
echo   • Open source
echo.
echo 📝 FEATURES:
echo   • 9 Advanced Pattern Programs
echo   • 7 Sorting Algorithm Implementations
echo   • Interactive input/output
echo   • Educational comments and explanations
echo   • Time complexity information
echo.
echo 🔗 GITHUB: github.com/TanushTiwari/Java
echo.
echo 📄 LICENSE: Open Source
echo.
pause
goto main_menu

:exit
cls
echo ===============================================
echo           👋 THANK YOU FOR USING
echo          DSA LEARNING HUB - COMPLETE
echo ===============================================
echo.
echo 🎓 Keep practicing and learning!
echo 💻 Happy coding!
echo.
echo 🔗 Find more resources at:
echo    github.com/TanushTiwari/Java
echo.
echo ===============================================
timeout /t 3 >nul
exit
