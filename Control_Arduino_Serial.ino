
#include <Servo.h>

//Declaração das variáveis
int var2 = 0;
int var3 = 0;
int var4 = 0;
int var5 = 0;
int var6 = 0;
int var7 = 0;
int var8 = 0;
int var9 = 0;
int var10 = 0;
int var11 = 0;
int var12 = 0;
int var13 = 0;
int dados=0;
int Analog=0;
int tempAnalog=0;
int varA0 = 90;
int varA1 = 90;
Servo servo1;
Servo servo2;

////////////////////////
void setup() {
  Serial.begin(19200);
  
  //configurando pinos como Saída
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  
}
void loop() {
  
  //Aguarda dados na porta serial, padrao:  "'caractere''valor'", ex:  " A255 " atribue o valor 255 no pino 2 pwm, caso for um pino digital usar 0 ou 1. (usar \n no final de cada comando)
  if (Serial.available() > 0)
  {
       dados=Serial.read();
       
       //atribue os valores conforme os dados recebidos: 
       switch (dados){
        case 'A':        
          var2 = Serial.parseInt();
          digitalWrite(2, var2);
          break;        
        case 'G':
          var3 = Serial.parseInt();
          analogWrite(3, var3);
          break;
        case 'B':
          var4 = Serial.parseInt();
          digitalWrite(4, var4);
          break;
        case 'H':
          var5 = Serial.parseInt();
          analogWrite(5, var5);
          break;
        case 'I':
          var6 = Serial.parseInt();
          analogWrite(6, var6);
          break;
        case 'C':
          var7 = Serial.parseInt();
          digitalWrite(7, var7);
          break;
        case 'D':
          var8 = Serial.parseInt();
          digitalWrite(8, var8);
          break;
        case 'J':
          var9 = Serial.parseInt();
          analogWrite(9, var9);
          break;
        case 'K':
          var10 = Serial.parseInt();
          analogWrite(10, var10);
          break;
        case 'L':
          var11 = Serial.parseInt();
          analogWrite(11, var11);
          break;
        case 'E':
          var12 = Serial.parseInt();
          digitalWrite(12, var12);
          break;
        case 'F':
          var13 = Serial.parseInt();
          digitalWrite(13, var13);
          break;
        case 'M':
          servo1.attach(A0);
          varA0 = Serial.parseInt();
          servo1.write(varA0);
          break;
        case 'N':
          servo2.attach(A1);
          varA1 = Serial.parseInt();
          servo2.write(varA1);
          break;  

        }
    }

}


