/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Fernando
 */
public class NothingExpression extends Expression {
    
   public NothingExpression (SourcePosition thePosition) {
    super (thePosition);
  }

  public Object visit(Visitor v, Object o) {
    return v.visitNothingExpression(this, o);
  }
}
