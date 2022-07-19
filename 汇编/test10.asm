assume cs:code,ds:data,ss:stack

data segment
            dw 0123h,0456h,0789h,0abch,0defh,0fedh,0cbah,0987h
data ends

stack segment stack
            dw 0,0,0,0,0,0,0,0
            dw 0,0,0,0,0,0,0,0
stack ends

code segment
start:      mov ax,stack
            mov ss,ax
            mov sp,32

            mov ax,data
            mov ds,ax

            mov bx,0
            mov cx,8

pushData:   push ds:[bx]
            add bx,2
            loop pushData

            mov bx,0
            mov cx,8

popData:    pop ds:[bx]
            add bx,2
            loop popData

            mov ax,4c00h
            int 21h

code ends

end start