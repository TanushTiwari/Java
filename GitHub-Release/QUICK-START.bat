@echo off
title DSA Learning Hub - Quick Setup
color 0A
cls

echo ===============================================
echo       DSA LEARNING HUB - QUICK SETUP
echo ===============================================
echo.

echo ✅ Checking required files...
if exist "DSA-Complete-Hub.bat" (
    echo   ✅ Main launcher found
) else (
    echo   ❌ Main launcher missing!
    goto error
)

if exist "PatternAdvanceMenu.class" (
    echo   ✅ Pattern programs ready
) else (
    echo   ❌ Pattern programs missing!
    goto error
)

if exist "SortingMenu.class" (
    echo   ✅ Sorting algorithms ready
) else (
    echo   ❌ Sorting algorithms missing!
    goto error
)

echo.
echo ✅ Checking Java installation...
java -version >nul 2>&1
if %errorlevel% equ 0 (
    echo   ✅ Java is installed and working
) else (
    echo   ❌ Java not found! Please install Java JDK/JRE
    echo   📥 Download from: https://www.oracle.com/java/technologies/downloads/
    goto error
)

echo.
echo ===============================================
echo ✅ ALL SYSTEMS READY!
echo ===============================================
echo.
echo 🚀 To start learning DSA:
echo   👆 Double-click "DSA-Complete-Hub.bat"
echo.
echo 📚 Available Programs:
echo   🎨 9 Pattern Advanced Programs
echo   🔄 7 Sorting Algorithms
echo.
echo 🔗 Repository: https://github.com/TanushTiwari/Java
echo.
echo Press any key to launch DSA Learning Hub...
pause >nul

echo.
echo 🚀 Launching DSA Learning Hub...
start DSA-Complete-Hub.bat
exit

:error
echo.
echo ❌ Setup incomplete! Please check the issues above.
echo.
pause
exit /b 1
