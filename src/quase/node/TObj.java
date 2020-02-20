/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class TObj extends Token
{
    public TObj()
    {
        super.setText("objeto");
    }

    public TObj(int line, int pos)
    {
        super.setText("objeto");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TObj(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTObj(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TObj text.");
    }
}