DATA SEGMENT
SEGMENT1C DW 0
OFF1C DW 0
BOARD DW 24 DUP(?),0FFFFH
Y DB ?;��ǰ��
TY DB ?;�ݴ���
XR DB ?
XL DB ?
NOW DB ?
DIRE DB ?
NXT DB ?
TIM DB 0
SPEED DB 0
CON DB 0
DV DB 0
FLG DB 0
PAD DW   0H,3C0H,  0H,  0H 	;000000000000	000100000000	000000000000   	000100000000
	DW 100H,100H,100H,100H 	;001111000000	000100000000	001111000000	000100000000
	DW   0H,3C0H,  0H,  0H	;000000000000	000100000000	000000000000	000100000000
	DW 100H,100H,100H,100H	;000000000000	000100000000	000000000000	000100000000
	
	DW   0H,180H,180H,  0H 	;000000000000	000000000000	000000000000	000000000000
	DW   0H,180H,180H,  0H	;000110000000	000110000000	000110000000   	000110000000
	DW   0H,180H,180H,  0H	;000110000000	000110000000	000110000000	000110000000
	DW   0H,180H,180H,  0H	;000000000000	000000000000	000000000000	000000000000
	
	DW   0H,380H,200H,  0H 	;000000000000	001000000000	000000000000	000000000000
	DW 200H,200H,300H,  0H	;001110000000	001000000000	000010000000	001100000000
	DW   0H, 80H,380H,  0H	;001000000000	001100000000	001110000000	000100000000
	DW   0H,300H,100H,100H	;000000000000	000000000000	000000000000	000100000000
	
	DW   0H,380H, 80H,  0H 	;000000000000	001100000000	000000000000	000100000000
	DW 300H,200H,200H,  0H	;001110000000	001000000000	001000000000	000100000000
	DW   0H,200H,380H,  0H	;000010000000	001000000000	001110000000	001100000000
	DW 100H,100H,300H,  0H	;000000000000	000000000000	000000000000	000000000000
	
	DW   0H,180H,300H,  0H 	;000000000000   000100000000	000000000000	000100000000
	DW 100H,180H, 80H,  0H	;000110000000	000110000000	000110000000	000110000000	
	DW   0H,180H,300H,  0H	;001100000000	000010000000	001100000000	000010000000
	DW 100H,180H, 80H,  0H	;000000000000	000000000000	000000000000	000000000000
	
	DW   0H,300H,180H,  0H 	;000000000000	000010000000	000000000000	000100000000
	DW  80H,180H,100H,  0H	;001100000000	000110000000	001100000000	000110000000
	DW   0H,300H,180H,  0H	;000110000000	000100000000	000110000000	000010000000
	DW  80H,180H,100H,  0H	;000000000000	000000000000	000000000000	000000000000
	
	DW   0H,380H,100H,  0H 	;000000000000	000100000000	000100000000	000100000000
	DW 100H,180H,100H,  0H	;001110000000	000110000000	001110000000	001100000000
	DW 100H,380H,  0H,  0H	;000100000000	000100000000	000000000000	000100000000
	DW 100H,300H,100H,  0H	;000000000000	000000000000	000000000000	000000000000
