assume cs:code,ds:data,ss:stack

data segment
                db 'abcdEFGH'
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
                mov bx,0
                mov cx,4

transformUpper: mov al,ds:[bx]
                and al,11011111b
                mov ds:[bx],al
                inc bx
                loop transformUpper               
                ;    01100001 a
                ;    01000001 A

                mov cx,4

transformLower: mov al,ds:[bx]
                or  al,00100000b
                mov ds:[bx],al
                inc bx
                loop transformLower

                mov ax,4c00h
                int 21h

code ends

end start