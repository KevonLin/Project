@echo off
setlocal enabledelayedexpansion
for /f "delims=" %%m in ( 'dir /s /b ^|sort /+65535') do (
    @REM echo %%m
        if not "%%~nxm" == "%~nx0" (
            @REM  echo %%m
            set "file=%%m"
            set "name=%%~nm"
            set "extension=%%~xm"
            if "!name!" == "cd*" (
                echo !name!
            )
            @REM ren "!file!" "!name:-6!"
            @REM echo !file!
            @REM echo !name!
            @REM echo !extension!
        )
)
exit