/*
 * (c) 2018-2020 Charles-Philip Bentley
 * This code is licensed under MIT license (see LICENSE.txt for details)
 */
package pasa.cbentley.core.src8.ctx;

import pasa.cbentley.core.src4.ctx.ACtx;
import pasa.cbentley.core.src4.ctx.UCtx;

public class C8Ctx extends ACtx {

   
   public C8Ctx(UCtx uc) {
      super(uc);
   }

   public static final int MODULE_ID = 4;

   public int getCtxID() {
      return MODULE_ID;
   }
}