P1 DW 4 DUP(?)
P2 DW 4 DUP(?)
COLOR DB 00001001b,00001010b,00001011b,00001100b,00001101b,00001110b,00000001b
NCOLOR DB ?
SCORE DB 5 DUP('0'),'$'
PADMSG DB 25 DUP(219)
TMPMSG DB 25 DUP(?)
STARTMSG1 DB 0DH,0AH,'Select speed.',0DH,0AH,'$'
STARTMSG2 DB 20H,20H,'1. Fast',0DH,0AH,'$'
STARTMSG3 DB 20H,20H,'2. Middle',0DH,0AH,'$'
STARTMSG4 DB 20H,20H,'3. Slow',0DH,0AH,'$'
STARTMSG5 DB 20H,20H,'0. Exit',0DH,0AH,'$'
ENDMSG DB 0DH,0AH,'Good Bye!',0DH,0AH,'$'
SCOREMSG1 DB 201,19 dup(205),187
SCOREMSG2 DB 186,' Score: ',32
SCOREMSG3 DB 32,9 dup(32),186
SCOREMSG4 DB 186,19 dup(32),186
SCOREMSG5 DB 186,19 dup(32),186
SCOREMSG6 DB 186,19 dup(32),186
SCOREMSG7 DB 186,19 dup(32),186,186,19 dup(32),186
SCOREMSG8 DB 204,19 dup(205),185
SCOREMSG9  DB 186,4 dup(32),' Left  : A  ',3 dup(32),186
SCOREMSG10 DB 186,4 dup(32),' Right : D  ',3 dup(32),186
SCOREMSG11 DB 186,4 dup(32),' Rotate: W  ',3 dup(32),186
SCOREMSG12 DB 186,4 dup(32),' Down  : S  ',3 dup(32),186
SCOREMSG13 DB 186,'-------------------',186
SCOREMSG14 DB 186,3 dup(32),' Exit  : Esc ',3 dup(32),186
SCOREMSG15 DB 200,19 dup(205),188
DATA ENDS
STACK SEGMENT STACK
DB 200 DUP(?)
STACK ENDS
CODE SEGMENT
ASSUME 	CS:CODE,DS:DATA,ES:DATA,SS:STACK
START:  MOV AX,DATA
		MOV DS,AX
		PUSH DS							;����DS��ֵ		
		MOV AL,1CH						;����AL = �жϺ�
		MOV AH,35H						;ES:BXΪ���
		INT 21H
		MOV SEGMENT1C,ES				;��ES��ֵ��1C�ж϶�
		MOV OFF1C,BX					;���ù��жϵĵ�ַ
		MOV DX,OFFSET INT1C				;�����Ӻ���INT1Cȡƫ�Ƶ�ַ
		MOV AX,SEG INT1C				;SEG��Ŷε�ַ
		MOV DS,AX
		MOV AL,1CH
		MOV AH,25H						;�����µ��ж�������DS:DXΪ���
		INT 21H
		POP DS
GAMEOVER:
		MOV AH,00H						;������ʾģʽ3��80*25*16ɫ��
		MOV AL,03H						
		INT 10H
SELECTSPEED:
		MOV AH,09H						;��ʾ�ַ���
		MOV DX,OFFSET STARTMSG1			;Select speed.
		INT 21H
		MOV DX,OFFSET STARTMSG2			;1. Fast
		INT 21H
		MOV DX,OFFSET STARTMSG3			;2.	Middle
		INT 21H
		MOV DX,OFFSET STARTMSG4			;3. Slow	
		INT 21H
		MOV DX,OFFSET STARTMSG5			;4. Exit
		INT 21H
		MOV AH,08H						;����һ���ַ�					
		INT 21H
		SUB AL,'0'						
		MOV CL,AL						
		AND AL,3
		CMP AL,CL
		JNE SELECTSPEED					;�������0-3��������
		INC AL
		INC CL
		MUL CL
		CMP CL,1H						;�����0�����
		JZ EXIT
		MOV SPEED,AL					;�����ٶ�
		MOV AH,00H
		MOV AL,12H
		INT 10H							;������ʾģʽ��640*480*16ɫ��
		MOV AH,0BH						;���õ�ɫ�塢����ɫ��߿�
		MOV BH,01						;ѡ���ɫ��
		MOV BL,00H						;ѡ���ɫ��0��RGB��
		INT 10H							;��ʼ��Ϸ
		CALL INITGAME
		CALL BEGIN
		CALL DELAY
		MOV TIM,0H						
LOOP1:  STI								;���ж�
		MOV AL,TIM
		CMP AL,SPEED
		JG TIME
		MOV AH,1
		INT 16H							;������
		JZ LOOP1
		MOV AH,0
		INT 16H							;������
		CMP AL,1BH						;�����Esc�����˳�
		JZ EXIT
		CMP AL,'a'						;����a��ת
		JZ KA
		CMP AL,'w'						;����w��ת
		JZ KW
		CMP AL,'d'						;����d��ת
		JZ KD
		CMP AL,'s'						;����s��ת
		JNZ TIME
