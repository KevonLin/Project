assume cs:code,ds:data

; 将首字母变大写

data segment
                db '----------------'
                db '1. file         '
                db '2. edit         '
                db '3. search       '
                db '4. view         '
                db '5. options      '
                db '6. help         '
                db '----------------'
data ends

code segment

start:          mov bx,data
                mov ds,bx

                mov bx,0
                mov cx,6
                mov si,3
                
transformUpper:
                mov al,ds:[bx+si+10h]
                and al,11011111b
                mov ds:[bx+si+10h],al
                add bx,16
                loop transformUpper

                mov ax,4c00h
                int 21h

code ends

end start