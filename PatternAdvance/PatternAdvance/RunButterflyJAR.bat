@echo off
title Butterfly Pattern Generator (JAR)
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

REM Check if JAR file exists
if not exist "%SCRIPT_DIR%ButterflyPattern.jar" (
    echo ERROR: ButterflyPattern.jar not found!
    echo Please ensure the JAR file is in the same directory as this batch file.
    pause
    exit /b 1
)

REM Run the JAR file
echo Running Butterfly Pattern Generator from JAR...
echo.
java -jar "%SCRIPT_DIR%ButterflyPattern.jar"

echo.
echo ========================================
echo Program execution completed!
echo ========================================
pause
