assume cs:code

; push a前八个字数据逆序复制到b中

a segment
                dw 1,2,3,4,5,6,7,8,0ah,0bh,0ch,0dh,0eh,0fh,0ffh
a ends

b segment
                dw 0,0,0,0,0,0,0,0
b ends

code segment

start:          mov ax,a
                mov ds,ax
        
                mov ax,b
                mov ss,ax
                mov sp,16
        
                mov bx,0
                mov cx,8

pushData:       push ds:[bx]
                add bx,2
                loop pushData

                mov ax,4c00h
                int 21h

code ends

end start