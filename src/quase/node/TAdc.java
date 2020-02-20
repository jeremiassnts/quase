/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class TAdc extends Token
{
    public TAdc()
    {
        super.setText("+");
    }

    public TAdc(int line, int pos)
    {
        super.setText("+");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAdc(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAdc(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAdc text.");
    }
}