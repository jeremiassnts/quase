/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class TDetProcInicial extends Token
{
    public TDetProcInicial()
    {
        super.setText("=>");
    }

    public TDetProcInicial(int line, int pos)
    {
        super.setText("=>");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDetProcInicial(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDetProcInicial(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDetProcInicial text.");
    }
}