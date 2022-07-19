assume cs:code

code segment      

            ; 向内存0:200~0：23f传送数据0~63(3fj)
            mov ax,20h
            mov es,ax

            mov bx,0
            mov cx,64

            mov dl,0
            
moveNum:    mov es:[bx],dl
            inc bx
            inc
            loop moveNum

            mov ax,4c00h
            int 21h

code ends

end