@echo off
title Butterfly Pattern - Release Package Creator
echo.
echo ========================================
echo    BUTTERFLY PATTERN RELEASE CREATOR
echo ========================================
echo.

REM Set the release directory
set "RELEASE_DIR=%~dp0ButterflyPattern_Release"
set "SOURCE_DIR=%~dp0"

echo Creating release package...

REM Create release directory
if exist "%RELEASE_DIR%" (
    echo Cleaning existing release directory...
    rmdir /s /q "%RELEASE_DIR%"
)
mkdir "%RELEASE_DIR%"

REM Copy all necessary files
echo Copying files to release package...
copy "%SOURCE_DIR%butterFly.java" "%RELEASE_DIR%\"
copy "%SOURCE_DIR%butterFly.class" "%RELEASE_DIR%\"
copy "%SOURCE_DIR%ButterflyPattern.jar" "%RELEASE_DIR%\"
copy "%SOURCE_DIR%ButterflyPattern.bat" "%RELEASE_DIR%\"
copy "%SOURCE_DIR%RunButterflyJAR.bat" "%RELEASE_DIR%\"
copy "%SOURCE_DIR%ButterflyPattern.ps1" "%RELEASE_DIR%\"
copy "%SOURCE_DIR%MANIFEST.MF" "%RELEASE_DIR%\"
copy "%SOURCE_DIR%README.md" "%RELEASE_DIR%\"

echo.
echo ========================================
echo Release package created successfully!
echo Location: %RELEASE_DIR%
echo ========================================
echo.
echo The package contains:
echo - Executable JAR file
echo - Batch file launchers
echo - PowerShell script
echo - Source code
echo - Documentation
echo.
echo Ready for distribution!
echo ========================================
pause
