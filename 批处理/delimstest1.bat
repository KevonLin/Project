@REM @echo off
@REM for /l %%i in (1 1 10) do (
@REM     set var=%%i
@REM     echo %var%
@REM )
@REM Pause


@REM @echo off
@REM set var=abc
@REM for /l %%i in (1 1 10) do (
@REM     set var=%%i
@REM     echo %var%
@REM )
@REM Pause

@REM @echo off
@REM set var=abc
@REM for /l %%i in (1 1 5) do (
@REM     set var%%i=%%i
@REM     echo %var%
@REM )
@REM echo %var1% %var2% %var3% %var4% %var5%
@REM pause

@echo off
setlocal EnableDelayedExpansion
set var=abc
for /l %%i in (1 1 10) do (
    set var=%%i
    echo %var%
    echo !var!
)
Pause