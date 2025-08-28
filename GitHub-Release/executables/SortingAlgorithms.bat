@echo off
title Sorting Algorithms Menu - DSA Programs
color 0B
cls

:check_java
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo Java is not installed or not in PATH!
    echo Please install Java to run this program.
    pause
    exit /b 1
)

:main_loop
cls
echo ===============================================
echo       SORTING ALGORITHMS MENU - DSA
echo ===============================================
echo.
java -cp . SortingMenu
echo.
echo Program finished. Choose an option:
echo 1. Run again
echo 2. Exit
echo.
set /p choice="Enter your choice (1-2): "

if "%choice%"=="1" goto main_loop
if "%choice%"=="2" goto exit
echo Invalid choice!
timeout /t 2 >nul
goto main_loop

:exit
echo Thank you for using Sorting Menu!
timeout /t 2 >nul
