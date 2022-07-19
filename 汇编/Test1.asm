assume cs:code

code segment      

            mov ax,0
            mov cx,123

addNum:     add ax,236
            loop addNum


            mov ax,4c00h
            int 21h

code ends

end