@REM @echo off
@REM for /f %%i in (test.txt) do echo %%i
@REM pause　　

@REM @echo off
@REM for /f %%i in (test.txt) do echo %%i&pause
@REM pause　　　　

@echo off
for /f "delims=," %%i in (test.txt) do echo %%i
pause　　