KS:   	CALL DELAY						;�����s����һֱ����
		CALL DOWN
		CMP CON,1						;��������������������
		JNE KS							
		CALL BEGIN						
		JMP LOOP1						
KA:     CALL LEFT						;���������ƶ�
		JMP LOOP1
KW: 	CALL ROTATE						;���û���
		JMP LOOP1
KD:		CALL RIGHT						;���������ƶ�
		JMP LOOP1
TIME:   MOV TIM,0H
		CALL DOWN						;��Ȼ����
		CMP CON,0						;
		JE LOOP1
		CALL BEGIN
		JMP LOOP1
EXIT:  									
		MOV AX,0003H					;������ʾģʽ��80*25*16ɫ��
		INT 10H
		MOV AX,DATA
		MOV DS,AX
		MOV DX,OFFSET ENDMSG			
		MOV AH,09H						;��ʾ�ַ���
		INT 21H							
		MOV DX,OFF1C					
		MOV AX,SEGMENT1C				
		MOV DS,AX
		MOV AL,1CH
		MOV AH,25H						
		INT 21H
		MOV AX,4C00H					
		INT 21H							;����dos
INT1C PROC
		STI								;���ж�
		PUSH AX							;����Ĵ���
		PUSH DX							
		MOV AX,DATA						;�����ݶ�DATA����DS��
		MOV DS,AX
		INC TIM
		POP DX
		POP AX							;�ָ��Ĵ���
		IRET							;�жϷ���
		INT1C ENDP
DELAY PROC NEAR							;�ȴ�
		PUSH CX
		MOV CX,00FFH
LOOP20: LOOP LOOP20
		POP CX
		RET
		DELAY ENDP
ROTATE PROC NEAR						
		MOV SI,OFFSET PAD				;ȡ�����ַ
		MOV AL,NOW						;ȡ��������
		MOV AH,0H						
		MOV CL,32						;����5λ
		MUL CL
		ADD SI,AX						;�����ͺŸ�si��ռǰ3λ��
		MOV AL,DIRE						;ȡ����
		INC AL
		AND AL,03H
		MOV AH,0H						
		MOV CL,8						;����3λ
		MUL CL
		ADD SI,AX						;�ѷ����si
		MOV DI,OFFSET P2				;��P2�ĵ�ַ��DI
		MOV CX,04H						
		CLD
LOOP12: PUSH CX
		LODSW							;��SI�����ݼ��ص�AX
		MOV CL,XR						;��XR��CL
		SHR AX,CL						;�߼�����
		MOV CL,XL
		SHL AX,CL						;�߼�����
		STOSW							;��AX�е����ݸ��Ƶ�di�����ڴ�
		POP CX
		LOOP LOOP12
		CALL CHECK
		CMP AL,0H
		JNE SKIP10
		MOV BX,0000H						
		CALL DISPPAD					;���ԭ���ķ���
		CALL COPY21
		INC DIRE
		AND DIRE,3H
		MOV BH,00H
		MOV BL,NCOLOR	
		CALL DISPPAD					;���µķ���
SKIP10: RET
		ROTATE ENDP
RIGHT PROC NEAR
		CALL COPY12
		MOV SI,OFFSET P2
		MOV CX,04H
LOOP7:  MOV AX,[SI]
		SHR AX,1
		MOV [SI],AX
		INC SI
		INC SI
		LOOP LOOP7
		CALL CHECK
		CMP AL,0H
		JNE SKIP6
		MOV BX,0000H
		CALL DISPPAD
		CALL COPY21
		CMP XL,0
		JE SKIP7
		DEC XL
		DEC XR
SKIP7:  INC XR
		MOV BH,00H
		MOV BL,NCOLOR
		CALL DISPPAD
SKIP6:  RET
		RIGHT ENDP
LEFT PROC NEAR
		CALL COPY12
		MOV SI,OFFSET P2
		MOV CX,04H
