/*
 * (c) 2018-2020 Charles-Philip Bentley
 * This code is licensed under MIT license (see LICENSE.txt for details)
 */
package pasa.cbentley.core.src8.ctx;

import pasa.cbentley.core.src4.logging.Dctx;

public class DebugC8 {

   //#mdebug
   
   public void nlThread(Dctx dcx, String title, Thread t) {
      Dctx dc = dcx.newLevel(0);
      if (t == null) {
         dc.append(title + " is null");
      } else {
         dc.append(title);
         dc.appendVarWithSpace("Name", t.getName());
         dc.appendVarWithSpace("Priority", t.getPriority());
         dc.appendVarWithSpace("ID", t.getId());

      }
   }
   
   //#enddebug
}
