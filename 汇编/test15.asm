assume cs:code,ds:data,ss:stack

data segment
                db 48,49,50,51,52,53
                db 65,66,67,68,69,70
                db 97,98,99,100
                db 'abcdefghijklmn'
data ends

stack segment stack
                db 128 dup(0)
stack ends

code segment

start:          mov bx,stack
                mov ss,bx
                mov sp,128

                mov bx,data
                mov ds,bx

                mov ax,4c00h
                int 21h

code ends

end start