LOOP10: MOV AX,[SI]
		SHL AX,1
		MOV [SI],AX
		INC SI
		INC SI
		LOOP LOOP10
		CALL CHECK
		CMP AL,0H
		JNE SKIP8
		MOV BX,0000H
		CALL DISPPAD
		CALL COPY21
		CMP XR,0
		JE SKIP9
		DEC XR
		DEC XL
SKIP9:  INC XL
		MOV BH,00H
		MOV BL,NCOLOR
		CALL DISPPAD
SKIP8:  RET
		LEFT ENDP
DOWN PROC NEAR
		CALL COPY12
		INC TY
		CALL CHECK
		CMP AL,0H
		JNE SKIP5
		MOV BX,0000H
		CALL DISPPAD
		CALL COPY21
		MOV BH,00H
		MOV BL,NCOLOR
		CALL DISPPAD
		MOV CON,00H
		RET
SKIP5:  CALL PUT
		MOV CON,01H
		RET
		DOWN ENDP
PUT PROC NEAR							;��������
		MOV BH,0H
		MOV BL,0h
		CALL DISPPAD					;���ԭ�з���
		MOV BH,0H
		MOV BL,01011001b				;������ɫ
		CALL DISPPAD					;��ʾ�·���
		MOV DV,01H						
		MOV AH,0H
		MOV AL,Y
		ADD AL,Y
		MOV SI,OFFSET BOARD
		ADD SI,AX
		MOV DI,00H
		MOV CX,04H
		CLD								;si����
LOOP15: LODSW							;��si��ָ���ݼ��ص�ax
		OR AX,P1[DI]					;					
		MOV [SI-2],AX
		INC DI
		INC DI
		LOOP LOOP15						;��P1�е��������ϵ���Ϸ��
		MOV SI,OFFSET BOARD				;������������
		ADD SI,23*2						;�����һ�п�ʼ
		MOV DI,SI
		MOV CX,20						;ѭ������
		MOV BH,00H						;0ҳ
		MOV FLG,00H						;��־����
		STD								;SI�Լ�
LOOP13: LODSW							;��si�����ݼ��ص�ax
		CMP AX,0FFFFH					;
		JNE SKIP12						;����������ת
		MOV FLG,0FFH
		MOV AL,DV
		SAL AL,1
		MOV DV,AL						;�÷ּ�
		JMP LOOP13
SKIP12: STOSW							;��ax������д��di��ָ���򣨼��������У����������䣩
		CMP FLG,0H
		JE SKIP70						;���û����������ת
		PUSH CX							
		MOV DH,CL						
		ADD DH,03H						;
		MOV DL,0AH						;��������
		MOV BX,0000H					;��ɫ����
		MOV BP,OFFSET PADMSG
		MOV CX,20
		PUSH AX
		MOV AX,1300H					
		INT 10H							;��bp��ָ������ָ�����������ѭ��20�Σ�����������У�
		POP AX
		MOV CL,03H						
		SHL AX,CL						;���ǰ��3��1
		MOV CX,0AH						;��Ϸ��10����
		MOV DL,08H						;�к�
LOOP14: INC DL
		INC DL
		MOV BL,0H
		SHL AX,1
		JNC SKIP11						;�޽�λ��ת
		MOV BL,01011001b				;�䶨�����ض���ɫ��ʾ
SKIP11: CALL DISPCELL
		LOOP LOOP14						;ѭ���������������
		POP CX							
SKIP70: LOOP LOOP13
		MOV AL,DV
		SAR AL,1
		ADD SCORE[3],AL					;һ������������ɺ��ܵ÷�
		MOV CX,05H
		MOV SI,04H
LOOP16: CMP SCORE[SI],'9'				;�÷�ת��
		JNG SKIP13
		INC SCORE[SI-1]
		SUB SCORE[SI],0AH
SKIP13: DEC SI
		LOOP LOOP16
		RET
		PUT ENDP
