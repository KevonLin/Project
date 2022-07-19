assume cs:code

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

code segment

start:      
            mov ax,result
            mov es,ax

            mov bx,0
            mov cx,8

aAddb:      mov ax,a
            mov ds,ax

            mov dx,0
            mov dl,ds:[bx]

            mov ax,b
            mov ds,ax

            add dl,ds:[bx]
            mov es:[bx],dl
            inc bx
            
            loop aAddb

            mov ax,4c00h
            int 21h

code ends

end start