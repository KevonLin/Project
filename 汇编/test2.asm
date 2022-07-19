assume cs:code
;ffff:0-ffff:f 字节型数据相加存入dx
code segment      

            mov ax,0ffffh
            mov ds,ax

            mov bx,0
            mov cx,16
            mov bx,0
            mov ax,0

addNum:     mov al,ds:[bx]
            add dx,ax
            inc bx
            loop addNum

            mov ax,4c00h
            int 21h

code ends

end