/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class TPontoVirg extends Token
{
    public TPontoVirg()
    {
        super.setText(";");
    }

    public TPontoVirg(int line, int pos)
    {
        super.setText(";");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPontoVirg(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPontoVirg(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPontoVirg text.");
    }
}
