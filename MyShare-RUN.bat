@echo off
title MyShare v1.0 beta  - Project By Arfan Shaikh (15CE13/shaikharfan7@gmail.com)
echo MyShare is running ipconfig for determining ip of this computer.
ipconfig 
pause
echo Note your IP / IPv4 Address  - Project By Arfan Shaikh (15CE13/shaikharfan7@gmail.com):
cls
echo Executing program  - Project By Arfan Shaikh (15CE13/shaikharfan7@gmail.com):
cd src
echo MyShare is running ipconfig for determining ip of this computer.
echo I am logged on as %UserName%.
echo My computer's name is %ComputerName%.
echo My IP settings are
ipconfig | find "IPv4 Address" | find /i /v "suffsix"

java myshare



pause
