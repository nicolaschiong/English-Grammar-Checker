/* Generated By:JavaCC: Do not edit this line. MyNewGrammarTokenManager.java */

/** Token Manager. */
public class MyNewGrammarTokenManager implements MyNewGrammarConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 47);
      case 41:
         return jjStopAtPos(0, 48);
      case 42:
         return jjStopAtPos(0, 51);
      case 43:
         return jjStopAtPos(0, 49);
      case 44:
         return jjStopAtPos(0, 45);
      case 45:
         return jjStopAtPos(0, 50);
      case 46:
         return jjStopAtPos(0, 44);
      case 47:
         return jjStopAtPos(0, 52);
      case 59:
         return jjStopAtPos(0, 46);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 165;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAddTwoStates(163, 164);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 5:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(2, 3);
                  break;
               case 9:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(4, 5);
                  break;
               case 13:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(6, 7);
                  break;
               case 17:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(8, 9);
                  break;
               case 21:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(10, 11);
                  break;
               case 25:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(12, 13);
                  break;
               case 29:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(14, 15);
                  break;
               case 34:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(16, 17);
                  break;
               case 39:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(18, 19);
                  break;
               case 43:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(20, 21);
                  break;
               case 47:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(22, 23);
                  break;
               case 51:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(24, 25);
                  break;
               case 56:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(26, 27);
                  break;
               case 61:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(28, 29);
                  break;
               case 67:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(30, 31);
                  break;
               case 72:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 73:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(32, 33);
                  break;
               case 77:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 76;
                  break;
               case 78:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(34, 35);
                  break;
               case 82:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 83:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(36, 37);
                  break;
               case 84:
                  if (curChar == 36 && kind > 27)
                     kind = 27;
                  break;
               case 88:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 89:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(38, 39);
                  break;
               case 92:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 93:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(40, 41);
                  break;
               case 97:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 96;
                  break;
               case 98:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(42, 43);
                  break;
               case 102:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 101;
                  break;
               case 103:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(44, 45);
                  break;
               case 106:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 105;
                  break;
               case 107:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(46, 47);
                  break;
               case 111:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 110;
                  break;
               case 112:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(48, 49);
                  break;
               case 115:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 114;
                  break;
               case 116:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(50, 51);
                  break;
               case 119:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 118;
                  break;
               case 120:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(52, 53);
                  break;
               case 123:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 122;
                  break;
               case 124:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(54, 55);
                  break;
               case 128:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 127;
                  break;
               case 129:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(56, 57);
                  break;
               case 133:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 132;
                  break;
               case 134:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(58, 59);
                  break;
               case 138:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 137;
                  break;
               case 139:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(60, 61);
                  break;
               case 143:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 142;
                  break;
               case 144:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(62, 63);
                  break;
               case 148:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 147;
                  break;
               case 149:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(64, 65);
                  break;
               case 152:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 151;
                  break;
               case 153:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(66, 67);
                  break;
               case 154:
                  if (curChar == 36 && kind > 42)
                     kind = 42;
                  break;
               case 157:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 156;
                  break;
               case 158:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(68, 69);
                  break;
               case 163:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(163);
                  break;
               case 164:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(164);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(70, 140);
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(2, 5);
                  break;
               case 3:
                  if (curChar == 67 && kind > 9)
                     kind = 9;
                  break;
               case 4:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(6, 9);
                  break;
               case 7:
                  if (curChar == 68 && kind > 10)
                     kind = 10;
                  break;
               case 8:
                  if (curChar == 67)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 10:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 13);
                  break;
               case 11:
                  if (curChar == 84 && kind > 11)
                     kind = 11;
                  break;
               case 12:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 14:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(14, 17);
                  break;
               case 15:
                  if (curChar == 88 && kind > 12)
                     kind = 12;
                  break;
               case 16:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 18:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(18, 21);
                  break;
               case 19:
                  if (curChar == 87 && kind > 13)
                     kind = 13;
                  break;
               case 20:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 22:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(22, 25);
                  break;
               case 23:
                  if (curChar == 78 && kind > 14)
                     kind = 14;
                  break;
               case 24:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 26:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(26, 29);
                  break;
               case 27:
                  if (curChar == 74 && kind > 15)
                     kind = 15;
                  break;
               case 28:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 30:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(30, 34);
                  break;
               case 31:
                  if (curChar == 82 && kind > 16)
                     kind = 16;
                  break;
               case 32:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 35:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(35, 39);
                  break;
               case 36:
                  if (curChar == 83 && kind > 17)
                     kind = 17;
                  break;
               case 37:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 38:
                  if (curChar == 74)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 40:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(40, 43);
                  break;
               case 41:
                  if (curChar == 83 && kind > 18)
                     kind = 18;
                  break;
               case 42:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 44:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(44, 47);
                  break;
               case 45:
                  if (curChar == 68 && kind > 19)
                     kind = 19;
                  break;
               case 46:
                  if (curChar == 77)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 48:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(48, 51);
                  break;
               case 49:
                  if (curChar == 78 && kind > 20)
                     kind = 20;
                  break;
               case 50:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 52:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(52, 56);
                  break;
               case 53:
                  if (curChar == 83 && kind > 21)
                     kind = 21;
                  break;
               case 54:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 57:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(57, 61);
                  break;
               case 58:
                  if (curChar == 80 && kind > 22)
                     kind = 22;
                  break;
               case 59:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 60:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 59;
                  break;
               case 62:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(62, 67);
                  break;
               case 63:
                  if (curChar == 83 && kind > 23)
                     kind = 23;
                  break;
               case 64:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 66:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 68:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(68, 72);
                  break;
               case 69:
                  if (curChar == 84 && kind > 24)
                     kind = 24;
                  break;
               case 70:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 70;
                  break;
               case 73:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(73, 77);
                  break;
               case 74:
                  if (curChar == 83 && kind > 25)
                     kind = 25;
                  break;
               case 75:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 74;
                  break;
               case 76:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 78:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(78, 82);
                  break;
               case 79:
                  if (curChar == 80 && kind > 26)
                     kind = 26;
                  break;
               case 80:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 83:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(83, 88);
                  break;
               case 85:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 84;
                  break;
               case 86:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 85;
                  break;
               case 87:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 89:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(89, 92);
                  break;
               case 90:
                  if (curChar == 66 && kind > 28)
                     kind = 28;
                  break;
               case 91:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 93:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(93, 97);
                  break;
               case 94:
                  if (curChar == 82 && kind > 29)
                     kind = 29;
                  break;
               case 95:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 96:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 98:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(98, 102);
                  break;
               case 99:
                  if (curChar == 83 && kind > 30)
                     kind = 30;
                  break;
               case 100:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 99;
                  break;
               case 101:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 100;
                  break;
               case 103:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(103, 106);
                  break;
               case 104:
                  if (curChar == 80 && kind > 31)
                     kind = 31;
                  break;
               case 105:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 104;
                  break;
               case 107:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(107, 111);
                  break;
               case 108:
                  if (curChar == 77 && kind > 32)
                     kind = 32;
                  break;
               case 109:
                  if (curChar == 89)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 110:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 109;
                  break;
               case 112:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(112, 115);
                  break;
               case 113:
                  if (curChar == 79 && kind > 33)
                     kind = 33;
                  break;
               case 114:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 113;
                  break;
               case 116:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(116, 119);
                  break;
               case 117:
                  if (curChar == 72 && kind > 34)
                     kind = 34;
                  break;
               case 118:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 117;
                  break;
               case 120:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(120, 123);
                  break;
               case 121:
                  if (curChar == 66 && kind > 35)
                     kind = 35;
                  break;
               case 122:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 121;
                  break;
               case 124:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(124, 128);
                  break;
               case 125:
                  if (curChar == 90 && kind > 36)
                     kind = 36;
                  break;
               case 126:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 125;
                  break;
               case 127:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 126;
                  break;
               case 129:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(129, 133);
                  break;
               case 130:
                  if (curChar == 68 && kind > 37)
                     kind = 37;
                  break;
               case 131:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 130;
                  break;
               case 132:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 131;
                  break;
               case 134:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(134, 138);
                  break;
               case 135:
                  if (curChar == 78 && kind > 38)
                     kind = 38;
                  break;
               case 136:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 135;
                  break;
               case 137:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 136;
                  break;
               case 139:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(139, 143);
                  break;
               case 140:
                  if (curChar == 71 && kind > 39)
                     kind = 39;
                  break;
               case 141:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 140;
                  break;
               case 142:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 141;
                  break;
               case 144:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(144, 148);
                  break;
               case 145:
                  if (curChar == 84 && kind > 40)
                     kind = 40;
                  break;
               case 146:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 145;
                  break;
               case 147:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 146;
                  break;
               case 149:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(149, 152);
                  break;
               case 150:
                  if (curChar == 80 && kind > 41)
                     kind = 41;
                  break;
               case 151:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 150;
                  break;
               case 153:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(153, 157);
                  break;
               case 155:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 154;
                  break;
               case 156:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 155;
                  break;
               case 158:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(158, 161);
                  break;
               case 159:
                  if (curChar == 66 && kind > 43)
                     kind = 43;
                  break;
               case 160:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 159;
                  break;
               case 161:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 160;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 165 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 5, 6, 9, 10, 13, 14, 17, 18, 21, 22, 25, 26, 29, 30, 34, 
   35, 39, 40, 43, 44, 47, 48, 51, 52, 56, 57, 61, 62, 67, 68, 72, 
   73, 77, 78, 82, 83, 88, 89, 92, 93, 97, 98, 102, 103, 106, 107, 111, 
   112, 115, 116, 119, 120, 123, 124, 128, 129, 133, 134, 138, 139, 143, 144, 148, 
   149, 152, 153, 157, 158, 161, 1, 2, 5, 6, 9, 10, 13, 14, 17, 18, 
   21, 22, 25, 26, 29, 30, 34, 35, 39, 40, 43, 44, 47, 48, 51, 52, 
   56, 57, 61, 62, 67, 68, 72, 73, 77, 78, 82, 83, 88, 89, 92, 93, 
   97, 98, 102, 103, 106, 107, 111, 112, 115, 116, 119, 120, 123, 124, 128, 129, 
   133, 134, 138, 139, 143, 144, 148, 149, 152, 153, 157, 158, 161, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, "\56", "\54", "\73", "\50", "\51", "\53", "\55", "\52", "\57", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffffffffffee1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[165];
static private final int[] jjstateSet = new int[330];
static protected char curChar;
/** Constructor. */
public MyNewGrammarTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public MyNewGrammarTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 165; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
