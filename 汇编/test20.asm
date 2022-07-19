assume cs:code,ds:data,ss:stack

; 将每个字母变大写

stack segment stack
                db 128 dup(0)
stack ends

data segment
                db '----------------'
                db '1. file         '
                db '2. edit         '
                db '3. view         '
                db '4. help         '
                db '----------------'
data ends



code segment

start:          
                mov ax,stack
                mov ss,ax
                mov sp,128

                mov bx,data
                mov ds,bx

                mov bx,0
                mov cx,4
transformUpper:
                push cx
                mov cx,4
                mov si,3
                
transformUpperinner:
                mov al,ds:[bx+si+10h]
                and al,11011111b
                mov ds:[bx+si+10h],al
                inc si
                loop transformUpperinner

                pop cx
                add bx,16
                loop transformUpper

                mov ax,4c00h
                int 21h

code ends

end start