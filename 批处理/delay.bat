@REM @echo off
@REM set a=1
@REM set b1=10
@REM echo %b%a%%
@REM pause

@REM @echo off
@REM set a=1&set b1=10
@REM call,echo %%b%a%%%
@REM pause>nul

@echo off
set a=1&set b1=10
call,echo %%b%a%%%
pause>nul