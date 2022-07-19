assume cs:code

code segment      

            dw 0123h,0456h,0789h,0abch,0defh,0fedh,0cbah,0987h

            dw 0,0,0,0,0,0,0,0
            dw 0,0,0,0,0,0,0,0  ;32byte stack space

start:      mov ax,cs
            mov ss,ax
            mov sp,48

            mov bx,0
            mov cx,8

pushData:   push cs:[bx]
            add bx,2
            loop pushData

            mov bx,0
            mov cx,8

popData:    pop cs:[bx]
            add bx,2
            loop popData

            mov ax,4c00h
            int 21h

code ends

end start