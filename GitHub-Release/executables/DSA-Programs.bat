@echo off
title DSA Programs Launcher
color 0E
cls

:menu
echo ===============================================
echo              DSA PROGRAMS LAUNCHER
echo ===============================================
echo.
echo 1. Pattern Advanced Programs
echo 2. Sorting Algorithms Programs  
echo 3. Exit
echo.
set /p choice="Enter your choice (1-3): "

if "%choice%"=="1" (
    cls
    echo Starting Pattern Advanced Programs...
    call PatternAdvance.bat
    goto menu
)
if "%choice%"=="2" (
    cls  
    echo Starting Sorting Algorithms Programs...
    call SortingAlgorithms.bat
    goto menu
)
if "%choice%"=="3" goto exit

echo Invalid choice! Please try again.
timeout /t 2 >nul
goto menu

:exit
echo Thank you for using DSA Programs!
timeout /t 2 >nul
