assume cs:code,ds:data,ss:stack

data segment
                db 'BAsic'
                db 'maTCH'
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
                mov cx,5

transform:      mov al,ds:[bx]
                and al,11011111b
                mov ds:[bx],al

                mov al,ds:[bx+5]
                or  al,00100000b
                mov ds:[bx+5],al
                inc bx
                loop transform    

                mov ax,4c00h
                int 21h

code ends

end start