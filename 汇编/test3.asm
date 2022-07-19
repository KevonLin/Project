assume cs:code
;ffff:0-ffff:f 复制到0:200~0:20f
code segment      

            mov ax,0ffffh
            mov ds,ax

            mov ax,20h
            mov es,ax

            mov bx,0
            mov cx,16


moveNum:
            ;临时存放地址段
            ; push ds
            ;取ffff的数据到dl
            mov dl,ds:[bx]
            ;找0:200
            ; mov ax,20h
            ; mov ds,ax
            ;在dl中存放的ffff的值方瑞0200段
            mov es:[bx],dl

            inc bx
            ;恢复ds地址
            loop moveNum

            mov ax,4c00h
            int 21h

code ends

end