DISPSCORE PROC NEAR					;��ʾ����
		MOV AX,DATA					
		MOV ES,AX					
		MOV BP,OFFSET SCORE			;��Score�ĵ�ַ��BP	
		MOV CX,05H					;�ַ�������
		MOV DX,0635H				;��ʼλ��
		MOV BH,0H					;ҳ��
		MOV AL,0H					;����ַ��������귵����ʼλ��
		MOV BL,00110100B			;�ַ�����
		MOV AH,13H
		INT 10H						;���
		RET
		DISPSCORE ENDP
DISPNEXT PROC NEAR					;��ʾ��һ������
		MOV AX,DATA
		MOV ES,AX
		MOV BP,OFFSET TMPMSG		;��TMPMSG�ĵ�ַ��BP
		MOV DI,BP					;��TMPMSG�ĵ�ַ��DI
		MOV SI,OFFSET PAD			;��PAD�ĵ�ַ��SI
		MOV AL,NXT					;������������AL
		MOV AH,0					
		MOV BL,32					;���������5λ
		MUL BL
		ADD SI,AX					;si = 0[al]00000
		CLD							;��ǰ�����ȡ
		MOV CX,04H					;4���ַ�
LOOP8:  PUSH CX						;����CX��ֵ
		LODSW						;��si��ȡһ���ֵ�AX
		MOV CL,06H
		SHL AX,CL					;����6λ���ǰ��0(ax������Ϊ0000+[pad]��12λ��)
		MOV CX,04H					;���һ��4��1
LOOP9:  MOV BL,20H					;��BL�ո��ASCII��
		SHL AX,1					;�߼�����һλ����λ��CFλ
		JNC SKIP2					;���CF����1����ת
		MOV BL,219					;���CF��1��BL��ֵ��Ϊ�����ASCII
SKIP2:  MOV [DI],BL					;��BL��ֵ����TMPMSG
		INC DI						;����
		MOV [DI],BL					
		INC DI
		LOOP LOOP9					;ѭ���������е���1��λ��
		MOV DX,0C30H				;��ʼλ��
		POP CX						;��ԭcx��ֵ
		SUB DH,CL					;�кż�
		PUSH CX						;����cx��ֵ
		MOV CX,08H					;�ַ�������
		MOV BH,0H					;ҳ��
		PUSH SI						;����si��ֵ
		MOV AH,0H					
		MOV AL,NXT					;��ax��ֵλNXT
		MOV SI,AX					
		MOV BL,COLOR[SI]			;������ɫ����
		POP SI
		MOV AX,1300H				;��ʾ�ַ���
		INT 10H
		POP CX						;��ԭcx��ֵ
		MOV DI,BP					;��BP��ֵ��DI
		LOOP LOOP8					;ѭ��������������
		RET
		DISPNEXT ENDP
COPY21 	PROC NEAR
		CLD							;��ǰ�������ַ���
		MOV SI,OFFSET P2
		MOV DI,OFFSET P1
		MOV CX,08				
		REP MOVSB					;����P2����P1��
		MOV CL,TY
		MOV Y,CL
		RET
		COPY21 ENDP
COPY12 	PROC NEAR
		CLD
		MOV SI,OFFSET P1
		MOV DI,OFFSET P2
		MOV CX,08
		REP MOVSB
		MOV CL,Y
		MOV TY,CL
		RET
		COPY12 ENDP
BEGIN PROC NEAR
		MOV AL,NXT
		MOV NOW,AL
		CALL RANDOM					;�����������
		CALL DISPSCORE				;��ʾ����
		CALL DISPNEXT				;������һ������
		MOV DIRE,0					;�ó�ʼ����Ϊ0
		MOV Y,4						;���ֵ
		MOV TY,4					
		MOV XR,0					
		MOV XL,0
		MOV AH,0
		MOV AL,NOW					;��ax����ΪNOW
		MOV SI,AX					;��AX��ֵ����SI
		MOV CL,COLOR[SI]			;����ɫ����ֵ����cl
		MOV NCOLOR,CL				;��NCOLOR������ɫ����
		MOV DI,OFFSET P2			;��P2�ĵ�ַ��DI
		MOV SI,OFFSET PAD			;��PAD�ĵ�ַ��SI
		MOV BL,32					
		MUL BL						;����5λ
		ADD SI,AX					;
		MOV CX,08					
		CLD
		REP MOVSB					;��SI��ָ�����ݸ��Ƹ�DI��ָ����
		CALL COPY21					
		MOV BH,0H					;0ҳ
		MOV BL,NCOLOR				;��ɫ����
		CALL DISPPAD
		CALL CHECK
		CMP AL,0
		JE SKIP1
		MOV DL,07H
		MOV AH,02H
		INT 21H
		MOV AH,08H
		INT 21H
		JMP GAMEOVER
