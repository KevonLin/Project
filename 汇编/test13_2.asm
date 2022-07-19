assume cs:code,ss:stack

; a+b 放入c中

a segment
        db 1,2,3,4,5,6,7,8
a ends

b segment
        db 1,2,3,4,5,6,7,8
b ends

result segment
        db 0,0,0,0,0,0,0,0
result ends

stack segment stack
                db 128 dup(0)
stack ends

code segment

start:          mov bx,stack
                mov ss,bx
                mov sp,128

                mov bx,result
                mov es,bx
                mov cx,8
                
                mov bx,0

addLoop:        mov ax,a
                mov ds,ax
                mov al,ds:[bx]
                add al,ds:[bx+16]
                mov es:[bx],al
                inc bx
                loop addLoop

                mov ax,4c00h
                int 21h

code ends

end start