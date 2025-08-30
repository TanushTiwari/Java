@echo off
echo =================================================
echo           DSA Programs Portal Launcher
echo =================================================
echo.

REM Check if Python is installed
python --version >nul 2>&1
if errorlevel 1 (
    echo ❌ Python is not installed or not in PATH
    echo Please install Python from https://python.org
    pause
    exit /b 1
)

echo ✅ Python found
echo 🚀 Starting DSA Portal...
echo.

REM Change to the portal directory
cd /d "%~dp0"

REM Start the server
python server.py

pause
