@echo off

REM Script to install Git hooks for the project

echo Installing Git hooks...

REM Check if we're in a git repository
if not exist ".git" (
    echo Error: Not in a Git repository root directory
    exit /b 1
)

REM Create hooks directory if it doesn't exist
if not exist ".git\hooks" mkdir .git\hooks

REM Copy pre-commit hook
copy scripts\hooks\pre-commit .git\hooks\pre-commit

echo Git hooks installed successfully!
echo.
echo The pre-commit hook will now check code formatting before each commit.
echo To format your code, run: mvn spotless:apply
echo.