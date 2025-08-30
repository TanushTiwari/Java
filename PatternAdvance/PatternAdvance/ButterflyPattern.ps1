# Butterfly Pattern Generator PowerShell Script
param()

Write-Host ""
Write-Host "========================================" -ForegroundColor Cyan
Write-Host "       BUTTERFLY PATTERN GENERATOR" -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""

# Check if Java is installed
try {
    $javaVersion = java -version 2>&1
    if ($LASTEXITCODE -ne 0) {
        throw "Java not found"
    }
    Write-Host "Java detected. Starting program..." -ForegroundColor Green
    Write-Host ""
} catch {
    Write-Host "ERROR: Java is not installed or not in PATH" -ForegroundColor Red
    Write-Host "Please install Java and try again." -ForegroundColor Red
    Read-Host "Press Enter to exit"
    exit 1
}

# Get script directory
$scriptDir = Split-Path -Parent $MyInvocation.MyCommand.Path

# Run the butterfly pattern program
try {
    Set-Location $scriptDir
    java -cp . PatternAdvance.butterFly
} catch {
    Write-Host "ERROR: Failed to run the program" -ForegroundColor Red
    Write-Host $_.Exception.Message -ForegroundColor Red
}

Write-Host ""
Write-Host "========================================" -ForegroundColor Cyan
Write-Host "Program execution completed!" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Cyan
Read-Host "Press Enter to exit"
