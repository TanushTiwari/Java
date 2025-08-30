@echo off
title Butterfly Pattern Generator
echo.
echo ========================================
echo       BUTTERFLY PATTERN GENERATOR
echo ========================================
echo.

REM Check if Java is installed
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Java is not installed or not in PATH
    echo Please install Java and try again.
    pause
    exit /b 1
)

REM Get the directory where this batch file is located
set "SCRIPT_DIR=%~dp0"

REM Set the classpath to the parent directory to include the package
set "CLASSPATH=%SCRIPT_DIR%.."

REM Run the butterfly pattern program
echo Running Butterfly Pattern Generator...
echo.
java -cp "%CLASSPATH%" PatternAdvance.butterFly

echo.
echo ========================================
echo Program execution completed!
echo ========================================
pause
