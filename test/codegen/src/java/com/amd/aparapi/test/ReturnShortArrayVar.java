package com.syncleus.aparapi.test;

public class ReturnShortArrayVar{

   short[] returnShortArrayVar() {
      short[] shorts = new short[1024];
      return shorts;
   }

   public void run() {

      returnShortArrayVar();
   }
}
/**{Throws{ClassParseException}Throws}**/