SKIP1:  CALL DELAY
		MOV TIM,0H
		RET
		BEGIN ENDP
CHECK PROC NEAR 					;����AL=0��F 0ΪOK FΪNO
		MOV AH,0H
		MOV AL,TY
		ADD AL,TY
		MOV SI,OFFSET BOARD			;�ѵ�ǰ����Ϸ������ص�SI
		ADD SI,AX					;
		MOV DI,00H
		MOV CX,04H
		CLD
LOOP6:  LODSW						;��SI�е����ݼ��ص�AX
		AND AX,P2[DI]				;
		JNZ SKIP4
		INC DI
		INC DI
		LOOP LOOP6					;ѭ���ж�
		MOV AL,00H
		RET
SKIP4:  MOV AL,0FH
		RET
		CHECK ENDP
DISPPAD PROC NEAR 					
		MOV SI,OFFSET P1			;��P1�ĵ�ַ��SI
		MOV CX,04H					;ѭ������
		MOV DL,08H
		MOV DH,Y
		ADD DH,04H					;��������
		PUSH DX
		CLD							;��ǰ����
LOOP2:  LODSW						;��si�е����ݼ��ص�AX
		POP DX
		PUSH DX
		SUB DH,CL					;��ʼ�иı�
		PUSH CX						
		MOV CL,03H					
		SHL AX,CL					;����3λ
		MOV CX,0AH					;ѭ��������10λ��
LOOP3:  INC DL						
		INC DL						;������
		SHL AX,1					;����һλ
		JNC SKIP3					;û�н�λ����ת
		CALL DISPCELL				;�н�λ����ʾ����
SKIP3:  LOOP LOOP3					
		POP CX
		LOOP LOOP2					;������������
		POP DX
		RET
		DISPPAD ENDP
DISPCELL PROC NEAR 					;DH=ROW DL=COL BH=PAGE BL=COLOR
		PUSH AX
		PUSH BX
		PUSH CX
		PUSH DX
		PUSH DI
		PUSH SI						;����Ĵ���
		MOV BP,OFFSET PADMSG		;��PADMSG�ĵ�ַ����BP
		MOV CX,02H					;
		MOV AX,1300H				;��BP��ָ��ַ��������ʾ����
		INT 10H						;��ԭ����λ�ô��ķ���Ϳ�ɱ���ɫ
		CMP BL,0H					;
		JE SKIP20					;���������ԭ���ķ�����ת
		MOV AH,0H					
		MOV AL,DH					;�кŴ�AL
		MOV CL,16
		MUL CL						;����4λ
		MOV SI,AX					
		MOV AH,0H					
		MOV AL,DL					;�кŴ�AL
		MOV CL,8					;����3λ
		MUL CL
		MOV DI,AX					;
		MOV AX,0C00H				;AH = 0CH����ʾ��ʾһ��
		MOV DX,SI					;DX��Y����
		ADD DX,15					
		MOV CX,16					;CX��X����
LOOP21: ADD CX,DI
		DEC CX
		INT 10H
		INC CX
		SUB CX,DI
		LOOP LOOP21					;ѭ����ʾһС�����㣨�������ã�
		MOV DX,SI
		MOV CX,15
		ADD DI,15
LOOP22: PUSH CX
		MOV CX,DI
		INT 10H
		INC DX
		POP CX
		LOOP LOOP22
		SUB DI,2
		DEC DX
		MOV CX,13
