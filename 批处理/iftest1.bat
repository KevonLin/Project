@echo off
set /p var1=输入第一个字符:
set /p var2=输入第二个字符:
if "%var1%"=="%var2%" (echo 输入两个字符相同) else echo 输入两个字符不同
pause