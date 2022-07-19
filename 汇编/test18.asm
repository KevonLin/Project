assume cs:code,ds:data

data segment
                db 'Welcome to masm!'
                db '----------------'
data ends

code segment

start:          mov ax,data
                mov ds,ax

                mov si,0
                mov di,16

                mov cx,8

cpyString:      mov ax,ds:[si]
                mov ds:[si],ax
                ; mov ds:[si+16],ax
                add si,2
                add di,2
                loop cpyString

                mov ax,4c00h
                int 21h

code ends

end start