LOOP23: PUSH CX
		DEC DX
		MOV CX,DI
		INT 10H
		SUB CX,12
		MOV AL,07H
		INT 10H
		MOV AL,00H
		POP CX
		LOOP LOOP23
		MOV AX,0C07H
		MOV DX,SI
		ADD DX,1
		MOV CX,12
		SUB DI,12
LOOP24: ADD CX,DI
		INT 10H
		SUB CX,DI
		LOOP LOOP24					;�����ĺ����������������һ���������У�������ʾ�ķ����������
SKIP20: POP SI
		POP DI
		POP DX
		POP CX
		POP BX
		POP AX						;��ԭ�Ĵ�����ֵ
		RET
		DISPCELL ENDP
CLS PROC NEAR						;��������
		MOV CX,0					;CH = ���Ͻ��кţ�CL = ���Ͻ��к�
		MOV DH,24					;DH = ���½��к�
		MOV DL,79					;DL = ���½��к�
		MOV BH,0					;BH = ����������
		MOV AX,600H					;��ʼ����Ļ,AL = 0ȫ��ĻΪ�հ�
		INT 10H
		RET
		CLS ENDP
RANDOM PROC NEAR
LOOP5:  IN AX,40H					;��ʼ���ѡ�񷽿�����,al=ʱ�����ֵ
		INC AL
		AND AL,07H				
		CMP AL,07H
		JE LOOP5					;ѡ��0-6֮�������
		MOV NXT,AL					;��AL��ֵ����NXT
		RET
		RANDOM ENDP
INITGAME PROC NEAR
		CALL CLS					;��ʼ����Ļ
		MOV AX,DATA
		MOV ES,AX
		MOV CX,15					;���Ͻ��� = 00h�����Ͻ��� = 15h
		MOV BP,OFFSET SCOREMSG1		;��SCOREMSG1�ĵ�ַ����BP�����������ַ
		MOV DX,0529H				;DH = ��ʼ�У�DL = ��ʼ��
LOOP72: PUSH CX
		MOV CX,21					;������
		MOV AL,0H					;����ַ�������귵����ʼλ��
		MOV BH,0H					;BH = ҳ��
		MOV BL,01011010B			;BL��ɫ����ΪIRGB|IRGB����4λ�Ǳ���ɫ����4λ��ǰ��ɫ
		MOV AH,13H					;��ʾ�ַ���
		INT 10H						;����
		ADD BP,21					;��һ���ַ���
		INC DH						;��ʼ�кż�
		POP CX
		LOOP LOOP72					
		MOV BP,OFFSET PADMSG		;��PADMSG�ĵ�ַ����BP
		MOV CX,24					
		MOV DX,0308H				
		MOV BH,0H
		MOV AL,0H
		MOV BL,00110100B
		MOV AH,13H
		INT 10H						;����Ϸ�����϶�
		MOV DX,1808H
		INT 10H						;����Ϸ�����¶�
		MOV CX,20
		MOV DX,0308H				;��20����ֱ���еķ���
LOOP4:  MOV SI,CX
		MOV CX,02
		INC DH
		INT 10H
		MOV CX,SI
		LOOP LOOP4
		MOV CX,20
		MOV DX,031EH
LOOP11: MOV SI,CX
		MOV CX,02
		INC DH
		INT 10H
		MOV CX,SI
		LOOP LOOP11					
		CLD							;��ǰ������
		MOV DI,OFFSET BOARD			;��BOARD�ĵ�ַ��DI
		MOV CX,24					;������Ϸ��
		MOV AX,0E007H				;1110000000000111��0Ϊ��Ϸ����24��
		REP STOSW					;��ax�е�ֵ������ES:DIָ��ĵ�ַ
		MOV DI,OFFSET SCORE			;��������
		MOV AL,'0'
		MOV CX,05H
		REP STOSB					;��al�е�ֵ������ES:DIָ��ĵ�ַ
		CALL RANDOM					;�����������
		MOV AL,NXT
		MOV NOW,AL
		RET
		INITGAME ENDP
		CODE ENDS
END START