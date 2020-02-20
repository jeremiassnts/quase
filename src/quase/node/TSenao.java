/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class TSenao extends Token
{
    public TSenao()
    {
        super.setText("sen�o");
    }

    public TSenao(int line, int pos)
    {
        super.setText("sen�o");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSenao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSenao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSenao text.");
    }
}
