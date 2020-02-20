/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class TEntao extends Token
{
    public TEntao()
    {
        super.setText("ent�o");
    }

    public TEntao(int line, int pos)
    {
        super.setText("ent�o");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEntao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEntao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEntao text.");
    }
}